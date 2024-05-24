CREATE TABLE `data_collection_sharing`.`dwd_base_proc` (
    `procedure_code` varchar(6) NOT NULL BINARY COMMENT '工序编码',
    `procedure_name` varchar(50) DEFAULT NULL COMMENT '工序名称',
    `paretn_procedure_code` varchar(6) DEFAULT NULL COMMENT '上级工序编码',
    `paretn_procedure_name` varchar(50) DEFAULT NULL COMMENT '上级工序名称',
    `procedure_leve` varchar(4) DEFAULT NULL COMMENT '工序层级',
    `creator_no` varchar(8) DEFAULT NULL COMMENT '创建人工号',
    `create_date` varchar(8) DEFAULT NULL COMMENT '创建日期',
    `final_updater_no` varchar(8) DEFAULT NULL COMMENT '最后更新人工号',
    `final_update_date` varchar(8) DEFAULT NULL COMMENT '最后更新日期',
    PRIMARY KEY (`procedure_code`)
) COMMENT='工序';