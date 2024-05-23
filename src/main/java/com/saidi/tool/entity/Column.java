package com.saidi.tool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Column {
    //字段名称
    String name;
    //字段类型
    String type;
    int length;
    //是否主键
    boolean isPrimaryKey;
    //注释
    String comment;
}