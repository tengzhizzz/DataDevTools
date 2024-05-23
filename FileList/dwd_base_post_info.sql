SELECT comp_id AS compId,
post_code AS postCode,
post_cn_name AS postCnName,
post_en_name AS postEnName,
type AS type,
dties_code AS dtiesCode,
dept_code AS deptCode,
post_group_code AS postGroupCode,
approved_grade_start AS approvedGradeStart,
approved_grade_end AS approvedGradeEnd,
emp_cnt AS empCnt,
emp_real_cnt AS empRealCnt,
cooperation_cnt_a AS cooperationCntA,
cooperation_cnt_b AS cooperationCntB,
cooperation_cnt_c AS cooperationCntC,
rotational_year AS rotationalYear,
chief_allowance AS chiefAllowance,
foreman_allowance AS foremanAllowance,
env_allowance AS envAllowance,
hot_allowance AS hotAllowance,
shift_model AS shiftModel,
key_positions_allowance AS keyPositionsAllowance,
belong_comp AS belongComp,
cost_center AS costCenter,
post_type AS postType,
annotation AS annotation,
status AS status,
remark AS remark,
auth_type AS authType,
post_std AS postStd,
is_witch AS isWitch,
post_level AS postLevel,
creator_no AS creatorNo,
create_date AS createDate,
create_time AS createTime,
final_updater_no AS finalUpdaterNo,
final_update_date AS finalUpdateDate,
final_update_time AS finalUpdateTime,
is_key_post AS isKeyPost
 FROM data_collection_sharing.dwd_base_post_info ORDER BY IFNULL(final_update_date,create_date)  ${limitSQL} 