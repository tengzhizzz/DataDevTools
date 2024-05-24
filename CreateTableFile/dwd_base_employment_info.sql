CREATE TABLE `data_collection_sharing`.`dwd_base_employment_info`
(
    `comp_id`        varchar(20) NOT NULL BINARY COMMENT '公司ID',
    `empno`          varchar(10)  DEFAULT NULL COMMENT '职工编号',
    `emptype`        varchar(6)   DEFAULT NULL COMMENT '职工类别',
    `salarytype`     varchar(6)   DEFAULT NULL COMMENT '薪给类别',
    `deptno`         varchar(6)   DEFAULT NULL COMMENT '部门',
    `classify`       varchar(6)   DEFAULT NULL COMMENT '专长代码',
    `classifysrlno`  varchar(6)   DEFAULT NULL COMMENT '专长序号',
    `title`          varchar(6)   DEFAULT NULL COMMENT '职称',
    `agentdeptno`    varchar(6)   DEFAULT NULL COMMENT '代理服务单位',
    `agenttitle`     varchar(6)   DEFAULT NULL COMMENT '代理职务',
    `concrntdeptno`  varchar(6)   DEFAULT NULL COMMENT '兼任服务单位',
    `concrnttitle`   varchar(6)   DEFAULT NULL COMMENT '兼任职务',
    `origrade`       varchar(6)   DEFAULT NULL COMMENT '核定职等/阶',
    `post_code`      varchar(20)  DEFAULT NULL COMMENT '目前职位代号',
    `crntgrade`      varchar(6)   DEFAULT NULL COMMENT '现支薪等/阶',
    `tmntdate`       varchar(8)   DEFAULT NULL COMMENT '离职日期',
    `suspenddate`    varchar(8)   DEFAULT NULL COMMENT '停薪日期',
    `tmnttype`       varchar(6)   DEFAULT NULL COMMENT '离职类型',
    `tmntreason`     varchar(6)   DEFAULT NULL COMMENT '离职原因类别',
    `tmntdocno`      varchar(20)  DEFAULT NULL COMMENT '离职单文号',
    `tmntreasondesc` varchar(500) DEFAULT NULL COMMENT '离职原因备注说明',
    `empmethod`      varchar(6)   DEFAULT NULL COMMENT '任用类别',
    `titlecategory`  varchar(6)   DEFAULT NULL COMMENT '职类',
    `workplace`      varchar(6)   DEFAULT NULL COMMENT '服务地点',
    `empdate`        varchar(8)   DEFAULT NULL COMMENT '到职日期',
    `salarydate`     varchar(8)   DEFAULT NULL COMMENT '起薪日期',
    `grpdate`        varchar(8)   DEFAULT NULL COMMENT '集团到职日期',
    `duedate`        varchar(8)   DEFAULT NULL COMMENT '参加工作时间',
    `trialperiod`    int          DEFAULT NULL COMMENT '试用月数',
    `senioritydate`  varchar(8)   DEFAULT NULL COMMENT '工龄起算日',
    `allowan`        varchar(2)   DEFAULT NULL COMMENT '是否有抗洪抢险津贴',
    `suspenddays`    int          DEFAULT NULL COMMENT '停薪日数累计',
    `resumpdate`     varchar(8)   DEFAULT NULL COMMENT '复职日期',
    `conttmntdate`   varchar(8)   DEFAULT NULL COMMENT '带薪年假请算日期',
    `hasspouse`      varchar(6)   DEFAULT NULL COMMENT '有无配偶',
    `taxkind`        varchar(6)   DEFAULT NULL COMMENT '所得税扣缴方式',
    `labourco`       varchar(6)   DEFAULT NULL COMMENT '劳务公司',
    `costcenter`     varchar(20)  DEFAULT NULL COMMENT '成本中心',
    `belongcomp`     varchar(6)   DEFAULT NULL COMMENT '归属法人公司',
    `dpntcnt`        int          DEFAULT NULL COMMENT '扶养人数',
    `middlepay`      varchar(2)   DEFAULT NULL COMMENT '储备/见习主管',
    `ottype`         varchar(50)  DEFAULT NULL COMMENT '人事档案编号',
    `monthbonustype` varchar(6)   DEFAULT NULL COMMENT '是否算奖金',
    `createempno`    varchar(10)  DEFAULT NULL COMMENT '资料建立人',
    `createdate`     varchar(8)   DEFAULT NULL COMMENT '资料建立日期',
    `createtime`     varchar(6)   DEFAULT NULL COMMENT '资料建立时间',
    `updateempno`    varchar(10)  DEFAULT NULL COMMENT '资料异动人',
    `updatedate`     varchar(8)   DEFAULT NULL COMMENT '资料异动日期',
    `updatetime`     varchar(6)   DEFAULT NULL COMMENT '资料异动时间',
    `concrntdeptno2` varchar(6)   DEFAULT NULL COMMENT '兼任服务单位2',
    `concrnttitle2`  varchar(6)   DEFAULT NULL COMMENT '兼任职务2',
    `concrntdeptno3` varchar(6)   DEFAULT NULL COMMENT '兼任服务单位3',
    `concrnttitle3`  varchar(6)   DEFAULT NULL COMMENT '兼任职务3',
    PRIMARY KEY (`comp_id`)
) COMMENT='人员就职信息';