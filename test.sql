SELECT
    a1.iron_no, --铁次号
    a1.iron_slogan, --铁口号
    a1.shift, --班次
    a1.class, --班组
    a1.to_open_mouth_time, --开口时间
    a1.underachiever_time, --来渣时间
    a1.plug_time, --堵口时间
    a1.drill, --钻头
    a1.taphole_depth, --铁口深度
    a1.mud_dosage, --打泥量
    a1.punching_mud_press, --打泥压力
    a1.punching_mud_fty, --打泥厂家
    a1.punching_mud_time, --打泥时间
    a1.is_breaking_leaks, --是否断漏
    a1.is_caloric_oxygen, --是否烧氧
    a1.is_running_mud, --是否跑泥
    a1.is_incoming_wind, --是否来风
    a1.is_er_kai, --是否二开
    a1.iron_temp, --铁水温度
    a1.original_iron_no, --原始铁次号
    a1.crop_forecasting, --估产
    a1.act_amount_slag, --实际渣量
    a1.biz_time, --业务时间
    a1.drill_num, --钻头(个）
    a1.drill_pipe, --钻杆(根）
    a1.oxygen_blowing_pipe, --吹氧管
    a1.handling_losses_msg, --喷溅信息
    a1.iron_room_batch, --铁间料批
    a1.remark, --备注
    a1.rec_create_time, --记录创建时间
    a1.rec_update_time, --记录更新时间
    a1.iron_tap_underachiever_time, --出铁来渣时间
    a1.iron_tap_start_time, --出铁开始时间
    a1.iron_tap_end_time, --出铁结束时间

    a2.iron_tap_dur, --出铁时长
    a2.to_open_mouth_gap, --开口间隔
    a2.overlap_dur, --重叠时长
    a2.slag_tap_dur, --出渣时长
    a2.underachiever_gap, --来渣间隔
    a2.underachiever_rate, --见渣率
    a2.broken_slag_dur, --断渣时长
    a2.slag_to_iron_ratio, --渣铁比
    a2.iron_no_avg_vel, --铁次平均流速
    a2.blanking_batch_quantity, --下料批数
    a2.theory_iron_content, --理论铁量
    a2.act_iron_content, --实际铁量
    a2.act_iron_content_mtg, --实际铁量（过磅）
    a2.iron_volume_difference, --铁量差
    a2.theory_amount_slag, --理论渣量

    a3.iron_no, --铁次号
    a3.metal_pot_no, --铁罐号
    a3.batch_no, --罐次号
    a3.orbit_no, --轨道号
    a3.iron_re_start_time, --受铁开始时间
    a3.iron_re_end_time, --受铁结束时间
    a3.iron_re_dur, --受铁时长
    a3.transf_situation, --中转情况
    a3.iron_temp, --铁水温度
    a3.gross_weight, --毛重（铁罐+铁水）
    a3.tare_weight, --皮重（铁管重量）
    a3.net_weight, --净重（铁水）
    a3.gross_weight_out, --毛重（过磅）
    a3.tare_weight_out, --皮重（过磅）
    a3.net_weight_out, --净重（过磅）
    a3.mtg_gross_wgt_time, --过磅毛重时间
    a3.mtg_tare_wgt_time, --过磅皮重时间
    a3.mtg_net_wgt_time, --过磅净重时间
    a3.sort, --排序
    a3.remark, --备注
    a3.valuation, --估重
    a3.calc_amt, --核算量
    a4.*
FROM
    ads_prod.dwd_pi_bf_iron_tap_achv a1
LEFT JOIN ads_prod.dwd_pi_bf_iron_tap_stats_msg a2 ON a1.iron_no = a2.iron_no
LEFT JOIN ads_prod.dwd_pi_iron_ladle_iron_re_achv a3 ON a1.iron_no = a3.iron_no

LEFT JOIN (

SELECT
    iron_no_metal_pot_msg_mark,
    CASE WHEN field_code = '是否喷溅' AND type = 1 THEN '是' ELSE '否' END AS is_handling_losses,
    CASE WHEN field_code = '估计Si' AND type = 1 THEN '是' ELSE '否' END AS est_si,
    CASE WHEN field_code = '水渣含水量（%）' AND type = 1 THEN '是' ELSE '否' END AS water_slag_moisture_content,
    CASE WHEN field_code = '钻头1深度' AND type = 1 THEN '是' ELSE '否' END AS drill_1_depth,
    CASE WHEN field_code = '是否打不动泥' AND type = 1 THEN '是' ELSE '否' END AS is_motionless_mud,
    CASE WHEN field_code = '喷溅是否炮泥原因' AND type = 1 THEN '是' ELSE '否' END AS handling_losses_is_cannon_mud_rea,
    CASE WHEN field_code = '是否难开' AND type = 1 THEN '是' ELSE '否' END AS is_difficult_to_open,
    CASE WHEN field_code = '开口用时' AND type = 1 THEN '是' ELSE '否' END AS to_open_mouth_used_time,
    CASE WHEN field_code = '出渣速度' AND type = 1 THEN '是' ELSE '否' END AS slag_tap_speed,
    CASE WHEN field_code = '钻头4长度' AND type = 1 THEN '是' ELSE '否' END AS drill_4_len,
    CASE WHEN field_code = '钻头3深度' AND type = 1 THEN '是' ELSE '否' END AS drill_3_depth,
    CASE WHEN field_code = '钻头2深度' AND type = 1 THEN '是' ELSE '否' END AS drill_2_depth,
    CASE WHEN field_code = '钻头4深度' AND type = 1 THEN '是' ELSE '否' END AS drill_4_depth,
    CASE WHEN field_code = '断漏是否炮泥原因' AND type = 1 THEN '是' ELSE '否' END AS breaking_leaks_is_cannon_mud_rea,
    CASE WHEN field_code = '断' AND type = 1 THEN '是' ELSE '否' END AS break,
    CASE WHEN field_code = '难开是否炮泥原因' AND type = 1 THEN '是' ELSE '否' END AS difficult_to_open_is_cannon_mud_rea,
    CASE WHEN field_code = '角度' AND type = 1 THEN '是' ELSE '否' END AS angle,
    CASE WHEN field_code = '估计S' AND type = 1 THEN '是' ELSE '否' END AS est_s,
    CASE WHEN field_code = '钻头1长度' AND type = 1 THEN '是' ELSE '否' END AS drill_1_len,
    CASE WHEN field_code = '钻头3长度' AND type = 1 THEN '是' ELSE '否' END AS drill_3_len,
    CASE WHEN field_code = '批铁' AND type = 1 THEN '是' ELSE '否' END AS batch_iron,
    CASE WHEN field_code = '钻头2长度' AND type = 1 THEN '是' ELSE '否' END AS drill_2_len,
    CASE WHEN field_code = '留铁' AND type = 1 THEN '是' ELSE '否' END AS retairon,
    CASE WHEN field_code = '漏' AND type = 1 THEN '是' ELSE '否' END AS leak,
    CASE WHEN field_code = '打不动泥是否炮泥原因' AND type = 1 THEN '是' ELSE '否' END AS motionless_mud_is_cannon_mud_rea
FROM
    ads_prod.dwd_pi_iron_stats_target_msg ) a4 ON  a1.iron_no = a4.iron_no_metal_pot_msg_mark OR a4.iron_no_metal_pot_msg_mark = a3.batch_no;



