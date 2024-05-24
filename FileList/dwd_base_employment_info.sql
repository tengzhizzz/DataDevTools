SELECT comp_id        AS compId,
       empno          AS empno,
       emptype        AS emptype,
       salarytype     AS salarytype,
       deptno         AS deptno,
       classify       AS classify,
       classifysrlno  AS classifysrlno,
       title          AS title,
       agentdeptno    AS agentdeptno,
       agenttitle     AS agenttitle,
       concrntdeptno  AS concrntdeptno,
       concrnttitle   AS concrnttitle,
       origrade       AS origrade,
       post_code      AS postCode,
       crntgrade      AS crntgrade,
       tmntdate       AS tmntdate,
       suspenddate    AS suspenddate,
       tmnttype       AS tmnttype,
       tmntreason     AS tmntreason,
       tmntdocno      AS tmntdocno,
       tmntreasondesc AS tmntreasondesc,
       empmethod      AS empmethod,
       titlecategory  AS titlecategory,
       workplace      AS workplace,
       empdate        AS empdate,
       salarydate     AS salarydate,
       grpdate        AS grpdate,
       duedate        AS duedate,
       trialperiod    AS trialperiod,
       senioritydate  AS senioritydate,
       allowan        AS allowan,
       suspenddays    AS suspenddays,
       resumpdate     AS resumpdate,
       conttmntdate   AS conttmntdate,
       hasspouse      AS hasspouse,
       taxkind        AS taxkind,
       labourco       AS labourco,
       costcenter     AS costcenter,
       belongcomp     AS belongcomp,
       dpntcnt        AS dpntcnt,
       middlepay      AS middlepay,
       ottype         AS ottype,
       monthbonustype AS monthbonustype,
       createempno    AS createempno,
       createdate     AS createdate,
       createtime     AS createtime,
       updateempno    AS updateempno,
       updatedate     AS updatedate,
       updatetime     AS updatetime,
       concrntdeptno2 AS concrntdeptno2,
       concrnttitle2  AS concrnttitle2,
       concrntdeptno3 AS concrntdeptno3,
       concrnttitle3  AS concrnttitle3
FROM data_collection_sharing.dwd_base_employment_info ${limitSQL}