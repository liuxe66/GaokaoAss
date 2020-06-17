package com.liuxe.gaokaoass.bean;

import java.util.List;

public class ZntbHomeBean {

    /**
     * art_or_science : 理科
     * college_count : 944
     * college_province :
     * colleges : [{"city":"重庆","icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=065178C0E4256685113D8E927C65ECBA&tv=0_0&x.jpg","name":"重庆邮电大学","predict_type":"冲"},{"city":"广州","icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=EDA6776B021DAFCD982D7722F1167856&tv=0_0&x.jpg","name":"广州大学","predict_type":"稳"},{"city":"武汉","icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=B44BD13AF1EA53664B09F43E10D6570A&tv=0_0&x.jpg","name":"湖北大学","predict_type":"稳"},{"city":"银川","icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=B115F279B1543EAADE795FAFC8DF7EFB&tv=0_0&x.jpg","name":"宁夏医科大学","predict_type":"保"},{"city":"长春","icon":"//ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=EE1415844A5402192E8C8B574FEE4FAE&tv=0_0&x.jpg","name":"长春理工大学","predict_type":"保"}]
     * guaranteed : {"name":"可保底的大学","numbers":871,"prob":"95%~100%"}
     * location : 河南
     * req_type : rec_college
     * risky : {"name":"可冲击的大学","numbers":40,"prob":"50%~80%"}
     * safety : {"name":"较稳妥的大学","numbers":33,"prob":"80%~95%"}
     * score : 582
     * session_id : b91d1869dbe9a7062a2b836e5d2f9112
     * status_code : 200
     * status_msg :
     * student_rank : -1
     */

    private String art_or_science;
    private int college_count;
    private String college_province;
    private GuaranteedBean guaranteed;
    private String location;
    private String req_type;
    private RiskyBean risky;
    private SafetyBean safety;
    private int score;
    private String session_id;
    private int status_code;
    private String status_msg;
    private int student_rank;
    private List<CollegesBean> colleges;

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

    public GuaranteedBean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(GuaranteedBean guaranteed) {
        this.guaranteed = guaranteed;
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

    public RiskyBean getRisky() {
        return risky;
    }

    public void setRisky(RiskyBean risky) {
        this.risky = risky;
    }

    public SafetyBean getSafety() {
        return safety;
    }

    public void setSafety(SafetyBean safety) {
        this.safety = safety;
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

    public List<CollegesBean> getColleges() {
        return colleges;
    }

    public void setColleges(List<CollegesBean> colleges) {
        this.colleges = colleges;
    }

    public static class GuaranteedBean {
        /**
         * name : 可保底的大学
         * numbers : 871
         * prob : 95%~100%
         */

        private String name;
        private int numbers;
        private String prob;

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

        public String getProb() {
            return prob;
        }

        public void setProb(String prob) {
            this.prob = prob;
        }
    }

    public static class RiskyBean {
        /**
         * name : 可冲击的大学
         * numbers : 40
         * prob : 50%~80%
         */

        private String name;
        private int numbers;
        private String prob;

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

        public String getProb() {
            return prob;
        }

        public void setProb(String prob) {
            this.prob = prob;
        }
    }

    public static class SafetyBean {
        /**
         * name : 较稳妥的大学
         * numbers : 33
         * prob : 80%~95%
         */

        private String name;
        private int numbers;
        private String prob;

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

        public String getProb() {
            return prob;
        }

        public void setProb(String prob) {
            this.prob = prob;
        }
    }

    public static class CollegesBean {
        /**
         * city : 重庆
         * icon : //ims-cdn0.sm.cn/ims?kt=MD5&at=smk&key=065178C0E4256685113D8E927C65ECBA&tv=0_0&x.jpg
         * name : 重庆邮电大学
         * predict_type : 冲
         */

        private String city;
        private String icon;
        private String name;
        private String predict_type;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

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

        public String getPredict_type() {
            return predict_type;
        }

        public void setPredict_type(String predict_type) {
            this.predict_type = predict_type;
        }
    }

}
