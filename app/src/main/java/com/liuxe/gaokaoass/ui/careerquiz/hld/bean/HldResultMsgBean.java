package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

import java.util.List;

public class HldResultMsgBean {

    /**
     * error : 0
     * msg :
     * data : [{"type_name":"实际型：(R)","type":"R","jieshao":"喜欢使用工具，喜欢运用技能、操作方法和工具或机器打交道","tezheng":"愿意使用工具从事操作性工作，动手能力强，做事手脚灵活，动作协调。偏好于具体任务，不善言辞，做事保守，较为谦虚。缺乏社交能力，通常喜欢独立做事。","zhiye":"喜欢使用工具、机器，需要基本操作技能的工作。对要求具备机械方面才能、体力或从事与物件、机器、工具、运动器材、植物、动物相关的职业有兴趣，并具备相应能力。如：技术性职业（计算机硬件人员、摄影师、制图员、机械装配工），技能性职业（木匠、厨师、技工、修理工、农民、一般劳动）。","character":"实际"},{"type_name":"研究型：(I)","type":"I","jieshao":"喜欢钻研思考，喜欢运用分析与推理进行深度研究","tezheng":"思想家而非实干家,抽象思维能力强，求知欲强，肯动脑，善思考，不愿动手。喜欢独立的和富有创造性的工作。知识渊博，有学识才能，不善于领导他人。考虑问题理性，做事喜欢精确，喜欢逻辑分析和推理，不断探讨未知的领域。","zhiye":"喜欢智力的、抽象的、分析的、独立的定向任务，要求具备智力或分析才能，并将其用于观察、估测、衡量、形成理论、最终解决问题的工作，并具备相应的能力。如科学研究人员、教师、工程师、电脑编程人员、医生、系统分析员。","character":"研究"},{"type_name":"艺术型：(A)","type":"A","jieshao":"喜欢感性创造，喜欢想象，并加以具体化地制作或创造某种东西，具有创造力","tezheng":"有创造力，乐于创造新颖、与众不同的成果，渴望表现自己的个性，实现自身的价值。做事理想化，追求完美，不重实际。具有一定的艺术才能和个性。善于表达、怀旧、心态较为复杂。","zhiye":"喜欢的工作要求具备艺术修养、创造力、表达能力和直觉，并将其用于语言、行为、声音、颜色和形式的审美、思索和感受，具备相应的能力。不善于事务性工作。如艺术方面（演员、导演、艺术设计师、雕刻家、建筑师、摄影家、广告制作人），音乐方面（歌唱家、作曲家、乐队指挥），文学方面（小说家、诗人、剧作家）。","character":"艺术"},{"type_name":"社会型：(S)","type":"S","jieshao":"喜欢与人打交道，喜欢与人沟通、接触的活动","tezheng":"喜欢与人交往、不断结交新的朋友、善言谈、愿意教导别人。关心社会问题、渴望发挥自己的社会作用。寻求广泛的人际关系，比较看重社会义务和社会道德。","zhiye":"喜欢要求与人打交道的工作，能够不断结交新的朋友，从事提供信息、启迪、帮助、培训、开发或治疗等事务，并具备相应能力。如: 教育工作者（教师、教育行政人员），社会工作者（咨询人员、公关人员）。","character":"社会"},{"type_name":"企业型：(E)","type":"E","jieshao":"喜欢控制与影响，喜欢管理或经营活动，对事件或他人达成影响","tezheng":"追求权力、权威和物质财富，具有领导才能。喜欢竞争、敢冒风险、有野心、抱负。为人务实，习惯以利益得失，权利、地位、金钱等来衡量做事的价值，做事有较强的目的性。","zhiye":"喜欢要求具备经营、管理、劝服、监督和领导才能，以实现机构、政治、社会及经济目标的工作，并具备相应的能力。如项目经理、销售人员，营销管理人员、政府官员、企业领导、法官、律师。","character":"企业"},{"type_name":"传统型：(C)","type":"C","jieshao":"喜欢按计划办事，喜欢关注细节或数据，希望遵照既定的安排完成工作任务","tezheng":"尊重权威和规章制度，喜欢按计划办事，细心、有条理，习惯接受他人的指挥和领导，自己不谋求领导职务。喜欢关注实际和细节情况，通常较为谨慎和保守，缺乏创造性，不喜欢冒险和竞争，富有自我牺牲精神。","zhiye":"喜欢要求注意细节、精确度、有系统有条理，具有记录、归档、据特定要求或程序组织数据和文字信息的职业，并具备相应能力。如：秘书、办公室人员、记事员、会计、行政助理、图书馆管理员、出纳员、打字员、投资分析员。","character":"传统"}]
     */

    private int error;
    private String msg;
    private List<DataBean> data;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * type_name : 实际型：(R)
         * type : R
         * jieshao : 喜欢使用工具，喜欢运用技能、操作方法和工具或机器打交道
         * tezheng : 愿意使用工具从事操作性工作，动手能力强，做事手脚灵活，动作协调。偏好于具体任务，不善言辞，做事保守，较为谦虚。缺乏社交能力，通常喜欢独立做事。
         * zhiye : 喜欢使用工具、机器，需要基本操作技能的工作。对要求具备机械方面才能、体力或从事与物件、机器、工具、运动器材、植物、动物相关的职业有兴趣，并具备相应能力。如：技术性职业（计算机硬件人员、摄影师、制图员、机械装配工），技能性职业（木匠、厨师、技工、修理工、农民、一般劳动）。
         * character : 实际
         */

        private String type_name;
        private String type;
        private String jieshao;
        private String tezheng;
        private String zhiye;
        private String character;

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getJieshao() {
            return jieshao;
        }

        public void setJieshao(String jieshao) {
            this.jieshao = jieshao;
        }

        public String getTezheng() {
            return tezheng;
        }

        public void setTezheng(String tezheng) {
            this.tezheng = tezheng;
        }

        public String getZhiye() {
            return zhiye;
        }

        public void setZhiye(String zhiye) {
            this.zhiye = zhiye;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }
    }
}
