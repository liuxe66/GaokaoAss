package com.liuxe.gaokaoass.bean;

import java.util.List;

public class ExamineeBean {

        /**
         * art_or_science : 理科
         * data_year : 2019
         * is_new_pro : 0
         * location : 河南
         * req_type : same_score
         * score : 582
         * session_id : 668d73a01443dd7a8e1523042a932bc0
         * status_code : 200
         * status_msg :
         * student_rank : 26424
         * students_sum : 95
         * y2y : 2017-2019
         * year : 2020
         * examinee_go : {"go_city":[{"name":"上海","numbers":10,"percent":0.2702702581882477},{"name":"北京","numbers":7,"percent":0.18918919563293457},{"name":"南京","numbers":7,"percent":0.18918919563293457},{"name":"西安","numbers":7,"percent":0.18918919563293457},{"name":"广州","numbers":6,"percent":0.1621621549129486}],"go_colleges":[{"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=99536C640ED32F61AB3CA21D9186A1BD&tv=0_0&x.jpg","name":"中国石油大学(华东)","numbers":2,"percent":0.20000000298023224},{"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=8213EF1F1CA49B6C97EE3181DE43FF41&tv=0_0&x.jpg","name":"浙江工业大学","numbers":2,"percent":0.20000000298023224},{"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0D0CE93BB3F481800B0E1463435128EE&tv=0_0&x.jpg","name":"华中农业大学","numbers":2,"percent":0.20000000298023224},{"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=BA91F12652C3637E6DCCCDCBEBAE2B33&tv=0_0&x.jpg","name":"南京农业大学","numbers":2,"percent":0.20000000298023224},{"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=4E6A19C4C1CE802BA9C2171550D10522&tv=0_0&x.jpg","name":"西北政法大学","numbers":2,"percent":0.20000000298023224}],"go_major":[{"category":"工学","name":"计算机科学与技术","numbers":40,"percent":0.26143792271614075},{"category":"工学","name":"电气工程及其自动化","numbers":33,"percent":0.21568627655506134},{"category":"工学","name":"自动化","numbers":28,"percent":0.18300653994083405},{"category":"管理学","name":"工商管理类","numbers":26,"percent":0.16993464529514313},{"category":"工学","name":"计算机类","numbers":26,"percent":0.16993464529514313}]}
         * weici_distribution : [{"numbers":"11","score":"697","sums":"11"},{"numbers":"2","score":"696","sums":"13"},{"numbers":"3","score":"695","sums":"16"},{"numbers":"5","score":"694","sums":"21"},{"numbers":"5","score":"693","sums":"26"},{"numbers":"4","score":"692","sums":"30"},{"numbers":"2","score":"691","sums":"32"},{"numbers":"5","score":"690","sums":"37"},{"numbers":"8","score":"689","sums":"45"},{"numbers":"3","score":"688","sums":"48"},{"numbers":"5","score":"687","sums":"53"},{"numbers":"13","score":"686","sums":"66"},{"numbers":"17","score":"685","sums":"83"},{"numbers":"13","score":"684","sums":"96"},{"numbers":"16","score":"683","sums":"112"},{"numbers":"9","score":"682","sums":"121"},{"numbers":"21","score":"681","sums":"142"},{"numbers":"15","score":"680","sums":"157"},{"numbers":"16","score":"679","sums":"173"},{"numbers":"21","score":"678","sums":"194"},{"numbers":"26","score":"677","sums":"220"},{"numbers":"28","score":"676","sums":"248"},{"numbers":"23","score":"675","sums":"271"},{"numbers":"25","score":"674","sums":"296"},{"numbers":"35","score":"673","sums":"331"},{"numbers":"33","score":"672","sums":"364"},{"numbers":"50","score":"671","sums":"414"},{"numbers":"41","score":"670","sums":"455"},{"numbers":"41","score":"669","sums":"496"},{"numbers":"31","score":"668","sums":"527"},{"numbers":"47","score":"667","sums":"574"},{"numbers":"38","score":"666","sums":"612"},{"numbers":"48","score":"665","sums":"660"},{"numbers":"63","score":"664","sums":"723"},{"numbers":"58","score":"663","sums":"781"},{"numbers":"58","score":"662","sums":"839"},{"numbers":"54","score":"661","sums":"893"},{"numbers":"77","score":"660","sums":"970"},{"numbers":"62","score":"659","sums":"1032"},{"numbers":"83","score":"658","sums":"1115"},{"numbers":"71","score":"657","sums":"1186"},{"numbers":"89","score":"656","sums":"1275"},{"numbers":"97","score":"655","sums":"1372"},{"numbers":"93","score":"654","sums":"1465"},{"numbers":"119","score":"653","sums":"1584"},{"numbers":"105","score":"652","sums":"1689"},{"numbers":"112","score":"651","sums":"1801"},{"numbers":"98","score":"650","sums":"1899"},{"numbers":"113","score":"649","sums":"2012"},{"numbers":"101","score":"648","sums":"2113"},{"numbers":"117","score":"647","sums":"2230"},{"numbers":"128","score":"646","sums":"2358"},{"numbers":"139","score":"645","sums":"2497"},{"numbers":"141","score":"644","sums":"2638"},{"numbers":"145","score":"643","sums":"2783"},{"numbers":"138","score":"642","sums":"2921"},{"numbers":"164","score":"641","sums":"3085"},{"numbers":"157","score":"640","sums":"3242"},{"numbers":"192","score":"639","sums":"3434"},{"numbers":"207","score":"638","sums":"3641"},{"numbers":"171","score":"637","sums":"3812"},{"numbers":"216","score":"636","sums":"4028"},{"numbers":"213","score":"635","sums":"4241"},{"numbers":"195","score":"634","sums":"4436"},{"numbers":"215","score":"633","sums":"4651"},{"numbers":"226","score":"632","sums":"4877"},{"numbers":"227","score":"631","sums":"5104"},{"numbers":"238","score":"630","sums":"5342"},{"numbers":"230","score":"629","sums":"5572"},{"numbers":"221","score":"628","sums":"5793"},{"numbers":"254","score":"627","sums":"6047"},{"numbers":"259","score":"626","sums":"6306"},{"numbers":"268","score":"625","sums":"6574"},{"numbers":"303","score":"624","sums":"6877"},{"numbers":"289","score":"623","sums":"7166"},{"numbers":"291","score":"622","sums":"7457"},{"numbers":"300","score":"621","sums":"7757"},{"numbers":"299","score":"620","sums":"8056"},{"numbers":"315","score":"619","sums":"8371"},{"numbers":"344","score":"618","sums":"8715"},{"numbers":"305","score":"617","sums":"9020"},{"numbers":"375","score":"616","sums":"9395"},{"numbers":"341","score":"615","sums":"9736"},{"numbers":"342","score":"614","sums":"10078"},{"numbers":"386","score":"613","sums":"10464"},{"numbers":"384","score":"612","sums":"10848"},{"numbers":"371","score":"611","sums":"11219"},{"numbers":"396","score":"610","sums":"11615"},{"numbers":"400","score":"609","sums":"12015"},{"numbers":"420","score":"608","sums":"12435"},{"numbers":"423","score":"607","sums":"12858"},{"numbers":"421","score":"606","sums":"13279"},{"numbers":"446","score":"605","sums":"13725"},{"numbers":"464","score":"604","sums":"14189"},{"numbers":"440","score":"603","sums":"14629"},{"numbers":"455","score":"602","sums":"15084"},{"numbers":"470","score":"601","sums":"15554"},{"numbers":"494","score":"600","sums":"16048"},{"numbers":"462","score":"599","sums":"16510"},{"numbers":"510","score":"598","sums":"17020"},{"numbers":"529","score":"597","sums":"17549"},{"numbers":"510","score":"596","sums":"18059"},{"numbers":"504","score":"595","sums":"18563"},{"numbers":"555","score":"594","sums":"19118"},{"numbers":"566","score":"593","sums":"19684"},{"numbers":"597","score":"592","sums":"20281"},{"numbers":"569","score":"591","sums":"20850"},{"numbers":"607","score":"590","sums":"21457"},{"numbers":"567","score":"589","sums":"22024"},{"numbers":"594","score":"588","sums":"22618"},{"numbers":"621","score":"587","sums":"23239"},{"numbers":"654","score":"586","sums":"23893"},{"numbers":"629","score":"585","sums":"24522"},{"numbers":"631","score":"584","sums":"25153"},{"numbers":"634","score":"583","sums":"25787"},{"numbers":"637","score":"582","sums":"26424"},{"numbers":"671","score":"581","sums":"27095"},{"numbers":"669","score":"580","sums":"27764"},{"numbers":"712","score":"579","sums":"28476"},{"numbers":"675","score":"578","sums":"29151"},{"numbers":"690","score":"577","sums":"29841"},{"numbers":"697","score":"576","sums":"30538"},{"numbers":"713","score":"575","sums":"31251"},{"numbers":"694","score":"574","sums":"31945"},{"numbers":"691","score":"573","sums":"32636"},{"numbers":"771","score":"572","sums":"33407"},{"numbers":"717","score":"571","sums":"34124"},{"numbers":"728","score":"570","sums":"34852"},{"numbers":"722","score":"569","sums":"35574"},{"numbers":"762","score":"568","sums":"36336"},{"numbers":"793","score":"567","sums":"37129"},{"numbers":"809","score":"566","sums":"37938"},{"numbers":"815","score":"565","sums":"38753"},{"numbers":"853","score":"564","sums":"39606"},{"numbers":"798","score":"563","sums":"40404"},{"numbers":"862","score":"562","sums":"41266"},{"numbers":"902","score":"561","sums":"42168"},{"numbers":"850","score":"560","sums":"43018"},{"numbers":"850","score":"559","sums":"43868"},{"numbers":"856","score":"558","sums":"44724"},{"numbers":"888","score":"557","sums":"45612"},{"numbers":"960","score":"556","sums":"46572"},{"numbers":"944","score":"555","sums":"47516"},{"numbers":"954","score":"554","sums":"48470"},{"numbers":"917","score":"553","sums":"49387"},{"numbers":"951","score":"552","sums":"50338"},{"numbers":"956","score":"551","sums":"51294"},{"numbers":"926","score":"550","sums":"52220"},{"numbers":"986","score":"549","sums":"53206"},{"numbers":"929","score":"548","sums":"54135"},{"numbers":"970","score":"547","sums":"55105"},{"numbers":"1013","score":"546","sums":"56118"},{"numbers":"1060","score":"545","sums":"57178"},{"numbers":"999","score":"544","sums":"58177"},{"numbers":"1014","score":"543","sums":"59191"},{"numbers":"974","score":"542","sums":"60165"},{"numbers":"1049","score":"541","sums":"61214"},{"numbers":"1097","score":"540","sums":"62311"},{"numbers":"1007","score":"539","sums":"63318"},{"numbers":"1061","score":"538","sums":"64379"},{"numbers":"1048","score":"537","sums":"65427"},{"numbers":"1077","score":"536","sums":"66504"},{"numbers":"1068","score":"535","sums":"67572"},{"numbers":"1055","score":"534","sums":"68627"},{"numbers":"1087","score":"533","sums":"69714"},{"numbers":"1092","score":"532","sums":"70806"},{"numbers":"1045","score":"531","sums":"71851"},{"numbers":"1169","score":"530","sums":"73020"},{"numbers":"1138","score":"529","sums":"74158"},{"numbers":"1121","score":"528","sums":"75279"},{"numbers":"1114","score":"527","sums":"76393"},{"numbers":"1130","score":"526","sums":"77523"},{"numbers":"1129","score":"525","sums":"78652"},{"numbers":"1151","score":"524","sums":"79803"},{"numbers":"1209","score":"523","sums":"81012"},{"numbers":"1181","score":"522","sums":"82193"},{"numbers":"1121","score":"521","sums":"83314"},{"numbers":"1118","score":"520","sums":"84432"},{"numbers":"1217","score":"519","sums":"85649"},{"numbers":"1226","score":"518","sums":"86875"},{"numbers":"1220","score":"517","sums":"88095"},{"numbers":"1187","score":"516","sums":"89282"},{"numbers":"1260","score":"515","sums":"90542"},{"numbers":"1274","score":"514","sums":"91816"},{"numbers":"1289","score":"513","sums":"93105"},{"numbers":"1250","score":"512","sums":"94355"},{"numbers":"1244","score":"511","sums":"95599"},{"numbers":"1208","score":"510","sums":"96807"},{"numbers":"1296","score":"509","sums":"98103"},{"numbers":"1258","score":"508","sums":"99361"},{"numbers":"1319","score":"507","sums":"100680"},{"numbers":"1283","score":"506","sums":"101963"},{"numbers":"1246","score":"505","sums":"103209"},{"numbers":"1280","score":"504","sums":"104489"},{"numbers":"1304","score":"503","sums":"105793"},{"numbers":"1318","score":"502","sums":"107111"},{"numbers":"1286","score":"501","sums":"108397"},{"numbers":"1325","score":"500","sums":"109722"},{"numbers":"1339","score":"499","sums":"111061"},{"numbers":"1330","score":"498","sums":"112391"},{"numbers":"1337","score":"497","sums":"113728"},{"numbers":"1379","score":"496","sums":"115107"},{"numbers":"1322","score":"495","sums":"116429"},{"numbers":"1356","score":"494","sums":"117785"},{"numbers":"1387","score":"493","sums":"119172"},{"numbers":"1335","score":"492","sums":"120507"},{"numbers":"1400","score":"491","sums":"121907"},{"numbers":"1368","score":"490","sums":"123275"},{"numbers":"1407","score":"489","sums":"124682"},{"numbers":"1405","score":"488","sums":"126087"},{"numbers":"1458","score":"487","sums":"127545"},{"numbers":"1468","score":"486","sums":"129013"},{"numbers":"1378","score":"485","sums":"130391"},{"numbers":"1390","score":"484","sums":"131781"},{"numbers":"1446","score":"483","sums":"133227"},{"numbers":"1431","score":"482","sums":"134658"},{"numbers":"1502","score":"481","sums":"136160"},{"numbers":"1486","score":"480","sums":"137646"},{"numbers":"1478","score":"479","sums":"139124"},{"numbers":"1402","score":"478","sums":"140526"},{"numbers":"1434","score":"477","sums":"141960"},{"numbers":"1468","score":"476","sums":"143428"},{"numbers":"1524","score":"475","sums":"144952"},{"numbers":"1476","score":"474","sums":"146428"},{"numbers":"1427","score":"473","sums":"147855"},{"numbers":"1424","score":"472","sums":"149279"},{"numbers":"1470","score":"471","sums":"150749"},{"numbers":"1464","score":"470","sums":"152213"},{"numbers":"1513","score":"469","sums":"153726"},{"numbers":"1573","score":"468","sums":"155299"},{"numbers":"1535","score":"467","sums":"156834"},{"numbers":"1499","score":"466","sums":"158333"},{"numbers":"1555","score":"465","sums":"159888"},{"numbers":"1516","score":"464","sums":"161404"},{"numbers":"1549","score":"463","sums":"162953"},{"numbers":"1454","score":"462","sums":"164407"},{"numbers":"1522","score":"461","sums":"165929"},{"numbers":"1503","score":"460","sums":"167432"},{"numbers":"1478","score":"459","sums":"168910"},{"numbers":"1490","score":"458","sums":"170400"},{"numbers":"1594","score":"457","sums":"171994"},{"numbers":"1491","score":"456","sums":"173485"},{"numbers":"1539","score":"455","sums":"175024"},{"numbers":"1510","score":"454","sums":"176534"},{"numbers":"1578","score":"453","sums":"178112"},{"numbers":"1548","score":"452","sums":"179660"},{"numbers":"1607","score":"451","sums":"181267"},{"numbers":"1545","score":"450","sums":"182812"},{"numbers":"1524","score":"449","sums":"184336"},{"numbers":"1541","score":"448","sums":"185877"},{"numbers":"1553","score":"447","sums":"187430"},{"numbers":"1627","score":"446","sums":"189057"},{"numbers":"1604","score":"445","sums":"190661"},{"numbers":"1582","score":"444","sums":"192243"},{"numbers":"1582","score":"443","sums":"193825"},{"numbers":"1617","score":"442","sums":"195442"},{"numbers":"1611","score":"441","sums":"197053"},{"numbers":"1605","score":"440","sums":"198658"},{"numbers":"1559","score":"439","sums":"200217"},{"numbers":"1479","score":"438","sums":"201696"},{"numbers":"1620","score":"437","sums":"203316"},{"numbers":"1601","score":"436","sums":"204917"},{"numbers":"1592","score":"435","sums":"206509"},{"numbers":"1603","score":"434","sums":"208112"},{"numbers":"1587","score":"433","sums":"209699"},{"numbers":"1601","score":"432","sums":"211300"},{"numbers":"1492","score":"431","sums":"212792"},{"numbers":"1520","score":"430","sums":"214312"},{"numbers":"1496","score":"429","sums":"215808"},{"numbers":"1576","score":"428","sums":"217384"},{"numbers":"1593","score":"427","sums":"218977"},{"numbers":"1537","score":"426","sums":"220514"},{"numbers":"1553","score":"425","sums":"222067"},{"numbers":"1581","score":"424","sums":"223648"},{"numbers":"1479","score":"423","sums":"225127"},{"numbers":"1637","score":"422","sums":"226764"},{"numbers":"1531","score":"421","sums":"228295"},{"numbers":"1614","score":"420","sums":"229909"},{"numbers":"1524","score":"419","sums":"231433"},{"numbers":"1533","score":"418","sums":"232966"},{"numbers":"1522","score":"417","sums":"234488"},{"numbers":"1448","score":"416","sums":"235936"},{"numbers":"1505","score":"415","sums":"237441"},{"numbers":"1536","score":"414","sums":"238977"},{"numbers":"1588","score":"413","sums":"240565"},{"numbers":"1497","score":"412","sums":"242062"},{"numbers":"1454","score":"411","sums":"243516"},{"numbers":"1483","score":"410","sums":"244999"},{"numbers":"1461","score":"409","sums":"246460"},{"numbers":"1432","score":"408","sums":"247892"},{"numbers":"1524","score":"407","sums":"249416"},{"numbers":"1374","score":"406","sums":"250790"},{"numbers":"1474","score":"405","sums":"252264"},{"numbers":"1534","score":"404","sums":"253798"},{"numbers":"1421","score":"403","sums":"255219"},{"numbers":"1433","score":"402","sums":"256652"},{"numbers":"1393","score":"401","sums":"258045"},{"numbers":"1468","score":"400","sums":"259513"},{"numbers":"1403","score":"399","sums":"260916"},{"numbers":"1465","score":"398","sums":"262381"},{"numbers":"1475","score":"397","sums":"263856"},{"numbers":"1407","score":"396","sums":"265263"},{"numbers":"1491","score":"395","sums":"266754"},{"numbers":"1467","score":"394","sums":"268221"},{"numbers":"1447","score":"393","sums":"269668"},{"numbers":"1425","score":"392","sums":"271093"},{"numbers":"1370","score":"391","sums":"272463"},{"numbers":"1342","score":"390","sums":"273805"},{"numbers":"1373","score":"389","sums":"275178"},{"numbers":"1368","score":"388","sums":"276546"},{"numbers":"1339","score":"387","sums":"277885"},{"numbers":"1314","score":"386","sums":"279199"},{"numbers":"1321","score":"385","sums":"280520"},{"numbers":"1352","score":"384","sums":"281872"},{"numbers":"1287","score":"383","sums":"283159"},{"numbers":"1341","score":"382","sums":"284500"},{"numbers":"1313","score":"381","sums":"285813"},{"numbers":"1308","score":"380","sums":"287121"},{"numbers":"1193","score":"379","sums":"288314"},{"numbers":"1227","score":"378","sums":"289541"},{"numbers":"1263","score":"377","sums":"290804"},{"numbers":"1340","score":"376","sums":"292144"},{"numbers":"1267","score":"375","sums":"293411"},{"numbers":"1283","score":"374","sums":"294694"},{"numbers":"1216","score":"373","sums":"295910"},{"numbers":"1188","score":"372","sums":"297098"},{"numbers":"1226","score":"371","sums":"298324"},{"numbers":"1189","score":"370","sums":"299513"},{"numbers":"1203","score":"369","sums":"300716"},{"numbers":"1229","score":"368","sums":"301945"},{"numbers":"1171","score":"367","sums":"303116"},{"numbers":"1154","score":"366","sums":"304270"},{"numbers":"1182","score":"365","sums":"305452"},{"numbers":"1191","score":"364","sums":"306643"},{"numbers":"1147","score":"363","sums":"307790"},{"numbers":"1114","score":"362","sums":"308904"},{"numbers":"1132","score":"361","sums":"310036"},{"numbers":"1133","score":"360","sums":"311169"},{"numbers":"1069","score":"359","sums":"312238"},{"numbers":"1141","score":"358","sums":"313379"},{"numbers":"1149","score":"357","sums":"314528"},{"numbers":"1170","score":"356","sums":"315698"},{"numbers":"1125","score":"355","sums":"316823"},{"numbers":"1057","score":"354","sums":"317880"},{"numbers":"1052","score":"353","sums":"318932"},{"numbers":"1053","score":"352","sums":"319985"},{"numbers":"1036","score":"351","sums":"321021"},{"numbers":"1055","score":"350","sums":"322076"},{"numbers":"1071","score":"349","sums":"323147"},{"numbers":"1067","score":"348","sums":"324214"},{"numbers":"985","score":"347","sums":"325199"},{"numbers":"1005","score":"346","sums":"326204"},{"numbers":"1024","score":"345","sums":"327228"},{"numbers":"961","score":"344","sums":"328189"},{"numbers":"1016","score":"343","sums":"329205"},{"numbers":"994","score":"342","sums":"330199"},{"numbers":"1009","score":"341","sums":"331208"},{"numbers":"979","score":"340","sums":"332187"},{"numbers":"921","score":"339","sums":"333108"},{"numbers":"983","score":"338","sums":"334091"},{"numbers":"948","score":"337","sums":"335039"},{"numbers":"964","score":"336","sums":"336003"},{"numbers":"958","score":"335","sums":"336961"},{"numbers":"892","score":"334","sums":"337853"},{"numbers":"938","score":"333","sums":"338791"},{"numbers":"930","score":"332","sums":"339721"},{"numbers":"905","score":"331","sums":"340626"},{"numbers":"888","score":"330","sums":"341514"},{"numbers":"927","score":"329","sums":"342441"},{"numbers":"882","score":"328","sums":"343323"},{"numbers":"931","score":"327","sums":"344254"},{"numbers":"849","score":"326","sums":"345103"},{"numbers":"872","score":"325","sums":"345975"},{"numbers":"874","score":"324","sums":"346849"},{"numbers":"860","score":"323","sums":"347709"},{"numbers":"816","score":"322","sums":"348525"},{"numbers":"818","score":"321","sums":"349343"},{"numbers":"829","score":"320","sums":"350172"},{"numbers":"842","score":"319","sums":"351014"},{"numbers":"791","score":"318","sums":"351805"},{"numbers":"834","score":"317","sums":"352639"},{"numbers":"760","score":"316","sums":"353399"},{"numbers":"763","score":"315","sums":"354162"},{"numbers":"764","score":"314","sums":"354926"},{"numbers":"732","score":"313","sums":"355658"},{"numbers":"798","score":"312","sums":"356456"},{"numbers":"737","score":"311","sums":"357193"},{"numbers":"760","score":"310","sums":"357953"},{"numbers":"724","score":"309","sums":"358677"},{"numbers":"782","score":"308","sums":"359459"},{"numbers":"717","score":"307","sums":"360176"},{"numbers":"744","score":"306","sums":"360920"},{"numbers":"754","score":"305","sums":"361674"},{"numbers":"684","score":"304","sums":"362358"},{"numbers":"696","score":"303","sums":"363054"},{"numbers":"694","score":"302","sums":"363748"},{"numbers":"663","score":"301","sums":"364411"},{"numbers":"655","score":"300","sums":"365066"},{"numbers":"691","score":"299","sums":"365757"},{"numbers":"661","score":"298","sums":"366418"},{"numbers":"631","score":"297","sums":"367049"},{"numbers":"649","score":"296","sums":"367698"},{"numbers":"618","score":"295","sums":"368316"},{"numbers":"655","score":"294","sums":"368971"},{"numbers":"582","score":"293","sums":"369553"},{"numbers":"622","score":"292","sums":"370175"},{"numbers":"628","score":"291","sums":"370803"},{"numbers":"593","score":"290","sums":"371396"},{"numbers":"620","score":"289","sums":"372016"},{"numbers":"573","score":"288","sums":"372589"},{"numbers":"581","score":"287","sums":"373170"},{"numbers":"571","score":"286","sums":"373741"},{"numbers":"573","score":"285","sums":"374314"},{"numbers":"560","score":"284","sums":"374874"},{"numbers":"564","score":"283","sums":"375438"},{"numbers":"604","score":"282","sums":"376042"},{"numbers":"566","score":"281","sums":"376608"},{"numbers":"543","score":"280","sums":"377151"},{"numbers":"547","score":"279","sums":"377698"},{"numbers":"515","score":"278","sums":"378213"},{"numbers":"541","score":"277","sums":"378754"},{"numbers":"489","score":"276","sums":"379243"},{"numbers":"509","score":"275","sums":"379752"},{"numbers":"489","score":"274","sums":"380241"},{"numbers":"501","score":"273","sums":"380742"},{"numbers":"481","score":"272","sums":"381223"},{"numbers":"488","score":"271","sums":"381711"},{"numbers":"509","score":"270","sums":"382220"},{"numbers":"487","score":"269","sums":"382707"},{"numbers":"437","score":"268","sums":"383144"},{"numbers":"465","score":"267","sums":"383609"},{"numbers":"432","score":"266","sums":"384041"},{"numbers":"434","score":"265","sums":"384475"},{"numbers":"418","score":"264","sums":"384893"},{"numbers":"426","score":"263","sums":"385319"},{"numbers":"429","score":"262","sums":"385748"},{"numbers":"438","score":"261","sums":"386186"},{"numbers":"409","score":"260","sums":"386595"},{"numbers":"428","score":"259","sums":"387023"},{"numbers":"393","score":"258","sums":"387416"},{"numbers":"421","score":"257","sums":"387837"},{"numbers":"360","score":"256","sums":"388197"},{"numbers":"409","score":"255","sums":"388606"},{"numbers":"402","score":"254","sums":"389008"},{"numbers":"342","score":"253","sums":"389350"},{"numbers":"392","score":"252","sums":"389742"},{"numbers":"352","score":"251","sums":"390094"},{"numbers":"396","score":"250","sums":"390490"},{"numbers":"360","score":"249","sums":"390850"},{"numbers":"365","score":"248","sums":"391215"},{"numbers":"340","score":"247","sums":"391555"},{"numbers":"359","score":"246","sums":"391914"},{"numbers":"362","score":"245","sums":"392276"},{"numbers":"342","score":"244","sums":"392618"},{"numbers":"341","score":"243","sums":"392959"},{"numbers":"337","score":"242","sums":"393296"},{"numbers":"320","score":"241","sums":"393616"},{"numbers":"348","score":"240","sums":"393964"},{"numbers":"322","score":"239","sums":"394286"},{"numbers":"305","score":"238","sums":"394591"},{"numbers":"263","score":"237","sums":"394854"},{"numbers":"274","score":"236","sums":"395128"},{"numbers":"281","score":"235","sums":"395409"},{"numbers":"278","score":"234","sums":"395687"},{"numbers":"270","score":"233","sums":"395957"},{"numbers":"311","score":"232","sums":"396268"},{"numbers":"281","score":"231","sums":"396549"},{"numbers":"279","score":"230","sums":"396828"},{"numbers":"276","score":"229","sums":"397104"},{"numbers":"249","score":"228","sums":"397353"},{"numbers":"271","score":"227","sums":"397624"},{"numbers":"216","score":"226","sums":"397840"},{"numbers":"278","score":"225","sums":"398118"},{"numbers":"257","score":"224","sums":"398375"},{"numbers":"219","score":"223","sums":"398594"},{"numbers":"251","score":"222","sums":"398845"},{"numbers":"251","score":"221","sums":"399096"},{"numbers":"222","score":"220","sums":"399318"},{"numbers":"229","score":"219","sums":"399547"},{"numbers":"211","score":"218","sums":"399758"},{"numbers":"242","score":"217","sums":"400000"},{"numbers":"207","score":"216","sums":"400207"},{"numbers":"231","score":"215","sums":"400438"},{"numbers":"238","score":"214","sums":"400676"},{"numbers":"200","score":"213","sums":"400876"},{"numbers":"224","score":"212","sums":"401100"},{"numbers":"206","score":"211","sums":"401306"},{"numbers":"177","score":"210","sums":"401483"},{"numbers":"171","score":"209","sums":"401654"},{"numbers":"185","score":"208","sums":"401839"},{"numbers":"169","score":"207","sums":"402008"},{"numbers":"187","score":"206","sums":"402195"},{"numbers":"186","score":"205","sums":"402381"},{"numbers":"169","score":"204","sums":"402550"},{"numbers":"170","score":"203","sums":"402720"},{"numbers":"157","score":"202","sums":"402877"},{"numbers":"181","score":"201","sums":"403058"},{"numbers":"165","score":"200","sums":"403223"},{"numbers":"153","score":"199","sums":"403376"},{"numbers":"141","score":"198","sums":"403517"},{"numbers":"152","score":"197","sums":"403669"},{"numbers":"131","score":"196","sums":"403800"},{"numbers":"158","score":"195","sums":"403958"},{"numbers":"158","score":"194","sums":"404116"},{"numbers":"164","score":"193","sums":"404280"},{"numbers":"119","score":"192","sums":"404399"},{"numbers":"124","score":"191","sums":"404523"},{"numbers":"145","score":"190","sums":"404668"},{"numbers":"141","score":"189","sums":"404809"},{"numbers":"106","score":"188","sums":"404915"},{"numbers":"104","score":"187","sums":"405019"},{"numbers":"119","score":"186","sums":"405138"},{"numbers":"113","score":"185","sums":"405251"},{"numbers":"99","score":"184","sums":"405350"},{"numbers":"110","score":"183","sums":"405460"},{"numbers":"98","score":"182","sums":"405558"},{"numbers":"99","score":"181","sums":"405657"},{"numbers":"105","score":"180","sums":"405762"},{"numbers":"102","score":"179","sums":"405864"},{"numbers":"95","score":"178","sums":"405959"},{"numbers":"105","score":"177","sums":"406064"},{"numbers":"95","score":"176","sums":"406159"},{"numbers":"85","score":"175","sums":"406244"},{"numbers":"65","score":"174","sums":"406309"},{"numbers":"102","score":"173","sums":"406411"},{"numbers":"80","score":"172","sums":"406491"},{"numbers":"64","score":"171","sums":"406555"},{"numbers":"70","score":"170","sums":"406625"},{"numbers":"84","score":"169","sums":"406709"},{"numbers":"78","score":"168","sums":"406787"},{"numbers":"78","score":"167","sums":"406865"},{"numbers":"60","score":"166","sums":"406925"},{"numbers":"81","score":"165","sums":"407006"},{"numbers":"62","score":"164","sums":"407068"},{"numbers":"47","score":"163","sums":"407115"},{"numbers":"51","score":"162","sums":"407166"},{"numbers":"64","score":"161","sums":"407230"},{"numbers":"50","score":"160","sums":"407280"},{"numbers":"75","score":"159","sums":"407355"},{"numbers":"55","score":"158","sums":"407410"},{"numbers":"58","score":"157","sums":"407468"},{"numbers":"29","score":"156","sums":"407497"},{"numbers":"41","score":"155","sums":"407538"},{"numbers":"40","score":"154","sums":"407578"},{"numbers":"40","score":"153","sums":"407618"},{"numbers":"27","score":"152","sums":"407645"},{"numbers":"41","score":"151","sums":"407686"},{"numbers":"41","score":"150","sums":"407727"},{"numbers":"42","score":"149","sums":"407769"},{"numbers":"41","score":"148","sums":"407810"},{"numbers":"46","score":"147","sums":"407856"},{"numbers":"29","score":"146","sums":"407885"},{"numbers":"25","score":"145","sums":"407910"},{"numbers":"39","score":"144","sums":"407949"},{"numbers":"37","score":"143","sums":"407986"},{"numbers":"27","score":"142","sums":"408013"},{"numbers":"24","score":"141","sums":"408037"},{"numbers":"22","score":"140","sums":"408059"},{"numbers":"24","score":"139","sums":"408083"},{"numbers":"20","score":"138","sums":"408103"},{"numbers":"23","score":"137","sums":"408126"},{"numbers":"22","score":"136","sums":"408148"},{"numbers":"25","score":"135","sums":"408173"},{"numbers":"17","score":"134","sums":"408190"},{"numbers":"31","score":"133","sums":"408221"},{"numbers":"23","score":"132","sums":"408244"},{"numbers":"13","score":"131","sums":"408257"},{"numbers":"20","score":"130","sums":"408277"},{"numbers":"13","score":"129","sums":"408290"},{"numbers":"19","score":"128","sums":"408309"},{"numbers":"13","score":"127","sums":"408322"},{"numbers":"21","score":"126","sums":"408343"},{"numbers":"11","score":"125","sums":"408354"},{"numbers":"10","score":"124","sums":"408364"},{"numbers":"17","score":"123","sums":"408381"},{"numbers":"10","score":"122","sums":"408391"},{"numbers":"6","score":"121","sums":"408397"},{"numbers":"9","score":"120","sums":"408406"},{"numbers":"12","score":"119","sums":"408418"},{"numbers":"12","score":"118","sums":"408430"},{"numbers":"6","score":"117","sums":"408436"},{"numbers":"7","score":"116","sums":"408443"},{"numbers":"11","score":"115","sums":"408454"},{"numbers":"9","score":"114","sums":"408463"},{"numbers":"5","score":"113","sums":"408468"},{"numbers":"15","score":"112","sums":"408483"},{"numbers":"6","score":"111","sums":"408489"},{"numbers":"5","score":"110","sums":"408494"},{"numbers":"9","score":"109","sums":"408503"},{"numbers":"6","score":"108","sums":"408509"},{"numbers":"8","score":"107","sums":"408517"},{"numbers":"3","score":"106","sums":"408520"},{"numbers":"9","score":"105","sums":"408529"},{"numbers":"5","score":"104","sums":"408534"},{"numbers":"7","score":"103","sums":"408541"},{"numbers":"6","score":"102","sums":"408547"},{"numbers":"4","score":"101","sums":"408551"},{"numbers":"6","score":"100","sums":"408557"}]
         */

