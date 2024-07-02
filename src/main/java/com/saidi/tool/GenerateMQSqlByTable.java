package com.saidi.tool;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.text.StrBuilder;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateMQSqlByTable {

    public static void main(String[] args) throws IOException {
        // 数据库连接信息
        String dbName = "data_collection_sharing";
        String dbUrl = "jdbc:mysql://localhost:3306/" + dbName;
        String dbUser = "root";
        String dbPassword = "";
        //表名称
        String tableName = "dwd_base_prod_cate";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        List<String> primaryKeyList = new ArrayList<>();

        List<String> fieldList = new ArrayList<>();

        try {
            // 加载 MySQL JDBC 驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 创建数据库连接
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // 创建Statement对象
            statement = connection.createStatement();

            // 执行SQL查询
            String query = "SHOW COLUMNS FROM " + tableName;
            resultSet = statement.executeQuery(query);
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet primaryKeys = databaseMetaData.getPrimaryKeys(null, "data_collection_sharing", tableName);
            while (primaryKeys.next()) {
                String columnName = primaryKeys.getString("COLUMN_NAME");
                primaryKeyList.add(columnName);
            }
            while (resultSet.next()) {
                String columnName = resultSet.getString("Field");
                fieldList.add(columnName);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (CollectionUtil.isEmpty(fieldList)) {
            return;
        }
        //INSERT INTO `data_collection_sharing`.`dwd_base_prod_cate` (`comp_id`, `prod_cate_code`, `prod_cate_cn_name`, `prod_cate_en_name`, `creator_no`, `create_date`, `final_updater_no`, `final_update_date`, `prior_seq`, `status`) VALUES (#{comp_id},#{prod_cate_code},#{prod_cate_cn_name},#{prod_cate_en_name},#{creator_no},#{create_date},#{final_updater_no},#{final_update_date},#{prior_seq},#{status});

        StrBuilder insertSQL = new StrBuilder("INSERT INTO `data_collection_sharing`.`").append(tableName).append("` (`");
        StrBuilder updateSQL = new StrBuilder("UPDATE `data_collection_sharing`.`").append(tableName).append("` SET `");
        StrBuilder delSql = new StrBuilder("DELETE FROM `data_collection_sharing`.`").append(tableName).append("` WHERE `");
        for (int i = 0; i < fieldList.size(); i++) {
            if (i != fieldList.size() -1){
                insertSQL.append(fieldList.get(i)).append("`, `");
            }else {
                insertSQL.append(fieldList.get(i)).append("`");
            }
        }
        insertSQL.append(") VALUES ( ");
        for (int i = 0; i < fieldList.size(); i++) {
            if (i != fieldList.size() -1){
                insertSQL.append("IF( #{").append(fieldList.get(i)).append("} = ' ', null , #{").append(fieldList.get(i)).append("}),");
            }else {
                insertSQL.append("IF( #{").append(fieldList.get(i)).append("} = ' ', null , #{").append(fieldList.get(i)).append("}));");
            }
        }
        System.out.println(insertSQL);


        List<String> valueList = new ArrayList<>();
        for (String s : fieldList) {
            if (primaryKeyList.contains(s)){
                continue;
            }
            valueList.add(s);
        }
        for (int i = 0; i < valueList.size(); i++) {
            if (i != valueList.size() - 1) {
                updateSQL.append(valueList.get(i)).append("` =IF( #{").append(valueList.get(i)).append("} = ' ',null,").append("#{").append(valueList.get(i)).append("}), `");
            } else {
                updateSQL.append(valueList.get(i)).append("` =IF( #{").append(valueList.get(i)).append("} = ' ',null,").append("#{").append(valueList.get(i)).append("}) WHERE `");
            }
        }

        for (int i = 0; i < primaryKeyList.size(); i++) {
            if (i != primaryKeyList.size() - 1) {
                delSql.append(primaryKeyList.get(i)).append("` = #{").append(primaryKeyList.get(i)).append("} AND `");
                updateSQL.append(primaryKeyList.get(i)).append("` = #{").append(primaryKeyList.get(i)).append("} AND `");
            } else {
                delSql.append(primaryKeyList.get(i)).append("` = #{").append(primaryKeyList.get(i)).append("};");
                updateSQL.append(primaryKeyList.get(i)).append("` = #{").append(primaryKeyList.get(i)).append("};");
            }
        }
        System.out.println(updateSQL);
        System.out.println(delSql);
    }

}
