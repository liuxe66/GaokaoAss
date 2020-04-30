package com.liuxe.gaokaoass.bean;

import java.util.List;

public class ZntbCollegesBean {
    /**
     * art_or_science : 理科
     * batchs : ["本科一批","本科二批","本科三批","专科批"]
     * colleges : [{"batch":"本科一批","head_count":0,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AAA7F2CB1DCF40BEFEC752EC9C3BDD35&tv=0_0&x.jpg","lowest_rank":31805,"lowest_score":516,"name":"南京航空航天大学","probability":0.4880000054836273,"tags":["双一流","211"],"type":"理工类","year":2018},{"batch":"本科一批","head_count":116,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=BF552B03C4186CFF2C3C4D61EECFA986&tv=0_0&x.jpg","lowest_rank":33130,"lowest_score":513,"name":"合肥工业大学","probability":0.527899980545044,"tags":["双一流","211"],"type":"理工类","year":2018},{"batch":"本科一批","head_count":110,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=2BB34703F9B44F68417640169B853889&tv=0_0&x.jpg","lowest_rank":35322,"lowest_score":508,"name":"昆明理工大学","probability":0.7454000115394592,"type":"理工类","year":2018},{"batch":"本科一批","head_count":70,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=E4C008E59B70D077CB43A53491F97A2F&tv=0_0&x.jpg","lowest_rank":34871,"lowest_score":509,"name":"哈尔滨理工大学","probability":0.7324000000953674,"type":"理工类","year":2018},{"batch":"本科一批","head_count":17,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=246F50AB67101E2EFA7AD0D9F071DDB9&tv=0_0&x.jpg","lowest_rank":33533,"lowest_score":512,"name":"常州大学","probability":0.6442999839782715,"type":"理工类","year":2018},{"batch":"本科一批","head_count":31,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=091D221DECAED9335DF065AF7AB20548&tv=0_0&x.jpg","lowest_rank":33948,"lowest_score":511,"name":"北方工业大学","probability":0.5871000289916992,"type":"理工类","year":2018},{"batch":"本科一批","head_count":25,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=7BEEE0C282C9453C664E801A5014FA55&tv=0_0&x.jpg","lowest_rank":31365,"lowest_score":517,"name":"武汉工程大学","probability":0.4090000092983246,"type":"理工类","year":2018},{"batch":"本科一批","head_count":13,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=E569F842E1606E40024B2E27267D1FB3&tv=0_0&x.jpg","lowest_rank":35779,"lowest_score":507,"name":"北京印刷学院","probability":0.7939000129699707,"type":"理工类","year":2018}]
     * location : 陕西
     * provs : ["上海","云南","内蒙古","北京","吉林","四川","天津","宁夏","安徽","山东","山西","广东","广西","新疆","江苏","江西","河北","河南","浙江","海南","湖北","湖南","甘肃","福建","贵州","辽宁","重庆","陕西","青海","黑龙江"]
     * req_type : rec_colleges
     * score : 521
     * session_id : 0a73ddfe4a6f70166c27c3650e930104
     * shock : 1
     * status : {"has_admitting_started":"0","has_college_started_admitting":"0","has_province_control_line_released":"1","is_gaokao_all_end":"1","is_new_data_released":"1","official_cf_site":"http://www.sneac.com/","official_web_site":"http://sxsksglzx.jyt.shaanxi.gov.cn/"}
     * student_rank : 32150
     * tags : ["双一流","985","211"]
     * types : ["综合类","理工类","医药类","政法类","师范类","农林类","体育类","民族类","艺术类","语言类","财经类"]
     * year : 2019
     */

    private String art_or_science;
    private String location;
    private String req_type;
    private int score;
    private String session_id;
    private int shock;
    private StatusBean status;
    private int student_rank;
    private int year;
    private List<String> batchs;
    private List<CollegesBean> colleges;
    private List<String> provs;
    private List<String> tags;
    private List<String> types;

    public String getArt_or_science() {
        return art_or_science;
    }

    public void setArt_or_science(String art_or_science) {
        this.art_or_science = art_or_science;
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

    public int getShock() {
        return shock;
    }

    public void setShock(int shock) {
        this.shock = shock;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public int getStudent_rank() {
        return student_rank;
    }

    public void setStudent_rank(int student_rank) {
        this.student_rank = student_rank;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getBatchs() {
        return batchs;
    }

    public void setBatchs(List<String> batchs) {
        this.batchs = batchs;
    }

    public List<CollegesBean> getColleges() {
        return colleges;
    }

    public void setColleges(List<CollegesBean> colleges) {
        this.colleges = colleges;
    }

    public List<String> getProvs() {
        return provs;
    }

    public void setProvs(List<String> provs) {
        this.provs = provs;
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

    public static class StatusBean {
        /**
         * has_admitting_started : 0
         * has_college_started_admitting : 0
         * has_province_control_line_released : 1
         * is_gaokao_all_end : 1
         * is_new_data_released : 1
         * official_cf_site : http://www.sneac.com/
         * official_web_site : http://sxsksglzx.jyt.shaanxi.gov.cn/
         */

        private String has_admitting_started;
        private String has_college_started_admitting;
        private String has_province_control_line_released;
        private String is_gaokao_all_end;
        private String is_new_data_released;
        private String official_cf_site;
        private String official_web_site;

        public String getHas_admitting_started() {
            return has_admitting_started;
        }

        public void setHas_admitting_started(String has_admitting_started) {
            this.has_admitting_started = has_admitting_started;
        }

        public String getHas_college_started_admitting() {
            return has_college_started_admitting;
        }

        public void setHas_college_started_admitting(String has_college_started_admitting) {
            this.has_college_started_admitting = has_college_started_admitting;
        }

        public String getHas_province_control_line_released() {
            return has_province_control_line_released;
        }

        public void setHas_province_control_line_released(String has_province_control_line_released) {
            this.has_province_control_line_released = has_province_control_line_released;
        }

        public String getIs_gaokao_all_end() {
            return is_gaokao_all_end;
        }

        public void setIs_gaokao_all_end(String is_gaokao_all_end) {
            this.is_gaokao_all_end = is_gaokao_all_end;
        }

        public String getIs_new_data_released() {
            return is_new_data_released;
        }

        public void setIs_new_data_released(String is_new_data_released) {
            this.is_new_data_released = is_new_data_released;
        }

        public String getOfficial_cf_site() {
            return official_cf_site;
        }

        public void setOfficial_cf_site(String official_cf_site) {
            this.official_cf_site = official_cf_site;
        }

        public String getOfficial_web_site() {
            return official_web_site;
        }

        public void setOfficial_web_site(String official_web_site) {
            this.official_web_site = official_web_site;
        }
    }

    public static class CollegesBean {
        /**
         * batch : 本科一批
         * head_count : 0
         * icon : //ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AAA7F2CB1DCF40BEFEC752EC9C3BDD35&tv=0_0&x.jpg
         * lowest_rank : 31805
         * lowest_score : 516
         * name : 南京航空航天大学
         * probability : 0.4880000054836273
         * tags : ["双一流","211"]
         * type : 理工类
         * year : 2018
         */

        private String batch;
        private int head_count;
        private String icon;
        private int lowest_rank;
        private int lowest_score;
        private String name;
        private double probability;
        private String type;
        private int year;
        private List<String> tags;

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public int getHead_count() {
            return head_count;
        }

        public void setHead_count(int head_count) {
            this.head_count = head_count;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
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

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
    }

}
