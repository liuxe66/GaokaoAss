package com.liuxe.gaokaoass.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZntbCollegesBean {

    /**
     * art_or_science : 理科
     * batchs : ["本科","专科"]
     * city : ["北京","天津","上海","重庆","黑龙江","吉林","辽宁","内蒙古","河北","山西","陕西","宁夏","甘肃","青海","新疆","山东","河南","江苏","安徽","湖北","四川","西藏","浙江","江西","湖南","贵州","福建","广东","广西","云南","海南"]
     * college_count : 40
     * college_province :
     * colleges : [{"2019_lowest_like_score":"581","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":3,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=3AB72B6E7D282F39E30400C8B180B30E&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27095,"lowest_score":581,"luqu_genre":"理科","name":"东北师范大学","probability":0.5319,"tags":["双一流","211"],"type":"师范类","year":2019},{"2019_lowest_like_score":"581","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":355,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=737015A1B51119708CA799110A5EB2E0&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27095,"lowest_score":581,"luqu_genre":"理科","name":"西北农林科技大学","probability":0.5319,"tags":["双一流","985","211"],"type":"农林类","year":2019},{"2019_lowest_like_score":"581","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":284,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=0D0CE93BB3F481800B0E1463435128EE&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27095,"lowest_score":581,"luqu_genre":"理科","name":"华中农业大学","probability":0.5319,"tags":["双一流","211"],"type":"农林类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":91,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=065178C0E4256685113D8E927C65ECBA&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"重庆邮电大学","probability":0.6255,"type":"理工类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":38,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=97C028272CBC8AF68F73F8401FD8368D&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"上海立信会计金融学院","probability":0.5675,"type":"财经类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":179,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=AAA7F2CB1DCF40BEFEC752EC9C3BDD35&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"南京航空航天大学","probability":0.5675,"tags":["双一流","211"],"type":"理工类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":74,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=8213EF1F1CA49B6C97EE3181DE43FF41&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"浙江工业大学","probability":0.5675,"type":"理工类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":234,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=BA91F12652C3637E6DCCCDCBEBAE2B33&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"南京农业大学","probability":0.5675,"tags":["双一流","211"],"type":"农林类","year":2019},{"2019_lowest_like_score":"580","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":67,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=FEE4CC1329B1086784A18FE90FD82B40&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":27764,"lowest_score":580,"luqu_genre":"理科","name":"辽宁大学","probability":0.6255,"tags":["双一流","211"],"type":"综合类","year":2019},{"2019_lowest_like_score":"579","2019_lowest_wenke_score":"","batch":"本科一批","enrollment":56,"icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=90F48F1A01E5E1944C09488F794848EF&tv=0_0&x.jpg","is_new_pro":"0","lowest_rank":28476,"lowest_score":579,"luqu_genre":"理科","name":"西安邮电大学","probability":0.5987,"type":"综合类 理工类","year":2019}]
     * guaranteed_count : 871
     * location : 河南
     * req_type : rec_college_detail
     * risky_count : 40
     * safety_count : 33
     * score : 582
     * session_id : a1d8525e2363acc6a7ea4cb79bc501ba
     * status_code : 200
     * status_msg :
     * student_rank : -1
     * tab : 1
     * tags : ["双一流","985","211"]
     * types : ["综合类","理工类","医药类","政法类","师范类","农林类","体育类","民族类","艺术类","语言类","财经类"]
     */

    private String art_or_science;
    private int college_count;
    private String college_province;
    private int guaranteed_count;
    private String location;
    private String req_type;
    private int risky_count;
    private int safety_count;
    private int score;
    private String session_id;
    private int status_code;
    private String status_msg;
    private int student_rank;
    private int tab;
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

    public int getCollege_count() {
        return college_count;
    }

    public void setCollege_count(int college_count) {
        this.college_count = college_count;
    }

    public String getCollege_province() {
        return college_province;
    }

    public void setCollege_province(String college_province) {
        this.college_province = college_province;
    }

    public int getGuaranteed_count() {
        return guaranteed_count;
    }

    public void setGuaranteed_count(int guaranteed_count) {
        this.guaranteed_count = guaranteed_count;
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

    public int getRisky_count() {
        return risky_count;
    }

    public void setRisky_count(int risky_count) {
        this.risky_count = risky_count;
    }

    public int getSafety_count() {
        return safety_count;
    }

    public void setSafety_count(int safety_count) {
        this.safety_count = safety_count;
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

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
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
         * 2019_lowest_wenke_score :
         * batch : 本科一批
         * enrollment : 3
         * icon : //ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=3AB72B6E7D282F39E30400C8B180B30E&tv=0_0&x.jpg
         * is_new_pro : 0
         * lowest_rank : 27095
         * lowest_score : 581
         * luqu_genre : 理科
         * name : 东北师范大学
         * probability : 0.5319
         * tags : ["双一流","211"]
         * type : 师范类
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

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
    }

}
