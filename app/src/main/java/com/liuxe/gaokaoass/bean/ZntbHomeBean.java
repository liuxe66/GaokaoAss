package com.liuxe.gaokaoass.bean;

public class ZntbHomeBean {

    /**
     * all_count : 937
     * art_or_science : 理科
     * backup : {"admission_proba":"95%~100%","name":"可保底的大学","numbers":814}
     * fscore : 521
     * location : 河南
     * ok : {"admission_proba":"80%~95%","name":"较稳妥的大学","numbers":62}
     * province :
     * req_type : rec_colleges
     * risk : {"admission_proba":"40%~80%","name":"可冲击的大学","numbers":61}
     * score : 521
     * session_id : 8ac32d413cf7af14a2b80e5c8c85fda1
     * status : {"has_admitting_started":"0","has_college_started_admitting":"0","has_province_control_line_released":"0","is_gaokao_all_end":"1","is_new_data_released":"0","official_cf_site":"http://www.heao.gov.cn/","official_web_site":"http://www.heao.gov.cn/"}
     * year : 2019
     */

    private int all_count;
    private String art_or_science;
    private BackupBean backup;
    private int fscore;
    private String location;
    private OkBean ok;
    private String province;
    private String req_type;
    private RiskBean risk;
    private int score;
    private String session_id;
    private StatusBean status;
    private int year;

    public int getAll_count() {
        return all_count;
    }

    public void setAll_count(int all_count) {
        this.all_count = all_count;
    }

    public String getArt_or_science() {
        return art_or_science;
    }

    public void setArt_or_science(String art_or_science) {
        this.art_or_science = art_or_science;
    }

    public BackupBean getBackup() {
        return backup;
    }

    public void setBackup(BackupBean backup) {
        this.backup = backup;
    }

    public int getFscore() {
        return fscore;
    }

    public void setFscore(int fscore) {
        this.fscore = fscore;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public OkBean getOk() {
        return ok;
    }

    public void setOk(OkBean ok) {
        this.ok = ok;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getReq_type() {
        return req_type;
    }

    public void setReq_type(String req_type) {
        this.req_type = req_type;
    }

    public RiskBean getRisk() {
        return risk;
    }

    public void setRisk(RiskBean risk) {
        this.risk = risk;
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

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static class BackupBean {
        /**
         * admission_proba : 95%~100%
         * name : 可保底的大学
         * numbers : 814
         */

        private String admission_proba;
        private String name;
        private int numbers;

        public String getAdmission_proba() {
            return admission_proba;
        }

        public void setAdmission_proba(String admission_proba) {
            this.admission_proba = admission_proba;
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
    }

    public static class OkBean {
        /**
         * admission_proba : 80%~95%
         * name : 较稳妥的大学
         * numbers : 62
         */

        private String admission_proba;
        private String name;
        private int numbers;

        public String getAdmission_proba() {
            return admission_proba;
        }

        public void setAdmission_proba(String admission_proba) {
            this.admission_proba = admission_proba;
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
    }

    public static class RiskBean {
        /**
         * admission_proba : 40%~80%
         * name : 可冲击的大学
         * numbers : 61
         */

        private String admission_proba;
        private String name;
        private int numbers;

        public String getAdmission_proba() {
            return admission_proba;
        }

        public void setAdmission_proba(String admission_proba) {
            this.admission_proba = admission_proba;
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
    }

    public static class StatusBean {
        /**
         * has_admitting_started : 0
         * has_college_started_admitting : 0
         * has_province_control_line_released : 0
         * is_gaokao_all_end : 1
         * is_new_data_released : 0
         * official_cf_site : http://www.heao.gov.cn/
         * official_web_site : http://www.heao.gov.cn/
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

}
