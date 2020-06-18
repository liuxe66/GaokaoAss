package com.liuxe.gaokaoass.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZntbMajorCollegeBean {


        /**
         * art_or_science : 理科
         * batch : 本科
         * batchs : ["本科","专科"]
         * city : ["北京","天津","上海","重庆","黑龙江","吉林","辽宁","内蒙古","河北","山西","陕西","宁夏","甘肃","青海","新疆","山东","河南","江苏","安徽","湖北","四川","西藏","浙江","江西","湖南","贵州","福建","广东","广西","云南","海南"]
         * college_count : 87
         * colleges : [{"2019_lowest_like_score":"581","2019_lowest_wenke_score":"587","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=737015A1B51119708CA799110A5EB2E0&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27095,"lowest_score":581,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"584","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":25153,"lowest_score":584,"name":"土木工程","probability":0.4325,"subject":""}],"name":"西北农林科技大学","probability":0.5319,"tags":["双一流","985","211"],"type":"农林类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"592","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AAA7F2CB1DCF40BEFEC752EC9C3BDD35&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"619","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":8371,"lowest_score":619,"name":"土木工程","probability":0.0010000000000000009,"subject":""}],"name":"南京航空航天大学","probability":0.5675,"tags":["双一流","211"],"type":"理工类","year":2019},{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"577","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=1542442A308969BE769280D7EDC075FF&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"583","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":25787,"lowest_score":583,"name":"土木工程(试验班)","probability":0.46809999999999996,"subject":""},{"2019_lowest_like_score":"583","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":25787,"lowest_score":583,"name":"土木工程","probability":0.46809999999999996,"subject":""}],"name":"太原理工大学","probability":0.5987,"tags":["双一流","211"],"type":"理工类","year":2019},{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"583","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=35796EE953517252184E9B3CF12F55AE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"name":"土木类(土木工程、建筑环境与能源应用工程、给排水科学与工程)","probability":0.5987,"subject":""}],"name":"南昌大学","probability":0.5987,"tags":["双一流","211"],"type":"综合类","year":2019},{"2019_lowest_like_score":"574","2019_lowest_wenke_score":"576","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=DBD9F8A935E542AD83A6FC1CAD59CEBE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":31945,"lowest_score":574,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"578","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":29151,"lowest_score":578,"name":"土木工程","probability":0.6331,"subject":""}],"name":"江苏大学","probability":0.7486,"type":"综合类","year":2019},{"2019_lowest_like_score":"574","2019_lowest_wenke_score":"565","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=C342EDE0E6334C3C37CFA761530D50E4&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":31945,"lowest_score":574,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"name":"土木工程","probability":0.5987,"subject":""}],"name":"成都理工大学","probability":0.7486,"tags":["双一流"],"type":"理工类","year":2019},{"2019_lowest_like_score":"574","2019_lowest_wenke_score":"565","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=ED4918524EC60728E1C33C6EEDBC10B8&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":31945,"lowest_score":574,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"name":"土木工程(卓越班)","probability":0.5987,"subject":""},{"2019_lowest_like_score":"588","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":22618,"lowest_score":588,"name":"土木工程(本硕)","probability":0.3015,"subject":""}],"name":"西安建筑科技大学","probability":0.7486,"type":"理工类","year":2019},{"2019_lowest_like_score":"572","2019_lowest_wenke_score":"576","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=72575FC5221278803428C3F80DA9E7EB&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":33407,"lowest_score":572,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"572","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":21,"is_new_pro":"0","lowest_rank":33407,"lowest_score":572,"name":"土木工程","probability":0.7967,"subject":""}],"name":"海南大学","probability":0.7967,"tags":["双一流","211"],"type":"综合类","year":2019},{"2019_lowest_like_score":"564","2019_lowest_wenke_score":"560","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=F9EA07D619F146A10C570B60126F4F00&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":39606,"lowest_score":564,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"574","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":31945,"lowest_score":574,"name":"土木工程","probability":0.7486,"subject":""}],"name":"青岛理工大学","probability":0.9265,"type":"理工类","year":2019},{"2019_lowest_like_score":"563","2019_lowest_wenke_score":"568","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=61A2B271EA69A7E9511379067BD6C046&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":40404,"lowest_score":563,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"name":"土木工程","probability":0.5675,"subject":""}],"name":"燕山大学","probability":0.937,"type":"理工类","year":2019},{"2019_lowest_like_score":"562","2019_lowest_wenke_score":"560","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=A7C454D3B2E6DB6FA2B9A55E27FBFBB8&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":41266,"lowest_score":562,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"565","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":38753,"lowest_score":565,"name":"土木工程","probability":0.9147,"subject":""}],"name":"苏州科技大学","probability":0.9452,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"561","2019_lowest_wenke_score":"571","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=5BA746FFB62DA795DCB58509695DBAFB&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":42168,"lowest_score":561,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"565","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":38753,"lowest_score":565,"name":"土木工程","probability":0.9147,"subject":""}],"name":"东北农业大学","probability":0.9535,"tags":["双一流","211"],"type":"农林类","year":2019},{"2019_lowest_like_score":"559","2019_lowest_wenke_score":"562","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6BE760AD00244EAE712196803964F2E1&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":43868,"lowest_score":559,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"561","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":42168,"lowest_score":561,"name":"土木工程","probability":0.9535,"subject":""}],"name":"湖南科技大学","probability":0.9656,"type":"综合类","year":2019},{"2019_lowest_like_score":"555","2019_lowest_wenke_score":"561","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0B9C29734407DF3F9F3CD12CB2F19A60&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":47516,"lowest_score":555,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"559","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":43868,"lowest_score":559,"name":"土木工程","probability":0.9656,"subject":""}],"name":"中北大学","probability":0.9826,"type":"理工类","year":2019},{"2019_lowest_like_score":"554","2019_lowest_wenke_score":"555","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=097D00BADF9D6F1E31BDAAF33383E0DC&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":48470,"lowest_score":554,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"555","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":47516,"lowest_score":555,"name":"土木工程","probability":0.9826,"subject":""}],"name":"三峡大学","probability":0.9964,"type":"综合类","year":2019},{"2019_lowest_like_score":"554","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=B07C8602EF8FA29958FEDDEC247442C1&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":48470,"lowest_score":554,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"554","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":48470,"lowest_score":554,"name":"土木工程","probability":0.9854,"subject":""}],"name":"东北电力大学","probability":0.9854,"type":"理工类","year":2019},{"2019_lowest_like_score":"547","2019_lowest_wenke_score":"569","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6DD79F72C0BAD9C4361C90E6786F7AE2&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":55105,"lowest_score":547,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"567","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":37129,"lowest_score":567,"name":"土木工程（公路与桥梁）","probability":0.8888,"subject":""}],"name":"内蒙古大学","probability":0.9962,"tags":["双一流","211"],"type":"综合类","year":2019},{"2019_lowest_like_score":"545","2019_lowest_wenke_score":"539","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=B49AFC00D3B4B627D0142B3A82B38832&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":57178,"lowest_score":545,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"548","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":54135,"lowest_score":548,"name":"土木工程","probability":0.9953,"subject":""}],"name":"华北理工大学","probability":0.9974,"type":"综合类","year":2019},{"2019_lowest_like_score":"545","2019_lowest_wenke_score":"567","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=16F9C6EF310BD5B7207976AAD46C4876&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":57178,"lowest_score":545,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"562","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":41266,"lowest_score":562,"name":"土木工程","probability":0.9452,"subject":""}],"name":"河北大学","probability":0.9974,"type":"综合类","year":2019},{"2019_lowest_like_score":"542","2019_lowest_wenke_score":"574","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=376F719E185BC3D579B2017FE3D286EC&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":60165,"lowest_score":542,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"546","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":56118,"lowest_score":546,"name":"土木工程","probability":0.9968,"subject":""}],"name":"华侨大学","probability":0.9987,"type":"综合类","year":2019},{"2019_lowest_like_score":"538","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=318FBFED3573BFF4C881E8DF30A7F3CF&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":64379,"lowest_score":538,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"542","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":59191,"lowest_score":542,"name":"土木工程","probability":0.9987,"subject":""}],"name":"大连交通大学","probability":0.9987,"type":"理工类","year":2019},{"2019_lowest_like_score":"531","2019_lowest_wenke_score":"547","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6B5F92D7388A8B423FCCCC34BC5D73B0&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":71851,"lowest_score":531,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"531","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":71851,"lowest_score":531,"name":"土木工程","probability":0.999,"subject":""}],"name":"河南科技大学","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"527","2019_lowest_wenke_score":"572","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=1576CB39F693B08E99B8A5EF6797ACD4&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":76393,"lowest_score":527,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"575","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":31251,"lowest_score":575,"name":"土木工程","probability":0.719,"subject":""}],"name":"湘潭大学","probability":0.9904,"type":"综合类","year":2019},{"2019_lowest_like_score":"526","2019_lowest_wenke_score":"542","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=C0B375A868ECC0E7D041E442DA81B352&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":77523,"lowest_score":526,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"535","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":6,"is_new_pro":"0","lowest_rank":67572,"lowest_score":535,"name":"土木工程","probability":0.999,"subject":""}],"name":"东北石油大学","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"523","2019_lowest_wenke_score":"551","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=69328CC69B74E05BE789FCD8A8FF965F&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":81012,"lowest_score":523,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"528","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":75279,"lowest_score":528,"name":"土木工程","probability":0.999,"subject":""}],"name":"浙江农林大学","probability":0.999,"type":"农林类","year":2019},{"2019_lowest_like_score":"522","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=5CBDF16051FB176E39B2154E09A7B5B1&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":82193,"lowest_score":522,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"566","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":37938,"lowest_score":566,"name":"土木工程(卓越计划班)","probability":0.9032,"subject":""},{"2019_lowest_like_score":"542","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":60165,"lowest_score":542,"name":"土木工程","probability":0.9987,"subject":""}],"name":"兰州交通大学","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"518","2019_lowest_wenke_score":"539","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0D08D56D584ED85AC623CCF474063278&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":86875,"lowest_score":518,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"522","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":82193,"lowest_score":522,"name":"土木工程","probability":0.999,"subject":""}],"name":"厦门理工学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"513","2019_lowest_wenke_score":"545","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=F3463CCEBD1F34B42BF38D51290C7D5A&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":93105,"lowest_score":513,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"514","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":91816,"lowest_score":514,"name":"土木工程","probability":0.999,"subject":""}],"name":"辽宁石油化工大学","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"512","2019_lowest_wenke_score":"540","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=E9E44423516CF43EA60744AF88F54BA9&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":94355,"lowest_score":512,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"513","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":93105,"lowest_score":513,"name":"土木工程","probability":0.999,"subject":""}],"name":"浙江海洋大学","probability":0.999,"type":"农林类","year":2019},{"2019_lowest_like_score":"507","2019_lowest_wenke_score":"569","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=70D664AF73448C7E669F29D5AD071A8C&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":100680,"lowest_score":507,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"543","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":59191,"lowest_score":543,"name":"土木工程","probability":0.9983,"subject":""}],"name":"中国民航大学","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"505","2019_lowest_wenke_score":"536","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=E91EDDD1F9FA7689303D460F14E854B6&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":103209,"lowest_score":505,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"505","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":103209,"lowest_score":505,"name":"土木工程","probability":0.999,"subject":""}],"name":"宁波工程学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"503","2019_lowest_wenke_score":"539","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=84E4A34D89C48217D4B2A5D488614ADE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":105793,"lowest_score":503,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"534","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":68627,"lowest_score":534,"name":"土木工程(国家专项)","probability":0.999,"subject":""},{"2019_lowest_like_score":"553","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":49387,"lowest_score":553,"name":"土木工程","probability":0.9878,"subject":""}],"name":"沈阳建筑大学","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"502","2019_lowest_wenke_score":"555","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6ADBB655D260F278686D0DAF95D7FE98&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":107111,"lowest_score":502,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"512","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":94355,"lowest_score":512,"name":"土木工程","probability":0.999,"subject":""}],"name":"中南林业科技大学","probability":0.999,"type":"农林类","year":2019},{"2019_lowest_like_score":"502","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AE7C28F7CEBC44B836147E1DFB26BADE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":107111,"lowest_score":502,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"504","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":39,"is_new_pro":"0","lowest_rank":104489,"lowest_score":504,"name":"土木工程（装配式建筑方向）","probability":0.999,"subject":""}],"name":"河南城建学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"502","2019_lowest_wenke_score":"536","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=11FE72D4EEB0BB0657268FA09ED43A63&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":107111,"lowest_score":502,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"503","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":105793,"lowest_score":503,"name":"土木工程","probability":0.999,"subject":""}],"name":"聊城大学","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"499","2019_lowest_wenke_score":"531","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=35AEE3E6E0757CD93B4350E5A3CE71E5&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":111061,"lowest_score":499,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"506","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":101963,"lowest_score":506,"name":"土木工程","probability":0.999,"subject":""}],"name":"湖北工程学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"499","2019_lowest_wenke_score":"536","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=EEDB91B574D75391B815D795689111E1&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":111061,"lowest_score":499,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"502","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":5,"is_new_pro":"0","lowest_rank":105793,"lowest_score":502,"name":"土木工程","probability":0.999,"subject":""}],"name":"沈阳大学","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"497","2019_lowest_wenke_score":"534","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=470ED9047885D87442B56E5BB8884F22&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":113728,"lowest_score":497,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"504","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":104489,"lowest_score":504,"name":"土木工程","probability":0.999,"subject":""}],"name":"郑州航空工业管理学院","probability":0.999,"type":"财经类","year":2019},{"2019_lowest_like_score":"496","2019_lowest_wenke_score":"535","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=4CE82824C3308BB177CCFFBA1B9FA02D&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":115107,"lowest_score":496,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"506","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":5,"is_new_pro":"0","lowest_rank":101963,"lowest_score":506,"name":"土木工程","probability":0.999,"subject":""}],"name":"辽宁科技大学","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"496","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=4ADFB2D1572E2AAC4C7FDCA6F4766C52&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":115107,"lowest_score":496,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"500","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":108397,"lowest_score":500,"name":"土木工程","probability":0.999,"subject":""}],"name":"河北建筑工程学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"496","2019_lowest_wenke_score":"529","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AB59A994EF78547615EA4D3CA321678E&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":115107,"lowest_score":496,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"497","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":113728,"lowest_score":497,"name":"土木工程","probability":0.999,"subject":""}],"name":"广西科技大学","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"493","2019_lowest_wenke_score":"530","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6CDF347112452E94E0A1FBD155F95190&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":119172,"lowest_score":493,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"494","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":117785,"lowest_score":494,"name":"土木工程","probability":0.999,"subject":""}],"name":"西北民族大学","probability":0.999,"type":"民族类 综合类","year":2019},{"2019_lowest_like_score":"493","2019_lowest_wenke_score":"532","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=A60C6718720E490098A28FE08B96140C&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":119172,"lowest_score":493,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"499","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":2,"is_new_pro":"0","lowest_rank":109722,"lowest_score":499,"name":"土木工程","probability":0.999,"subject":""}],"name":"江西农业大学","probability":0.999,"type":"农林类","year":2019},{"2019_lowest_like_score":"490","2019_lowest_wenke_score":"527","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0AE9273455EF37F97770A7B7881BD9AA&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":123275,"lowest_score":490,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"490","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":123275,"lowest_score":490,"name":"土木工程","probability":0.999,"subject":""}],"name":"台州学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"490","2019_lowest_wenke_score":"523","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0B9C314C917A29FA6525E260CE90DD3E&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":123275,"lowest_score":490,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"500","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":109722,"lowest_score":500,"name":"土木工程","probability":0.999,"subject":""}],"name":"吉林建筑大学","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"486","2019_lowest_wenke_score":"526","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6631CE7EF30EC08866E4DF64DDA12138&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":129013,"lowest_score":486,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"488","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":126087,"lowest_score":488,"name":"土木工程","probability":0.999,"subject":""}],"name":"福建江夏学院","probability":0.999,"type":"财经类","year":2019},{"2019_lowest_like_score":"485","2019_lowest_wenke_score":"522","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=BE9CA0CACCA0CC3FD43847ADFFC6861A&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":130391,"lowest_score":485,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"488","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":126087,"lowest_score":488,"name":"土木工程","probability":0.999,"subject":""}],"name":"防灾科技学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"483","2019_lowest_wenke_score":"524","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0F41FDDCF02AF0E75F90FC6DC7670F78&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":133227,"lowest_score":483,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"508","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":99361,"lowest_score":508,"name":"土木工程","probability":0.999,"subject":""}],"name":"内蒙古科技大学","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"481","2019_lowest_wenke_score":"525","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=2BD1F134018C39AEDC1D4AC6F19BD9D6&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":136160,"lowest_score":481,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"484","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":131781,"lowest_score":484,"name":"土木工程","probability":0.999,"subject":""}],"name":"齐齐哈尔大学","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"481","2019_lowest_wenke_score":"523","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=3F6974AAA1009D15FD78771DDA3E3DDD&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":136160,"lowest_score":481,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"486","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":129013,"lowest_score":486,"name":"土木工程","probability":0.999,"subject":""},{"2019_lowest_like_score":"481","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":136160,"lowest_score":481,"name":"土木工程（装配式建筑方向）","probability":0.999,"subject":""}],"name":"河南工程学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"478","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=5CE84CE19C16E191CFBE21FD2B12D418&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":140526,"lowest_score":478,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"483","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":133227,"lowest_score":483,"name":"土木工程","probability":0.999,"subject":""}],"name":"兰州工业学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"476","2019_lowest_wenke_score":"521","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=176CF16F14EF3618B954E09FAA280AAE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":143428,"lowest_score":476,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"479","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":139124,"lowest_score":479,"name":"土木工程","probability":0.999,"subject":""}],"name":"莆田学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"476","2019_lowest_wenke_score":"520","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=009B281603D3DA2262D668CA9D8A766C&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":143428,"lowest_score":476,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"476","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":6,"is_new_pro":"0","lowest_rank":141960,"lowest_score":476,"name":"土木工程","probability":0.999,"subject":""}],"name":"黄冈师范学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"474","2019_lowest_wenke_score":"519","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=FEA63B3E5838E3020C8867B9A1553EB8&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":146428,"lowest_score":474,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"486","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":129013,"lowest_score":486,"name":"土木工程","probability":0.999,"subject":""}],"name":"长春工程学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"474","2019_lowest_wenke_score":"479","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=428E8A7DA5EF82EE18760ABA2CD686AC&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":146428,"lowest_score":474,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"507","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":100680,"lowest_score":507,"name":"土木工程","probability":0.999,"subject":""}],"name":"西南交通大学希望学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"473","2019_lowest_wenke_score":"502","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=B67EB041BD767D97912351972C054AB5&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":147855,"lowest_score":473,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"481","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":136160,"lowest_score":481,"name":"土木工程","probability":0.999,"subject":""}],"name":"山西工程技术学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"467","2019_lowest_wenke_score":"509","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=A7A97ABC148CA7B96931BAEB6D8FF6F8&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":156834,"lowest_score":467,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"482","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":134658,"lowest_score":482,"name":"土木工程","probability":0.999,"subject":""}],"name":"武夷学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"464","2019_lowest_wenke_score":"509","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=4124FA54B02D2031E4AD797BE42B26EA&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":161404,"lowest_score":464,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"464","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":161404,"lowest_score":464,"name":"土木工程","probability":0.999,"subject":""}],"name":"许昌学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"459","2019_lowest_wenke_score":"506","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=9E1A85FC21024B6FC654FB72D02BD893&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":168910,"lowest_score":459,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"460","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":167432,"lowest_score":460,"name":"土木工程","probability":0.999,"subject":""}],"name":"商丘师范学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"454","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=F9B128B9A771FDD339811309ABAD0B5E&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":176534,"lowest_score":454,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"460","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":167432,"lowest_score":460,"name":"土木工程","probability":0.999,"subject":""}],"name":"贵州理工学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"453","2019_lowest_wenke_score":"506","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=176DDC3DCE0A15258F1ED37DA2EDD25B&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":178112,"lowest_score":453,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"462","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":164407,"lowest_score":462,"name":"土木工程","probability":0.999,"subject":""}],"name":"榆林学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"450","2019_lowest_wenke_score":"498","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=8D3069E204111B8026AFCE2B2A6A16B5&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":182812,"lowest_score":450,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"450","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":182812,"lowest_score":450,"name":"土木工程","probability":0.999,"subject":""}],"name":"黄淮学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"449","2019_lowest_wenke_score":"495","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=70FA54B487FE2172DC8DDA03135E10AB&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":184336,"lowest_score":449,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"450","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":182812,"lowest_score":450,"name":"土木工程","probability":0.999,"subject":""}],"name":"华北电力大学科技学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"446","2019_lowest_wenke_score":"496","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=FBC5ED464613F5810A80D5F9A8DCF6B0&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":189057,"lowest_score":446,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"446","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":189057,"lowest_score":446,"name":"土木工程","probability":0.999,"subject":""}],"name":"六盘水师范学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"441","2019_lowest_wenke_score":"491","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=45B124E1DD39AD088BFF36FC5BC2B45A&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":197053,"lowest_score":441,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"442","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":195442,"lowest_score":442,"name":"土木工程","probability":0.999,"subject":""}],"name":"江苏大学京江学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"439","2019_lowest_wenke_score":"494","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=7E37A4DC68A013FA31D88A8DB96496AD&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":200217,"lowest_score":439,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"442","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":195442,"lowest_score":442,"name":"土木工程","probability":0.999,"subject":""}],"name":"扬州大学广陵学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"436","2019_lowest_wenke_score":"468","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=F879B4BF1D7CB7AE8FED685B87E1E403&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":204917,"lowest_score":436,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"443","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":193825,"lowest_score":443,"name":"土木工程","probability":0.999,"subject":""}],"name":"西安建筑科技大学华清学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"432","2019_lowest_wenke_score":"475","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=7A5D33A1003D4DD6EB084972857A969D&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":211300,"lowest_score":432,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"432","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":211300,"lowest_score":432,"name":"土木工程","probability":0.999,"subject":""}],"name":"太原理工大学现代科技学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"429","2019_lowest_wenke_score":"487","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=948391C6663387DE15AB3E0651992D93&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":215808,"lowest_score":429,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"438","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":201696,"lowest_score":438,"name":"土木工程","probability":0.999,"subject":""}],"name":"福州大学至诚学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"423","2019_lowest_wenke_score":"532","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=16931D163363A88DBCB54149DD128969&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":225127,"lowest_score":423,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"502","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":107111,"lowest_score":502,"name":"土木工程","probability":0.999,"subject":""}],"name":"北华大学","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"418","2019_lowest_wenke_score":"478","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=82919D70E0260A9C5743678756B0C5F7&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":232966,"lowest_score":418,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"420","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":229909,"lowest_score":420,"name":"土木工程","probability":0.999,"subject":""}],"name":"云南大学滇池学院","probability":0.999,"type":"综合类","year":2019},{"2019_lowest_like_score":"418","2019_lowest_wenke_score":"479","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=7F8F4059CBDB25845274439C4D36AAED&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":232966,"lowest_score":418,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"418","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":232966,"lowest_score":418,"name":"土木工程","probability":0.999,"subject":""}],"name":"浙江海洋大学东海科学技术学院","probability":0.999,"type":"农林类 理工类","year":2019},{"2019_lowest_like_score":"416","2019_lowest_wenke_score":"468","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=404814F8CBEF652F32064C0FAA1050C2&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":235936,"lowest_score":416,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"420","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":229909,"lowest_score":420,"name":"土木工程(中外合作办学)","probability":0.999,"subject":""},{"2019_lowest_like_score":"471","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":150749,"lowest_score":471,"name":"土木工程","probability":0.999,"subject":""}],"name":"南阳师范学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"414","2019_lowest_wenke_score":"472","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AFC138B7561E76E470D0E0FDF3BF929E&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":238977,"lowest_score":414,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"415","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":237441,"lowest_score":415,"name":"土木工程","probability":0.999,"subject":""}],"name":"温州大学瓯江学院","probability":0.999,"type":"综合类 师范类","year":2019},{"2019_lowest_like_score":"413","2019_lowest_wenke_score":"464","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=50CEAF87C42DC823DC4C7480F627D539&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":240565,"lowest_score":413,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"417","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":234488,"lowest_score":417,"name":"土木工程","probability":0.999,"subject":""}],"name":"厦门工学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"412","2019_lowest_wenke_score":"469","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=1642D237A032F9CABD62942FB5713887&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":242062,"lowest_score":412,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"413","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":240565,"lowest_score":413,"name":"土木工程","probability":0.999,"subject":""}],"name":"南昌工学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"411","2019_lowest_wenke_score":"454","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=C79A410C32F5D70B9BCC376FE848FF37&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":243516,"lowest_score":411,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"412","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":242062,"lowest_score":412,"name":"土木工程","probability":0.999,"subject":""}],"name":"重庆工程学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"409","2019_lowest_wenke_score":"476","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=DE0453DA0773220C1B6E5A9E5B2794DA&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":246460,"lowest_score":409,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"414","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":70,"is_new_pro":"0","lowest_rank":238977,"lowest_score":414,"name":"土木工程","probability":0.999,"subject":""}],"name":"中原工学院信息商务学院","probability":0.999,"type":"财经类","year":2019},{"2019_lowest_like_score":"405","2019_lowest_wenke_score":"453","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=3CDFC3D024483E65384E41CF0C26B664&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":252264,"lowest_score":405,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"405","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":252264,"lowest_score":405,"name":"土木工程","probability":0.999,"subject":""}],"name":"南通理工学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"403","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=2D1567F6D434EAD910D0AAC82C017981&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":255219,"lowest_score":403,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"484","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":29,"is_new_pro":"0","lowest_rank":130391,"lowest_score":484,"name":"土木工程（地下工程方向）","probability":0.999,"subject":""},{"2019_lowest_like_score":"486","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":51,"is_new_pro":"0","lowest_rank":127545,"lowest_score":486,"name":"土木工程（建筑工程方向）","probability":0.999,"subject":""}],"name":"南阳理工学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"401","2019_lowest_wenke_score":"456","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=2F7C8C59F71A274E1994C84923B6FDB1&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":258045,"lowest_score":401,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"402","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":256652,"lowest_score":402,"name":"土木工程","probability":0.999,"subject":""}],"name":"绍兴文理学院元培学院","probability":0.999,"type":"师范类","year":2019},{"2019_lowest_like_score":"398","2019_lowest_wenke_score":"452","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=1F27C906CC0A4A7C040C07F4C91FDBB8&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":262381,"lowest_score":398,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"410","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":244999,"lowest_score":410,"name":"土木工程","probability":0.999,"subject":""}],"name":"吉林建筑科技学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"391","2019_lowest_wenke_score":"457","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=F66126A46A3568456A4A87DF7A00F785&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":272463,"lowest_score":391,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"392","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":4,"is_new_pro":"0","lowest_rank":271093,"lowest_score":392,"name":"土木工程","probability":0.999,"subject":""}],"name":"沈阳城市学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"391","2019_lowest_wenke_score":"448","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=6D58DEA206A72320EFBD34D125322D15&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":272463,"lowest_score":391,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"392","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":271093,"lowest_score":392,"name":"土木工程","probability":0.999,"subject":""}],"name":"北海艺术设计学院","probability":0.999,"type":"艺术类","year":2019},{"2019_lowest_like_score":"390","2019_lowest_wenke_score":"447","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=831883B03C543E1D3343BD1A5030CF76&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":273805,"lowest_score":390,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"391","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":272463,"lowest_score":391,"name":"土木工程","probability":0.999,"subject":""}],"name":"沈阳城市建设学院","probability":0.999,"type":"理工类","year":2019},{"2019_lowest_like_score":"386","2019_lowest_wenke_score":"451","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=C358C5FD64C20125AC03A14C8D116717&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":279199,"lowest_score":386,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"402","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":256652,"lowest_score":402,"name":"土木工程","probability":0.999,"subject":""}],"name":"浙江树人学院","probability":0.999,"type":"综合类 理工类","year":2019},{"2019_lowest_like_score":"385","2019_lowest_wenke_score":"447","batch":"本科二批","enrollment":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=077E561E57867CCDB391CACE42B67A4B&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":280520,"lowest_score":385,"luqu_genre":"理科","majors":[{"2019_lowest_like_score":"385","2019_lowest_wenke_score":"","batch":"本科二批","enrollment":0,"is_new_pro":"0","lowest_rank":280520,"lowest_score":385,"name":"土木工程","probability":0.999,"subject":""}],"name":"齐齐哈尔工程学院","probability":0.999,"type":"综合类 理工类","year":2019}]
         * location : 河南
         * major : 土木工程
         * req_type : rec_college_major
         * score : 582
         * session_id : ab60069924120e61e9a8f1c5b26e2081
         * status_code : 200
         * status_msg :
         * student_rank : -1
         * tags : ["双一流","985","211"]
         * types : ["综合类","理工类","医药类","政法类","师范类","农林类","体育类","民族类","艺术类","语言类","财经类"]
         */

        private String art_or_science;
        private String batch;
        private int college_count;
        private String location;
        private String major;
        private String req_type;
        private int score;
        private String session_id;
        private int status_code;
        private String status_msg;
        private int student_rank;
        private List<String> batchs;
        private List<String> city;
        private List<CollegesBean> colleges;
        private List<String> tags;
        private List<String> types;

        public String getArt_or_science() {
            return art_or_science;
        }

        public void setArt_or_science(String art_or_science) {
            this.art_or_science = art_or_science;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public int getCollege_count() {
            return college_count;
        }

        public void setCollege_count(int college_count) {
            this.college_count = college_count;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
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

        public List<String> getBatchs() {
            return batchs;
        }

        public void setBatchs(List<String> batchs) {
            this.batchs = batchs;
        }

        public List<String> getCity() {
            return city;
        }

        public void setCity(List<String> city) {
            this.city = city;
        }

        public List<CollegesBean> getColleges() {
            return colleges;
        }

        public void setColleges(List<CollegesBean> colleges) {
            this.colleges = colleges;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class CollegesBean {
            /**
             * 2019_lowest_like_score : 581
             * 2019_lowest_wenke_score : 587
             * batch : 本科一批
             * enrollment : 0
             * icon : //ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=737015A1B51119708CA799110A5EB2E0&tv=0_0&x.jpg
             * is_new_pro : 0
             * lowest_rank : 27095
             * lowest_score : 581
             * luqu_genre : 理科
             * majors : [{"2019_lowest_like_score":"584","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":0,"is_new_pro":"0","lowest_rank":25153,"lowest_score":584,"name":"土木工程","probability":0.4325,"subject":""}]
             * name : 西北农林科技大学
             * probability : 0.5319
             * tags : ["双一流","985","211"]
             * type : 农林类
             * year : 2019
             */

            @SerializedName("2019_lowest_like_score")
            private String _$2019_lowest_like_score;
            @SerializedName("2019_lowest_wenke_score")
            private String _$2019_lowest_wenke_score;
            private String batch;
            private int enrollment;
            private String icon;
            private String is_new_pro;
            private int lowest_rank;
            private int lowest_score;
            private String luqu_genre;
            private String name;
            private double probability;
            private String type;
            private int year;
            private List<MajorsBean> majors;
            private List<String> tags;

            public String get_$2019_lowest_like_score() {
                return _$2019_lowest_like_score;
            }

            public void set_$2019_lowest_like_score(String _$2019_lowest_like_score) {
                this._$2019_lowest_like_score = _$2019_lowest_like_score;
            }

            public String get_$2019_lowest_wenke_score() {
                return _$2019_lowest_wenke_score;
            }

            public void set_$2019_lowest_wenke_score(String _$2019_lowest_wenke_score) {
                this._$2019_lowest_wenke_score = _$2019_lowest_wenke_score;
            }

            public String getBatch() {
                return batch;
            }

            public void setBatch(String batch) {
                this.batch = batch;
            }

            public int getEnrollment() {
                return enrollment;
            }

            public void setEnrollment(int enrollment) {
                this.enrollment = enrollment;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getIs_new_pro() {
                return is_new_pro;
            }

            public void setIs_new_pro(String is_new_pro) {
                this.is_new_pro = is_new_pro;
            }

            public int getLowest_rank() {
                return lowest_rank;
            }

            public void setLowest_rank(int lowest_rank) {
                this.lowest_rank = lowest_rank;
            }

            public int getLowest_score() {
                return lowest_score;
            }

            public void setLowest_score(int lowest_score) {
                this.lowest_score = lowest_score;
            }

            public String getLuqu_genre() {
                return luqu_genre;
            }

            public void setLuqu_genre(String luqu_genre) {
                this.luqu_genre = luqu_genre;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getProbability() {
                return probability;
            }

            public void setProbability(double probability) {
                this.probability = probability;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public List<MajorsBean> getMajors() {
                return majors;
            }

            public void setMajors(List<MajorsBean> majors) {
                this.majors = majors;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            public static class MajorsBean {
                /**
                 * 2019_lowest_like_score : 584
                 * 2019_lowest_wenke_score :
                 * batch : 本科一批
                 * enrollment : 0
                 * is_new_pro : 0
                 * lowest_rank : 25153
                 * lowest_score : 584
                 * name : 土木工程
                 * probability : 0.4325
                 * subject :
                 */

                @SerializedName("2019_lowest_like_score")
                private String _$2019_lowest_like_score;
                @SerializedName("2019_lowest_wenke_score")
                private String _$2019_lowest_wenke_score;
                private String batch;
                private int enrollment;
                private String is_new_pro;
                private int lowest_rank;
                private int lowest_score;
                private String name;
                private double probability;
                private String subject;

                public String get_$2019_lowest_like_score() {
                    return _$2019_lowest_like_score;
                }

                public void set_$2019_lowest_like_score(String _$2019_lowest_like_score) {
                    this._$2019_lowest_like_score = _$2019_lowest_like_score;
                }

                public String get_$2019_lowest_wenke_score() {
                    return _$2019_lowest_wenke_score;
                }

                public void set_$2019_lowest_wenke_score(String _$2019_lowest_wenke_score) {
                    this._$2019_lowest_wenke_score = _$2019_lowest_wenke_score;
                }

                public String getBatch() {
                    return batch;
                }

                public void setBatch(String batch) {
                    this.batch = batch;
                }

                public int getEnrollment() {
                    return enrollment;
                }

                public void setEnrollment(int enrollment) {
                    this.enrollment = enrollment;
                }

                public String getIs_new_pro() {
                    return is_new_pro;
                }

                public void setIs_new_pro(String is_new_pro) {
                    this.is_new_pro = is_new_pro;
                }

                public int getLowest_rank() {
                    return lowest_rank;
                }

                public void setLowest_rank(int lowest_rank) {
                    this.lowest_rank = lowest_rank;
                }

                public int getLowest_score() {
                    return lowest_score;
                }

                public void setLowest_score(int lowest_score) {
                    this.lowest_score = lowest_score;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double getProbability() {
                    return probability;
                }

                public void setProbability(double probability) {
                    this.probability = probability;
                }

                public String getSubject() {
                    return subject;
                }

                public void setSubject(String subject) {
                    this.subject = subject;
                }
            }
        }

}
