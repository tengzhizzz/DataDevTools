SELECT procedure_code AS procedureCode,
procedure_name AS procedureName,
paretn_procedure_code AS paretnProcedureCode,
paretn_procedure_name AS paretnProcedureName,
procedure_leve AS procedureLeve,
creator_no AS creatorNo,
create_date AS createDate,
final_updater_no AS finalUpdaterNo,
final_update_date AS finalUpdateDate
 FROM data_collection_sharing.dwd_base_supp_info ORDER BY IFNULL(final_update_date,create_date)  ${limitSQL} 