        private String art_or_science;
        private int data_year;
        private String is_new_pro;
        private String location;
        private String req_type;
        private int score;
        private String session_id;
        private int status_code;
        private String status_msg;
        private int student_rank;
        private int students_sum;
        private String y2y;
        private int year;
        private ExamineeGoBean examinee_go;
        private List<WeiciDistributionBean> weici_distribution;

        public String getArt_or_science() {
            return art_or_science;
        }

        public void setArt_or_science(String art_or_science) {
            this.art_or_science = art_or_science;
        }

        public int getData_year() {
            return data_year;
        }

        public void setData_year(int data_year) {
            this.data_year = data_year;
        }

        public String getIs_new_pro() {
            return is_new_pro;
        }

        public void setIs_new_pro(String is_new_pro) {
            this.is_new_pro = is_new_pro;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getReq_type() {
            return req_type;
        }

        public void setReq_type(String req_type) {
            this.req_type = req_type;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getSession_id() {
            return session_id;
        }

        public void setSession_id(String session_id) {
            this.session_id = session_id;
        }

        public int getStatus_code() {
            return status_code;
        }

        public void setStatus_code(int status_code) {
            this.status_code = status_code;
        }

        public String getStatus_msg() {
            return status_msg;
        }

        public void setStatus_msg(String status_msg) {
            this.status_msg = status_msg;
        }

        public int getStudent_rank() {
            return student_rank;
        }

        public void setStudent_rank(int student_rank) {
            this.student_rank = student_rank;
        }

        public int getStudents_sum() {
            return students_sum;
        }

        public void setStudents_sum(int students_sum) {
            this.students_sum = students_sum;
        }

        public String getY2y() {
            return y2y;
        }

        public void setY2y(String y2y) {
            this.y2y = y2y;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public ExamineeGoBean getExaminee_go() {
            return examinee_go;
        }

        public void setExaminee_go(ExamineeGoBean examinee_go) {
            this.examinee_go = examinee_go;
        }

        public List<WeiciDistributionBean> getWeici_distribution() {
            return weici_distribution;
        }

        public void setWeici_distribution(List<WeiciDistributionBean> weici_distribution) {
            this.weici_distribution = weici_distribution;
        }

        public static class ExamineeGoBean {
            private List<GoCityBean> go_city;
            private List<GoCollegesBean> go_colleges;
            private List<GoMajorBean> go_major;

            public List<GoCityBean> getGo_city() {
                return go_city;
            }

            public void setGo_city(List<GoCityBean> go_city) {
                this.go_city = go_city;
            }

            public List<GoCollegesBean> getGo_colleges() {
                return go_colleges;
            }

            public void setGo_colleges(List<GoCollegesBean> go_colleges) {
                this.go_colleges = go_colleges;
            }

            public List<GoMajorBean> getGo_major() {
                return go_major;
            }

            public void setGo_major(List<GoMajorBean> go_major) {
                this.go_major = go_major;
            }

            public static class GoCityBean {
                /**
                 * name : 上海
                 * numbers : 10
                 * percent : 0.2702702581882477
                 */

                private String name;
                private int numbers;
                private double percent;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getNumbers() {
                    return numbers;
                }

                public void setNumbers(int numbers) {
                    this.numbers = numbers;
                }

                public double getPercent() {
                    return percent;
                }

                public void setPercent(double percent) {
                    this.percent = percent;
                }
            }

            public static class GoCollegesBean {
                /**
                 * icon : //ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=99536C640ED32F61AB3CA21D9186A1BD&tv=0_0&x.jpg
                 * name : 中国石油大学(华东)
                 * numbers : 2
                 * percent : 0.20000000298023224
                 */

                private String icon;
                private String name;
                private int numbers;
                private double percent;

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getNumbers() {
                    return numbers;
                }

                public void setNumbers(int numbers) {
                    this.numbers = numbers;
                }

                public double getPercent() {
                    return percent;
                }

                public void setPercent(double percent) {
                    this.percent = percent;
                }
            }

            public static class GoMajorBean {
                /**
                 * category : 工学
                 * name : 计算机科学与技术
                 * numbers : 40
                 * percent : 0.26143792271614075
                 */

                private String category;
                private String name;
                private int numbers;
                private double percent;

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getNumbers() {
                    return numbers;
                }

                public void setNumbers(int numbers) {
                    this.numbers = numbers;
                }

                public double getPercent() {
                    return percent;
                }

                public void setPercent(double percent) {
                    this.percent = percent;
                }
            }
        }

        public static class WeiciDistributionBean {
            /**
             * numbers : 11
             * score : 697
             * sums : 11
             */

            private String numbers;
            private String score;
            private String sums;

            public String getNumbers() {
                return numbers;
            }

            public void setNumbers(String numbers) {
                this.numbers = numbers;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getSums() {
                return sums;
            }

            public void setSums(String sums) {
                this.sums = sums;
            }
        }

}
