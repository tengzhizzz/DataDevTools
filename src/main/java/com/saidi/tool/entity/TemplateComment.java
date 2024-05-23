package com.saidi.tool.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateComment {
    @ExcelProperty(value = "数据表中文名称", index = 0)
    private String tableNameDesc;
    @ExcelProperty(value = "数据表英文名", index = 1)
    private String tableName;
    @ExcelProperty(value = "字段中文名", index = 2)
    private String columnDesc;
    @ExcelProperty(value = "字段英文名", index = 3)
    private String columnName;
    @ExcelProperty(value = "字段类型", index = 4)
    private String columnType;
    @ExcelProperty(value = "是否主键", index = 5)
    private String isPrimaryKey;
    @ExcelProperty(value = "注释", index = 6)
    private String comment;
}