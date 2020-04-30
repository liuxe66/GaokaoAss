package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

import java.util.List;

/*
 *Created by Liuxe on
 *desc :霍兰德试题答案
 */
public class HldABean {

    /**
     * code : 200
     * msg : success
     * data : [{"typeName":"实际型","typeCode":"R","item":[{"question":"2","answer":true},{"question":"13","answer":true},{"question":"22","answer":true},{"question":"36","answer":true},{"question":"43","answer":true},{"question":"14","answer":false},{"question":"23","answer":false},{"question":"44","answer":false},{"question":"47","answer":false},{"question":"48","answer":false}]},{"typeName":"研究型","typeCode":"I","item":[{"question":"6","answer":true},{"question":"8","answer":true},{"question":"20","answer":true},{"question":"30","answer":true},{"question":"31","answer":true},{"question":"42","answer":true},{"question":"22","answer":false},{"question":"55","answer":false},{"question":"56","answer":false},{"question":"58","answer":false}]},{"typeName":"艺术型","typeCode":"A","item":[{"question":"4","answer":true},{"question":"9","answer":true},{"question":"10","answer":true},{"question":"17","answer":true},{"question":"33","answer":true},{"question":"34","answer":true},{"question":"49","answer":true},{"question":"50","answer":true},{"question":"54","answer":true},{"question":"32","answer":false}]},{"typeName":"社会型","typeCode":"S","item":[{"question":"26","answer":true},{"question":"37","answer":true},{"question":"52","answer":true},{"question":"59","answer":true},{"question":"1","answer":false},{"question":"12","answer":false},{"question":"15","answer":false},{"question":"27","answer":false},{"question":"45","answer":false},{"question":"53","answer":false}]},{"typeName":"企业型","typeCode":"E","item":[{"question":"11","answer":true},{"question":"24","answer":true},{"question":"28","answer":true},{"question":"35","answer":true},{"question":"38","answer":true},{"question":"46","answer":true},{"question":"60","answer":true},{"question":"3","answer":false},{"question":"16","answer":false},{"question":"25","answer":false}]},{"typeName":"传统型","typeCode":"C","item":[{"question":"7","answer":true},{"question":"19","answer":true},{"question":"29","answer":true},{"question":"39","answer":true},{"question":"41","answer":true},{"question":"51","answer":true},{"question":"57","answer":true},{"question":"5","answer":false},{"question":"18","answer":false},{"question":"40","answer":false}]}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
         * typeName : 实际型
         * typeCode : R
         * item : [{"question":"2","answer":true},{"question":"13","answer":true},{"question":"22","answer":true},{"question":"36","answer":true},{"question":"43","answer":true},{"question":"14","answer":false},{"question":"23","answer":false},{"question":"44","answer":false},{"question":"47","answer":false},{"question":"48","answer":false}]
         */

        private String typeName;
        private String typeCode;
        private List<HldAItemBean> item;

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeCode() {
            return typeCode;
        }

        public void setTypeCode(String typeCode) {
            this.typeCode = typeCode;
        }

        public List<HldAItemBean> getItem() {
            return item;
        }

        public void setItem(List<HldAItemBean> item) {
            this.item = item;
        }

    }
}
