package com.saidi.tool;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 根据表字段生成查询语句
 */
public class GenerateSQLAndJSONByField {

    public static void main(String[] args) throws IOException {
        // 数据库连接信息
        String dbName = "data_collection_sharing";
        //表名称
        String tableName = "test";

       List<String> fieldList = Arrays.asList(
               "prod_line_id",
               "equip_key_id",
               "prod_line_code",
               "prod_line_code",
               "comp_id",
               "prod_line_name",
               "prod_line_short_name",
               "run_stat",
               "craft_unit",
               "craft_unit_no",
               "manf_code",
               "proc_name",
               "iron_mes_prod_line_code",
               "iron_mes_prod_line_name",
               "erp_prod_line_code",
               "erp_prod_line_name",
               "esp_mes_prod_line_code",
               "esp_mes_prod_line_name",
               "old_steel_mes_prod_line_code",
               "old_steel_mes_prod_line_name",
               "sys1_prod_line_code",
               "sys1_prod_line_name",
               "sys2_prod_line_code",
               "sys2_prod_line_name",
               "sys3_prod_line_code",
               "sys3_prod_line_name",
               "sys4_prod_line_code",
               "sys4_prod_line_name",
               "sys5_prod_line_code",
               "sys5_prod_line_name",
               "sys6_prod_line_code",
               "sys6_prod_line_name",
               "sys7_prod_line_code",
               "sys7_prod_line_name",
               "sys8_prod_line_code",
               "sys8_prod_line_name",
               "sys9_prod_line_code",
               "sys9_prod_line_name",
               "sys10_prod_line_code",
               "sys10_prod_line_name",
               "creator_no",
               "create_date",
               "updater_no",
               "update_date"

        );
        if (CollectionUtil.isEmpty(fieldList)) {
            return;
        }
        String jsonFilePath = "/Users/zzz/workspace/tengzhi/RiZhaoSteel_1/FileList/" + tableName + ".json";
        File jsonFile = new File(jsonFilePath);
        if (jsonFile.exists()) {
            jsonFile.delete();
        }
        jsonFile.createNewFile();

        String sqlFilePath = "/Users/zzz/workspace/tengzhi/RiZhaoSteel_1/FileList/" + tableName + ".sql";
        File sqlFile = new File(sqlFilePath);
        if (sqlFile.exists()) {
            sqlFile.delete();
        }
        sqlFile.createNewFile();

        ArrayList<String> resultData = new ArrayList<>();
        for (int i = 0; i < fieldList.size(); i++) {
            String field = fieldList.get(i);
            String sql = "";
            if (i == fieldList.size() - 1) {
                sql = field + " AS " + StrUtil.toCamelCase(field);
            } else {
                sql = field + " AS " + StrUtil.toCamelCase(field) + ",";
            }
            resultData.add(sql);
        }
        FileUtil.appendString("SELECT ", sqlFile, Charset.defaultCharset());
        FileUtil.appendLines(resultData, sqlFile, Charset.defaultCharset());

        FileUtil.appendString(" FROM " + dbName + "." + tableName, sqlFile, Charset.defaultCharset());
        if (fieldList.contains("final_update_date") && fieldList.contains("create_date")) {
            FileUtil.appendString(" ORDER BY IFNULL(final_update_date,create_date)", sqlFile, Charset.defaultCharset());
        } else if (fieldList.contains("final_update_date") && !fieldList.contains("create_date")) {
            FileUtil.appendString(" ORDER BY final_update_date", sqlFile, Charset.defaultCharset());
        } else if (!fieldList.contains("final_update_date") && fieldList.contains("create_date")) {
            FileUtil.appendString(" ORDER BY create_date", sqlFile, Charset.defaultCharset());
        }
        FileUtil.appendString("  ${limitSQL} \n", sqlFile, Charset.defaultCharset());

        ArrayList<String> resultData2 = new ArrayList<>();
        for (int i = 0; i < fieldList.size(); i++) {
            String field = fieldList.get(i);
            String humpField = "";
            if (i == fieldList.size() - 1) {
                humpField = "\"" + StrUtil.toCamelCase(field) + "\" : \"\"";
            } else {
                humpField = "\"" + StrUtil.toCamelCase(field) + "\" : \"\",";
            }
            resultData2.add(humpField);
        }

        FileUtil.appendString("{\n", jsonFile, Charset.defaultCharset());
        FileUtil.appendLines(resultData2, jsonFile, Charset.defaultCharset());
        FileUtil.appendString("},\n", jsonFile, Charset.defaultCharset());


        ArrayList<String> resultData3 = new ArrayList<>();
        for (int i = 0; i < fieldList.size(); i++) {
            String field = fieldList.get(i);
            String humpField = "";
            if (i == fieldList.size() - 1) {
                humpField = "\"" + field + "\" : \"\"";
            } else {
                humpField = "\"" + field + "\" : \"\",";
            }
            resultData3.add(humpField);
        }

        FileUtil.appendString("{\n", jsonFile, Charset.defaultCharset());
        FileUtil.appendLines(resultData3, jsonFile, Charset.defaultCharset());
        FileUtil.appendString("}\n", jsonFile, Charset.defaultCharset());
    }
}
