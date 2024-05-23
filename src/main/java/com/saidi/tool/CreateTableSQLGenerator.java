package com.saidi.tool;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.saidi.tool.entity.Column;
import com.saidi.tool.entity.TemplateComment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 根据表格内容生成建表语句
 */
public class CreateTableSQLGenerator {

    public static void main(String[] args) throws IOException {

        String tableName = "";
        String tableComment = "";

        List<Column> columns = new ArrayList<>();
        String filePath = "/Users/zzz/workspace/tengzhi/RiZhaoSteel/src/main/resources/CreateTableSQLFile/template.xlsx";
        File templateFile = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(templateFile);
        List<TemplateComment> templateCommentList = EasyExcel.read(fileInputStream)
                .head(TemplateComment.class)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet()
                .doReadSync();

        tableComment = templateCommentList.get(0).getTableNameDesc();
        tableName = templateCommentList.get(0).getTableName();

        for (TemplateComment t : templateCommentList) {
            String columnName = t.getColumnName();
            String columnDesc = t.getColumnDesc();
            String type = t.getColumnType();
            // 给个默认值
            int length = 0;
            // varchar2(80)
            if (type.startsWith("varchar2(")) {
                type = StrUtil.replace(type, "varchar2", "varchar");
            }
            boolean isPrimaryKey = Optional.ofNullable(t.getIsPrimaryKey()).orElseGet(() -> "否").equalsIgnoreCase("是");
            // 注释
            String comment = columnDesc;
            if (StrUtil.isNotBlank(t.getComment())) {
                comment = comment + ";" + t.getComment();
            }
            columns.add(new Column(columnName, type, length, isPrimaryKey, comment));
        }
        String createTableSQL = generateCreateTableSQL(tableName, tableComment, columns);
        System.out.println(createTableSQL);
        File createTableFile = new File("/Users/zzz/workspace/tengzhi/RiZhaoSteel/CreateTableFile/"+tableName + ".sql");
        if (createTableFile.exists()) {
            createTableFile.delete();
        }
        createTableFile.createNewFile();
        FileUtil.appendString(createTableSQL, createTableFile, Charset.defaultCharset());
    }

    private static String generateCreateTableSQL(String tableName, String tableComment, List<Column> columns) {
        StringBuilder sql = new StringBuilder();
        String dbName = "data_collection_sharing";
        sql.append("CREATE TABLE `").append(dbName).append("`.`").append(tableName).append("` (\n");

        List<String> primaryKeys = new ArrayList<>();
        for (Column column : columns) {
            sql.append("    `").append(column.getName()).append("` ")
                    .append(column.getType());

            if (column.isPrimaryKey()) {
                primaryKeys.add(column.getName());
                sql.append(" NOT NULL");
            } else {
                sql.append(" DEFAULT NULL");
            }
            sql.append(" COMMENT '").append(column.getComment()).append("',\n");
        }

        if (!primaryKeys.isEmpty()) {
            sql.append("    PRIMARY KEY (");
            for (int i = 0; i < primaryKeys.size(); i++) {
                sql.append("`").append(primaryKeys.get(i)).append("`");
                if (i < primaryKeys.size() - 1) {
                    sql.append(", ");
                }
            }
            sql.append(")\n");
        } else {
            // 移除尾部的逗号和换行符
            sql.setLength(sql.length() - 2);
            sql.append("\n");
        }
        sql.append(") COMMENT='").append(tableComment).append("';");

        return sql.toString();
    }
}
