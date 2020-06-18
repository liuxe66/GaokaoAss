package com.liuxe.gaokaoass.bean;

import java.util.List;

public class QueryMajorBean {

        /**
         * major_list : [{"batch":"本科","level":3,"name":"土木工程"},{"batch":"本科","level":2,"name":"土木类"},{"batch":"专科","level":3,"name":"土木工程检测技术"}]
         * req_type : search_major
         * session_id : b8b4941ee4b91638148db8a60551fc79
         * status_code : 200
         * status_msg :
         */

        private String req_type;
        private String session_id;
        private int status_code;
        private String status_msg;
        private List<MajorListBean> major_list;

        public String getReq_type() {
            return req_type;
        }

        public void setReq_type(String req_type) {
            this.req_type = req_type;
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

        public List<MajorListBean> getMajor_list() {
            return major_list;
        }

        public void setMajor_list(List<MajorListBean> major_list) {
            this.major_list = major_list;
        }

        public static class MajorListBean {
            /**
             * batch : 本科
             * level : 3
             * name : 土木工程
             */

            private String batch;
            private int level;
            private String name;

            public String getBatch() {
                return batch;
            }

            public void setBatch(String batch) {
                this.batch = batch;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

}
