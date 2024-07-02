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
                "COMPID",
                "PRODCLASSNO",
                "PRODCLASSCHIN",
                "PRODCLASSENGN",
                "CREATEEMPNO",
                "CREATEDATE",
                "UPDATEEMPNO",
                "UPDATEDATE",
                "PRIORITY",
                "STATUS"

        );
        if (CollectionUtil.isEmpty(fieldList)) {
            return;
        }
        String jsonFilePath = "/Users/zzz/workspace/tengzhi/RiZhaoSteel/FileList/" + tableName + ".json";
        File jsonFile = new File(jsonFilePath);
        if (jsonFile.exists()) {
            jsonFile.delete();
        }
        jsonFile.createNewFile();

        String sqlFilePath = "/Users/zzz/workspace/tengzhi/RiZhaoSteel/FileList/" + tableName + ".sql";
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
