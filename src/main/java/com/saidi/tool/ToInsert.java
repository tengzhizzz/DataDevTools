package com.saidi.tool;

import cn.hutool.core.text.StrBuilder;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 组织结构接口数据格式化成批量insert语句
 */
public class ToInsert {
    public static void main(String[] args) {
        String jsonStr = "{\"code\":\"0\",\"respTime\":\"1716451501996\",\"possibleReason\":\"\",\"respData\":{\"erpDept\":[{\"address\":\"RZGT\",\"orgname\":\"房地产管理公司\",\"orgid\":\"FCGS\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"青岛公司\",\"orgid\":\"QDFC\",\"porgid\":\"FCGS\"},{\"address\":\"RZGT\",\"orgname\":\"威海公司\",\"orgid\":\"WHFC\",\"porgid\":\"FCGS\"},{\"address\":\"JTZB\",\"orgname\":\"投资管理部\",\"orgid\":\"TZGL\",\"porgid\":\"JTZB\"},{\"address\":\"JTZB\",\"orgname\":\"事业拓展部\",\"orgid\":\"SYTZ\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"建港指挥部\",\"orgid\":\"L400\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"行政部门\",\"orgid\":\"A000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"人力资源处\",\"orgid\":\"A100\",\"porgid\":\"A000\"},{\"address\":\"RZGT\",\"orgname\":\"人事规划组\",\"orgid\":\"A120\",\"porgid\":\"A100\"},{\"address\":\"RZGT\",\"orgname\":\"人力发展组\",\"orgid\":\"A130\",\"porgid\":\"A100\"},{\"address\":\"RZGT\",\"orgname\":\"培训中心\",\"orgid\":\"A150\",\"porgid\":\"A130\"},{\"address\":\"RZGT\",\"orgname\":\"运营改善组\",\"orgid\":\"A160\",\"porgid\":\"A100\"},{\"address\":\"RZGT\",\"orgname\":\"总务处\",\"orgid\":\"A200\",\"porgid\":\"A000\"},{\"address\":\"RZGT\",\"orgname\":\"餐饮管理组\",\"orgid\":\"A210\",\"porgid\":\"A200\"},{\"address\":\"RZGT\",\"orgname\":\"通勤管理组\",\"orgid\":\"A230\",\"porgid\":\"A200\"},{\"address\":\"RZGT\",\"orgname\":\"综合管理组\",\"orgid\":\"A240\",\"porgid\":\"A200\"},{\"address\":\"RZGT\",\"orgname\":\"警卫组\",\"orgid\":\"A290\",\"porgid\":\"A200\"},{\"address\":\"RZGT\",\"orgname\":\"消防刑案组\",\"orgid\":\"A2A0\",\"porgid\":\"A200\"},{\"address\":\"RZGT\",\"orgname\":\"公共事务处\",\"orgid\":\"A300\",\"porgid\":\"A000\"},{\"address\":\"RZGT\",\"orgname\":\"政策研究组\",\"orgid\":\"A350\",\"porgid\":\"A300\"},{\"address\":\"RZGT\",\"orgname\":\"接待宣传组\",\"orgid\":\"A360\",\"porgid\":\"A300\"},{\"address\":\"RZGT\",\"orgname\":\"外联事务组\",\"orgid\":\"A370\",\"porgid\":\"A300\"},{\"address\":\"RZGT\",\"orgname\":\"奎山房产组\",\"orgid\":\"A390\",\"porgid\":\"A300\"},{\"address\":\"JTZB\",\"orgname\":\"顾问中心\",\"orgid\":\"AD00\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"销售业务部门\",\"orgid\":\"C000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"运输处\",\"orgid\":\"C300\",\"porgid\":\"C000\"},{\"address\":\"RZGT\",\"orgname\":\"运输规划组\",\"orgid\":\"C310\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"陆运组\",\"orgid\":\"C320\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"海运组\",\"orgid\":\"C330\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"板材成品组\",\"orgid\":\"C340\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"冷轧成品组\",\"orgid\":\"C360\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"长材成品组\",\"orgid\":\"C370\",\"porgid\":\"C300\"},{\"address\":\"RZGT\",\"orgname\":\"营业管理处\",\"orgid\":\"C500\",\"porgid\":\"C000\"},{\"address\":\"RZGT\",\"orgname\":\"板材市研组\",\"orgid\":\"C520\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"产销整合组\",\"orgid\":\"C530\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"外贸市研组\",\"orgid\":\"C540\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"ESP市研组\",\"orgid\":\"C5F0\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"长型材市研组\",\"orgid\":\"C5G0\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"副产品市研组\",\"orgid\":\"C5H0\",\"porgid\":\"C500\"},{\"address\":\"RZGT\",\"orgname\":\"出口事业部\",\"orgid\":\"CA00\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"单证组\",\"orgid\":\"CAE0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"新加坡销售公司\",\"orgid\":\"CAH0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"韩国销售公司\",\"orgid\":\"CAJ0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"东非销售公司\",\"orgid\":\"CAL0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"西非销售公司\",\"orgid\":\"CAM0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"中东销售公司\",\"orgid\":\"CAP0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"沙特北非销售公司\",\"orgid\":\"CAR0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"越南销售公司\",\"orgid\":\"CAS0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"集团化业务组\",\"orgid\":\"CAY0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"产销规划组\",\"orgid\":\"CAZ0\",\"porgid\":\"R000\"},{\"address\":\"RZGT\",\"orgname\":\"耐候钢销售公司\",\"orgid\":\"CE00\",\"porgid\":\"U000\"},{\"address\":\"RZGT\",\"orgname\":\"汽车钢销售公司\",\"orgid\":\"CF00\",\"porgid\":\"U000\"},{\"address\":\"RZGT\",\"orgname\":\"建材销售公司\",\"orgid\":\"CJ00\",\"porgid\":\"N000\"},{\"address\":\"RZGT\",\"orgname\":\"产销规划组\",\"orgid\":\"CJ20\",\"porgid\":\"CJ00\"},{\"address\":\"RZGT\",\"orgname\":\"副产品销售组\",\"orgid\":\"CJ50\",\"porgid\":\"CJ00\"},{\"address\":\"RZGT\",\"orgname\":\"长型材销售公司\",\"orgid\":\"CL00\",\"porgid\":\"X000\"},{\"address\":\"RZGT\",\"orgname\":\"产销规划服务组\",\"orgid\":\"CL10\",\"porgid\":\"CL00\"},{\"address\":\"RZGT\",\"orgname\":\"板材销售公司\",\"orgid\":\"CM00\",\"porgid\":\"P000\"},{\"address\":\"RZGT\",\"orgname\":\"产销规划服务组\",\"orgid\":\"CM10\",\"porgid\":\"CM00\"},{\"address\":\"RZGT\",\"orgname\":\"ESP销售公司\",\"orgid\":\"CN00\",\"porgid\":\"E000\"},{\"address\":\"RZGT\",\"orgname\":\"产销规划服务组\",\"orgid\":\"CN10\",\"porgid\":\"CN00\"},{\"address\":\"RZGT\",\"orgname\":\"党工部门\",\"orgid\":\"D000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"党群工作部\",\"orgid\":\"D600\",\"porgid\":\"D000\"},{\"address\":\"RZGT\",\"orgname\":\"党群工作组\",\"orgid\":\"D610\",\"porgid\":\"D600\"},{\"address\":\"RZGT\",\"orgname\":\"纪检监察组\",\"orgid\":\"D620\",\"porgid\":\"D600\"},{\"address\":\"RZGT\",\"orgname\":\"法务组\",\"orgid\":\"D630\",\"porgid\":\"D600\"},{\"address\":\"RZGT\",\"orgname\":\"ESP事业部\",\"orgid\":\"E000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"财务部门\",\"orgid\":\"F000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"财务处\",\"orgid\":\"F100\",\"porgid\":\"F000\"},{\"address\":\"RZGT\",\"orgname\":\"资产暨风险管理组\",\"orgid\":\"F130\",\"porgid\":\"F100\"},{\"address\":\"RZGT\",\"orgname\":\"资金管理组\",\"orgid\":\"F140\",\"porgid\":\"F100\"},{\"address\":\"RZGT\",\"orgname\":\"会计处\",\"orgid\":\"F200\",\"porgid\":\"F000\"},{\"address\":\"RZGT\",\"orgname\":\"总合会计组\",\"orgid\":\"F210\",\"porgid\":\"F200\"},{\"address\":\"RZGT\",\"orgname\":\"营运费用组\",\"orgid\":\"F220\",\"porgid\":\"F200\"},{\"address\":\"RZGT\",\"orgname\":\"营运会计组\",\"orgid\":\"F240\",\"porgid\":\"F200\"},{\"address\":\"RZGT\",\"orgname\":\"税务组\",\"orgid\":\"F270\",\"porgid\":\"F200\"},{\"address\":\"RZGT\",\"orgname\":\"信息系统处\",\"orgid\":\"F300\",\"porgid\":\"F000\"},{\"address\":\"RZGT\",\"orgname\":\"集团与整体信息管理组\",\"orgid\":\"F310\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"技术研发与数据管理组\",\"orgid\":\"F320\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"网络与平台管理组\",\"orgid\":\"F330\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"钢轧一体化系统管控一组\",\"orgid\":\"F340\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"钢轧一体化系统管控二组\",\"orgid\":\"F350\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"铁前一体化系统管控组\",\"orgid\":\"F360\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"公辅系统管控组\",\"orgid\":\"F370\",\"porgid\":\"F300\"},{\"address\":\"RZGT\",\"orgname\":\"成本处\",\"orgid\":\"F400\",\"porgid\":\"F000\"},{\"address\":\"RZGT\",\"orgname\":\"经营分析组\",\"orgid\":\"F410\",\"porgid\":\"F400\"},{\"address\":\"RZGT\",\"orgname\":\"驻厂成本分析组\",\"orgid\":\"F420\",\"porgid\":\"F400\"},{\"address\":\"RZGT\",\"orgname\":\"成本账务系统组\",\"orgid\":\"F430\",\"porgid\":\"F400\"},{\"address\":\"RZGT\",\"orgname\":\"招标处\",\"orgid\":\"F600\",\"porgid\":\"F000\"},{\"address\":\"RZGT\",\"orgname\":\"供应商管理及集团业务组\",\"orgid\":\"F610\",\"porgid\":\"F600\"},{\"address\":\"RZGT\",\"orgname\":\"招标业务组\",\"orgid\":\"F660\",\"porgid\":\"F600\"},{\"address\":\"JTZB\",\"orgname\":\"集团领导\",\"orgid\":\"J000\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"薪酬与提名委员会\",\"orgid\":\"JA00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"审计委员会\",\"orgid\":\"JB00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"公共事务委员会\",\"orgid\":\"JC00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"战略与风控委员会\",\"orgid\":\"JD00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"监事会\",\"orgid\":\"JE00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"集团资产管理委员会\",\"orgid\":\"JG00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"集团资产管理委员会办公室\",\"orgid\":\"JG10\",\"porgid\":\"JG00\"},{\"address\":\"RZGT\",\"orgname\":\"日照钢铁慈善基金会\",\"orgid\":\"JH00\",\"porgid\":\"J000\"},{\"address\":\"JTZB\",\"orgname\":\"集团稽核\",\"orgid\":\"JI00\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"销售技术室\",\"orgid\":\"JIC0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"财务招标室\",\"orgid\":\"JIF0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"行政企划室\",\"orgid\":\"JIH0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"稽查队\",\"orgid\":\"JIJ0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"物流房产室\",\"orgid\":\"JIL0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"工程检修室\",\"orgid\":\"JIM0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"京华稽核室\",\"orgid\":\"JIP0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"钢后安环室\",\"orgid\":\"JIR0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"采购铁前室\",\"orgid\":\"JIS0\",\"porgid\":\"JI00\"},{\"address\":\"RZGT\",\"orgname\":\"集团管理中心\",\"orgid\":\"JK00\",\"porgid\":\"J000\"},{\"address\":\"RZGT\",\"orgname\":\"钢铁板块管理部\",\"orgid\":\"JK10\",\"porgid\":\"JK00\"},{\"address\":\"RZGT\",\"orgname\":\"京华及其他板块管理部\",\"orgid\":\"JK20\",\"porgid\":\"JK00\"},{\"address\":\"RZGT\",\"orgname\":\"日照宝华房地产开发有限公司\",\"orgid\":\"L200\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"日照港岚北港务有限公司\",\"orgid\":\"L300\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"综合管理处\",\"orgid\":\"L370\",\"porgid\":\"L300\"},{\"address\":\"RZGT\",\"orgname\":\"计划财务处\",\"orgid\":\"L3C0\",\"porgid\":\"L370\"},{\"address\":\"RZGT\",\"orgname\":\"资材管理组\",\"orgid\":\"L3C3\",\"porgid\":\"L3C0\"},{\"address\":\"RZGT\",\"orgname\":\"综合办公室\",\"orgid\":\"L3D0\",\"porgid\":\"L300\"},{\"address\":\"RZGT\",\"orgname\":\"安调作业组\",\"orgid\":\"L3J0\",\"porgid\":\"L300\"},{\"address\":\"RZGT\",\"orgname\":\"船舶作业区\",\"orgid\":\"L3K0\",\"porgid\":\"L300\"},{\"address\":\"RZGT\",\"orgname\":\"货场作业区\",\"orgid\":\"L3L0\",\"porgid\":\"L300\"},{\"address\":\"RZGT\",\"orgname\":\"日照钢铁货运有限公司\",\"orgid\":\"L500\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"日照钢铁供应有限公司\",\"orgid\":\"L600\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"物资稽查处\",\"orgid\":\"L660\",\"porgid\":\"L600\"},{\"address\":\"RZGT\",\"orgname\":\"山东京创物流有限公司\",\"orgid\":\"L700\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"钢材运输业务处\",\"orgid\":\"L730\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"省内钢材业务1组\",\"orgid\":\"L731\",\"porgid\":\"L730\"},{\"address\":\"RZGT\",\"orgname\":\"省内钢材业务2组\",\"orgid\":\"L732\",\"porgid\":\"L730\"},{\"address\":\"RZGT\",\"orgname\":\"省内钢材业务3组\",\"orgid\":\"L733\",\"porgid\":\"L730\"},{\"address\":\"RZGT\",\"orgname\":\"省外钢材业务组\",\"orgid\":\"L734\",\"porgid\":\"L730\"},{\"address\":\"RZGT\",\"orgname\":\"副产品运输业务处\",\"orgid\":\"L740\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"副产品业务组\",\"orgid\":\"L741\",\"porgid\":\"L740\"},{\"address\":\"RZGT\",\"orgname\":\"废旧钢渣业务组\",\"orgid\":\"L742\",\"porgid\":\"L740\"},{\"address\":\"RZGT\",\"orgname\":\"原料承运业务处\",\"orgid\":\"L750\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"辅料承运业务组\",\"orgid\":\"L751\",\"porgid\":\"L750\"},{\"address\":\"RZGT\",\"orgname\":\"煤焦合金承运业务组\",\"orgid\":\"L752\",\"porgid\":\"L750\"},{\"address\":\"RZGT\",\"orgname\":\"集疏港业务处\",\"orgid\":\"L760\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"岚桥集疏港业务组\",\"orgid\":\"L761\",\"porgid\":\"L760\"},{\"address\":\"RZGT\",\"orgname\":\"岚北集疏港业务组\",\"orgid\":\"L762\",\"porgid\":\"L760\"},{\"address\":\"RZGT\",\"orgname\":\"贸易业务处\",\"orgid\":\"L770\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"工程材料业务组\",\"orgid\":\"L771\",\"porgid\":\"L770\"},{\"address\":\"RZGT\",\"orgname\":\"房产材料业务组\",\"orgid\":\"L772\",\"porgid\":\"L770\"},{\"address\":\"RZGT\",\"orgname\":\"辅料业务组\",\"orgid\":\"L773\",\"porgid\":\"L770\"},{\"address\":\"RZGT\",\"orgname\":\"煤焦业务组\",\"orgid\":\"L774\",\"porgid\":\"L770\"},{\"address\":\"RZGT\",\"orgname\":\"钢材业务组\",\"orgid\":\"L775\",\"porgid\":\"L770\"},{\"address\":\"RZGT\",\"orgname\":\"财务处\",\"orgid\":\"L780\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"财务结算组\",\"orgid\":\"L781\",\"porgid\":\"L780\"},{\"address\":\"RZGT\",\"orgname\":\"成本核算组\",\"orgid\":\"L782\",\"porgid\":\"L780\"},{\"address\":\"RZGT\",\"orgname\":\"机械业务组\",\"orgid\":\"L790\",\"porgid\":\"L760\"},{\"address\":\"RZGT\",\"orgname\":\"车辆租赁业务组\",\"orgid\":\"L7A0\",\"porgid\":\"L700\"},{\"address\":\"RZGT\",\"orgname\":\"计划执行及考核业务处\",\"orgid\":\"L7B0\",\"porgid\":\"L700\"},{\"address\":\"JTZB\",\"orgname\":\"资本运营部\",\"orgid\":\"M200\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"理财组\",\"orgid\":\"M210\",\"porgid\":\"M200\"},{\"address\":\"RZGT\",\"orgname\":\"融资组\",\"orgid\":\"M220\",\"porgid\":\"M200\"},{\"address\":\"RZGT\",\"orgname\":\"风控及规划组\",\"orgid\":\"M230\",\"porgid\":\"M200\"},{\"address\":\"RZGT\",\"orgname\":\"建材事业部\",\"orgid\":\"N000\",\"porgid\":\"RZGT\"},{\"address\":\"JTZB\",\"orgname\":\"总裁办\",\"orgid\":\"O100\",\"porgid\":\"JTZB\"},{\"address\":\"RZGT\",\"orgname\":\"综合文案组\",\"orgid\":\"O120\",\"porgid\":\"O100\"},{\"address\":\"RZGT\",\"orgname\":\"秘书组\",\"orgid\":\"O130\",\"porgid\":\"O120\"},{\"address\":\"RZGT\",\"orgname\":\"板材事业部\",\"orgid\":\"P000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"日照京华管业有限公司\",\"orgid\":\"Q100\",\"porgid\":\"JHGY\"},{\"address\":\"RZGT\",\"orgname\":\"办公室\",\"orgid\":\"Q101\",\"porgid\":\"Q100\"},{\"address\":\"RZGT\",\"orgname\":\"财务科\",\"orgid\":\"Q102\",\"porgid\":\"Q100\"},{\"address\":\"RZGT\",\"orgname\":\"供销处\",\"orgid\":\"Q110\",\"porgid\":\"Q100\"},{\"address\":\"RZGT\",\"orgname\":\"生产管理处\",\"orgid\":\"Q120\",\"porgid\":\"Q100\"},{\"address\":\"RZGT\",\"orgname\":\"安全质量科\",\"orgid\":\"Q121\",\"porgid\":\"Q120\"},{\"address\":\"RZGT\",\"orgname\":\"制管车间\",\"orgid\":\"Q122\",\"porgid\":\"Q120\"},{\"address\":\"RZGT\",\"orgname\":\"纵剪车间\",\"orgid\":\"Q123\",\"porgid\":\"Q120\"},{\"address\":\"RZGT\",\"orgname\":\"设备动力科\",\"orgid\":\"Q124\",\"porgid\":\"Q120\"},{\"address\":\"RZGT\",\"orgname\":\"考核办公室\",\"orgid\":\"Q800\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"考核一室\",\"orgid\":\"Q820\",\"porgid\":\"Q800\"},{\"address\":\"RZGT\",\"orgname\":\"考核二室\",\"orgid\":\"Q830\",\"porgid\":\"Q800\"},{\"address\":\"RZGT\",\"orgname\":\"京华日钢（日照）信息技术有限公司\",\"orgid\":\"Q900\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"通用系统部\",\"orgid\":\"Q910\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"综合管理部\",\"orgid\":\"Q920\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"云服务管理部\",\"orgid\":\"Q930\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"产销系统部\",\"orgid\":\"Q940\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"物流计量系统部\",\"orgid\":\"Q950\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"数据服务研发部\",\"orgid\":\"Q960\",\"porgid\":\"Q900\"},{\"address\":\"RZGT\",\"orgname\":\"出口事业部\",\"orgid\":\"R000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"供应业务部门\",\"orgid\":\"S000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"采购管理处\",\"orgid\":\"S100\",\"porgid\":\"S000\"},{\"address\":\"RZGT\",\"orgname\":\"规划组\",\"orgid\":\"S130\",\"porgid\":\"S100\"},{\"address\":\"RZGT\",\"orgname\":\"市研组\",\"orgid\":\"S140\",\"porgid\":\"S100\"},{\"address\":\"RZGT\",\"orgname\":\"客户关系组\",\"orgid\":\"S170\",\"porgid\":\"S100\"},{\"address\":\"RZGT\",\"orgname\":\"燃料采购处\",\"orgid\":\"S300\",\"porgid\":\"S000\"},{\"address\":\"RZGT\",\"orgname\":\"焦炭一区\",\"orgid\":\"S3A0\",\"porgid\":\"S300\"},{\"address\":\"RZGT\",\"orgname\":\"焦炭二区\",\"orgid\":\"S3B0\",\"porgid\":\"S300\"},{\"address\":\"RZGT\",\"orgname\":\"焦炭三区\",\"orgid\":\"S3C0\",\"porgid\":\"S300\"},{\"address\":\"RZGT\",\"orgname\":\"煤炭组\",\"orgid\":\"S3D0\",\"porgid\":\"S300\"},{\"address\":\"RZGT\",\"orgname\":\"辅料采购处\",\"orgid\":\"S400\",\"porgid\":\"S000\"},{\"address\":\"RZGT\",\"orgname\":\"熔剂组\",\"orgid\":\"S410\",\"porgid\":\"S400\"},{\"address\":\"RZGT\",\"orgname\":\"合金组\",\"orgid\":\"S420\",\"porgid\":\"S400\"},{\"address\":\"RZGT\",\"orgname\":\"耐材组\",\"orgid\":\"S430\",\"porgid\":\"S400\"},{\"address\":\"RZGT\",\"orgname\":\"设备采购处\",\"orgid\":\"S500\",\"porgid\":\"S000\"},{\"address\":\"RZGT\",\"orgname\":\"冶炼装备组\",\"orgid\":\"S510\",\"porgid\":\"S500\"},{\"address\":\"RZGT\",\"orgname\":\"压延设备组\",\"orgid\":\"S520\",\"porgid\":\"S500\"},{\"address\":\"RZGT\",\"orgname\":\"通用液压组\",\"orgid\":\"S530\",\"porgid\":\"S500\"},{\"address\":\"RZGT\",\"orgname\":\"电气组\",\"orgid\":\"S550\",\"porgid\":\"S500\"},{\"address\":\"RZGT\",\"orgname\":\"化工建材组\",\"orgid\":\"S560\",\"porgid\":\"S500\"},{\"address\":\"RZGT\",\"orgname\":\"矿石资源处\",\"orgid\":\"S800\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"矿石组\",\"orgid\":\"S810\",\"porgid\":\"S800\"},{\"address\":\"RZGT\",\"orgname\":\"配矿组\",\"orgid\":\"S820\",\"porgid\":\"S800\"},{\"address\":\"RZGT\",\"orgname\":\"技术部门\",\"orgid\":\"T000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"技术质量处\",\"orgid\":\"T200\",\"porgid\":\"T000\"},{\"address\":\"RZGT\",\"orgname\":\"技术规划组\",\"orgid\":\"T210\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"西区热轧品管组\",\"orgid\":\"T220\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"炼钢品管组\",\"orgid\":\"T250\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"东区热轧品管组\",\"orgid\":\"T270\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"技术服务组\",\"orgid\":\"T280\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"冷轧品管组\",\"orgid\":\"T290\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"理化试验组\",\"orgid\":\"T2A0\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"原料验收作业组\",\"orgid\":\"T2C0\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"计量管理组\",\"orgid\":\"T2D0\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"原料化验组\",\"orgid\":\"T2E0\",\"porgid\":\"T200\"},{\"address\":\"RZGT\",\"orgname\":\"品种拓展事业部\",\"orgid\":\"U000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"工程部门\",\"orgid\":\"V000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"工程管理处\",\"orgid\":\"V900\",\"porgid\":\"V000\"},{\"address\":\"RZGT\",\"orgname\":\"港口工程建设管理组\",\"orgid\":\"V970\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"房产工程建设管理组\",\"orgid\":\"V980\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"工程技术组\",\"orgid\":\"V9A0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"投资管理组\",\"orgid\":\"V9B0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"施工管理组\",\"orgid\":\"V9C0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"工程规划组\",\"orgid\":\"V9E0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"验收审计组\",\"orgid\":\"V9F0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"临时项目筹备组\",\"orgid\":\"V9U0\",\"porgid\":\"V900\"},{\"address\":\"RZGT\",\"orgname\":\"生产部门\",\"orgid\":\"W000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"厂内运输处\",\"orgid\":\"W100\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"车辆运输工场\",\"orgid\":\"W120\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"副产物处理工场\",\"orgid\":\"W130\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"铁路运输工场\",\"orgid\":\"W150\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W160\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"原料一工场\",\"orgid\":\"W180\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"原料二工场\",\"orgid\":\"W190\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W1S0\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"临时项目筹备组\",\"orgid\":\"W1U0\",\"porgid\":\"W100\"},{\"address\":\"RZGT\",\"orgname\":\"烧结制造部\",\"orgid\":\"W200\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"球团工场\",\"orgid\":\"W210\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"第二烧结工场\",\"orgid\":\"W220\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"第三烧结工场\",\"orgid\":\"W230\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"第四烧结工场\",\"orgid\":\"W240\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"第五烧结工场\",\"orgid\":\"W250\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"设备管理室\",\"orgid\":\"W260\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"脱硫脱硝工场\",\"orgid\":\"W2D0\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"烧结原料工场\",\"orgid\":\"W2E0\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"环境除尘工场\",\"orgid\":\"W2F0\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W2S0\",\"porgid\":\"W200\"},{\"address\":\"RZGT\",\"orgname\":\"长型材制造部\",\"orgid\":\"W300\",\"porgid\":\"X000\"},{\"address\":\"RZGT\",\"orgname\":\"转炉工场\",\"orgid\":\"W310\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"连铸工场\",\"orgid\":\"W320\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"型钢工场\",\"orgid\":\"W340\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W360\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"辅助设备工场\",\"orgid\":\"W370\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"棒线工场\",\"orgid\":\"W390\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W3S0\",\"porgid\":\"W300\"},{\"address\":\"RZGT\",\"orgname\":\"板材制造部\",\"orgid\":\"W400\",\"porgid\":\"P000\"},{\"address\":\"RZGT\",\"orgname\":\"炼钢工场\",\"orgid\":\"W410\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"连铸工场\",\"orgid\":\"W420\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"第一热轧工场\",\"orgid\":\"W430\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"精整工场\",\"orgid\":\"W450\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W460\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"辅助设备工场\",\"orgid\":\"W470\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"第二热轧工场\",\"orgid\":\"W490\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W4S0\",\"porgid\":\"W400\"},{\"address\":\"RZGT\",\"orgname\":\"公用设施处\",\"orgid\":\"W500\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"电力工场\",\"orgid\":\"W510\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"燃气发电工场\",\"orgid\":\"W520\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"燃煤发电工场\",\"orgid\":\"W540\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"动力工场\",\"orgid\":\"W550\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W560\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"TRT余热发电工场\",\"orgid\":\"W570\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"能源管理组\",\"orgid\":\"W590\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W5S0\",\"porgid\":\"W500\"},{\"address\":\"RZGT\",\"orgname\":\"设备处\",\"orgid\":\"W600\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"综合管理组\",\"orgid\":\"W610\",\"porgid\":\"W600\"},{\"address\":\"RZGT\",\"orgname\":\"设备管理组\",\"orgid\":\"W660\",\"porgid\":\"W600\"},{\"address\":\"RZGT\",\"orgname\":\"物料管理组\",\"orgid\":\"W670\",\"porgid\":\"W600\"},{\"address\":\"RZGT\",\"orgname\":\"机械设备技术组\",\"orgid\":\"W680\",\"porgid\":\"W600\"},{\"address\":\"RZGT\",\"orgname\":\"电控设备技术组\",\"orgid\":\"W6T0\",\"porgid\":\"W600\"},{\"address\":\"RZGT\",\"orgname\":\"生产计划处\",\"orgid\":\"W700\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"铁前管理及生产管制组\",\"orgid\":\"W710\",\"porgid\":\"W700\"},{\"address\":\"RZGT\",\"orgname\":\"长型材生产计划组\",\"orgid\":\"W720\",\"porgid\":\"W700\"},{\"address\":\"RZGT\",\"orgname\":\"综合生产规划组\",\"orgid\":\"W730\",\"porgid\":\"W700\"},{\"address\":\"RZGT\",\"orgname\":\"工业工程组\",\"orgid\":\"W790\",\"porgid\":\"W700\"},{\"address\":\"RZGT\",\"orgname\":\"冷板制造部\",\"orgid\":\"W800\",\"porgid\":\"E000\"},{\"address\":\"RZGT\",\"orgname\":\"原料成品工场\",\"orgid\":\"W810\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"炼钢工场\",\"orgid\":\"W820\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"ESP连铸工场\",\"orgid\":\"W830\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"ESP轧钢一工场\",\"orgid\":\"W840\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"公辅一工场\",\"orgid\":\"W850\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W860\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"冷轧一工场\",\"orgid\":\"W870\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"冷轧二工场\",\"orgid\":\"W880\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"精整工场\",\"orgid\":\"W890\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"镀锌工场\",\"orgid\":\"W8A0\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"ESP轧钢二工场\",\"orgid\":\"W8B0\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"公辅二工场\",\"orgid\":\"W8E0\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W8S0\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"临时项目筹备组\",\"orgid\":\"W8U0\",\"porgid\":\"W800\"},{\"address\":\"RZGT\",\"orgname\":\"循环经济部\",\"orgid\":\"W900\",\"porgid\":\"N000\"},{\"address\":\"RZGT\",\"orgname\":\"微粉工场\",\"orgid\":\"W910\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"水泥工场\",\"orgid\":\"W920\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"钢渣处理工场\",\"orgid\":\"W930\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"设备检修工场\",\"orgid\":\"W960\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"石灰工场\",\"orgid\":\"W9C0\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"除尘灰处理工场\",\"orgid\":\"W9E0\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"蒙阴临时工作组\",\"orgid\":\"W9Q0\",\"porgid\":\"D000\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"W9S0\",\"porgid\":\"W900\"},{\"address\":\"RZGT\",\"orgname\":\"炼铁制造部\",\"orgid\":\"WH00\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"新一高炉工场\",\"orgid\":\"WH10\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"新二高炉工场\",\"orgid\":\"WH20\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"新三高炉工场\",\"orgid\":\"WH30\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"新四高炉工场\",\"orgid\":\"WH40\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"设备管理室\",\"orgid\":\"WH90\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"公辅工场\",\"orgid\":\"WHA0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"动力工场\",\"orgid\":\"WHB0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"第四高炉工场\",\"orgid\":\"WHD0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"第六高炉工场\",\"orgid\":\"WHE0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"第八高炉工场\",\"orgid\":\"WHF0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"铁水运输工场\",\"orgid\":\"WHG0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"作业规划组\",\"orgid\":\"WHS0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"临时项目筹备组\",\"orgid\":\"WHU0\",\"porgid\":\"WH00\"},{\"address\":\"RZGT\",\"orgname\":\"长型材事业部\",\"orgid\":\"X000\",\"porgid\":\"RZGT\"},{\"address\":\"RZGT\",\"orgname\":\"安全处\",\"orgid\":\"Y100\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"安卫规划组\",\"orgid\":\"Y110\",\"porgid\":\"Y100\"},{\"address\":\"RZGT\",\"orgname\":\"安全风控组\",\"orgid\":\"Y150\",\"porgid\":\"Y100\"},{\"address\":\"RZGT\",\"orgname\":\"安全技术组\",\"orgid\":\"Y160\",\"porgid\":\"Y100\"},{\"address\":\"RZGT\",\"orgname\":\"检修公司\",\"orgid\":\"Y700\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"综合管理组\",\"orgid\":\"Y710\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"炼铁检修工场\",\"orgid\":\"Y7A0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"烧结检修工场\",\"orgid\":\"Y7B0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"机械检修一工场\",\"orgid\":\"Y7E0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"电气检修工场\",\"orgid\":\"Y7F0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"机械检修二工场\",\"orgid\":\"Y7G0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"机械检修三工场\",\"orgid\":\"Y7H0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"机加修理工场\",\"orgid\":\"Y7J0\",\"porgid\":\"Y700\"},{\"address\":\"RZGT\",\"orgname\":\"环境保护处\",\"orgid\":\"Y900\",\"porgid\":\"W000\"},{\"address\":\"RZGT\",\"orgname\":\"有组织排放管理组\",\"orgid\":\"Y920\",\"porgid\":\"Y900\"},{\"address\":\"RZGT\",\"orgname\":\"无组织排放管理组\",\"orgid\":\"Y930\",\"porgid\":\"Y900\"},{\"address\":\"RZGT\",\"orgname\":\"环境规划组\",\"orgid\":\"Y9S0\",\"porgid\":\"Y900\"},{\"address\":\"RZGT\",\"orgname\":\"日照钢铁控股集团有限公司\",\"orgid\":\"Z000\",\"porgid\":\"RZGT\"},{\"address\":\"ROOT\",\"orgname\":\"集团总部\",\"orgid\":\"JTZB\",\"porgid\":\"\"},{\"address\":\"ROOT\",\"orgname\":\"日照钢铁集团\",\"orgid\":\"RZGT\",\"porgid\":\"\"},{\"address\":\"RZGT\",\"orgname\":\"未维护组织\",\"orgid\":\"XXXX\",\"porgid\":\"RZGT\"},{\"address\":\"ROOT\",\"orgname\":\"其他单位\",\"orgid\":\"OTHER\",\"porgid\":\"\"},{\"address\":\"RZGT\",\"orgname\":\"外部单位\",\"orgid\":\"OTH2\",\"porgid\":\"OTHER\"},{\"address\":\"RZGT\",\"orgname\":\"原燃料及废钢验收小组\",\"orgid\":\"OTH1\",\"porgid\":\"OTHER\"},{\"address\":\"JTZB\",\"orgname\":\"资产管理中心\",\"orgid\":\"JTZC\",\"porgid\":\"JTZB\"}]},\"message\":\"OK\"}";
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONObject respData = jsonObject.getJSONObject("respData");
        JSONArray erpDept = respData.getJSONArray("erpDept");
        StrBuilder strBuilder  = new StrBuilder("INSERT INTO `data_collection_sharing`.`dwd_base_org_info` (`dept_code`, `ower_comp`, `dept_name`, `parent_dept_code`) VALUES");
        for (Object o : erpDept) {
            JSONObject data = JSON.parseObject(o.toString());
            Object address = data.getString("address");
            Object orgname = data.getString("orgname");
            Object orgid = data.getString("orgid");
            Object porgid = data.getString("porgid");
            strBuilder.append("('" + orgid + "',").append("'" + address + "',").append("'" + orgname + "',").append("'" + porgid + "'),");
        }
        System.out.println(strBuilder);
    }
}
