package com.liuxe.gaokaoass.ui.careerquiz.mbti.bean;

import java.util.List;

public class MbtiABean {

    /**
     * error : 0
     * msg :
     * data : [{"number":"1","option":{"A":"J","B":"P"}},{"number":"2","option":{"A":"P","B":"J"}},{"number":"3","option":{"A":"S","B":"N"}},{"number":"4","option":{"A":"E","B":"I"}},{"number":"5","option":{"A":"N","B":"S"}},{"number":"6","option":{"A":"F","B":"T"}},{"number":"7","option":{"A":"P","B":"J"}},{"number":"8","option":{"A":"E","B":"I"}},{"number":"9","option":{"A":"J","B":"P"}},{"number":"10","option":{"A":"J","B":"P"}},{"number":"11","option":{"A":"P","B":"J"}},{"number":"12","option":{"A":"I","B":"E"}},{"number":"13","option":{"A":"S","B":"N"}},{"number":"14","option":{"A":"E","B":"I"}},{"number":"15","option":{"A":"N","B":"S"}},{"number":"16","option":{"A":"F","B":"T"}},{"number":"17","option":{"A":"P","B":"J"}},{"number":"18","option":{"A":"I","B":"E"}},{"number":"19","option":{"A":"E","B":"I"}},{"number":"20","option":{"A":"J","B":"P"}},{"number":"21","option":{"A":"P","B":"J"}},{"number":"22","option":{"A":"I","B":"E"}},{"number":"23","option":{"A":"E","B":"I"}},{"number":"24","option":{"A":"N","B":"S"}},{"number":"25","option":{"A":"P","B":"J"}},{"number":"26","option":{"A":"I","B":"E"}},{"number":"27","option":{"A":"I","B":"E"}},{"number":"28","option":{"A":"J","B":"P"}},{"number":"29","option":{"A":"N","B":"S"}},{"number":"30","option":{"A":"F","B":"T"}},{"number":"31","option":{"A":"T","B":"F"}},{"number":"32","option":{"A":"S","B":"N"}},{"number":"33","option":{"A":"P","B":"J"}},{"number":"34","option":{"A":"E","B":"I"}},{"number":"35","option":{"A":"I","B":"E"}},{"number":"36","option":{"A":"J","B":"P"}},{"number":"37","option":{"A":"N","B":"S"}},{"number":"38","option":{"A":"F","B":"T"}},{"number":"39","option":{"A":"T","B":"F"}},{"number":"40","option":{"A":"S","B":"N"}},{"number":"41","option":{"A":"P","B":"J"}},{"number":"42","option":{"A":"I","B":"E"}},{"number":"43","option":{"A":"J","B":"P"}},{"number":"44","option":{"A":"N","B":"S"}},{"number":"45","option":{"A":"F","B":"T"}},{"number":"46","option":{"A":"T","B":"F"}},{"number":"47","option":{"A":"S","B":"N"}},{"number":"48","option":{"A":"I","B":"E"}},{"number":"49","option":{"A":"J","B":"P"}},{"number":"50","option":{"A":"N","B":"S"}},{"number":"51","option":{"A":"F","B":"T"}},{"number":"52","option":{"A":"T","B":"F"}},{"number":"53","option":{"A":"S","B":"N"}},{"number":"54","option":{"A":"I","B":"E"}},{"number":"55","option":{"A":"N","B":"S"}},{"number":"56","option":{"A":"F","B":"T"}},{"number":"57","option":{"A":"T","B":"F"}},{"number":"58","option":{"A":"S","B":"N"}},{"number":"59","option":{"A":"J","B":"P"}},{"number":"60","option":{"A":"I","B":"E"}},{"number":"61","option":{"A":"S","B":"N"}},{"number":"62","option":{"A":"E","B":"I"}},{"number":"63","option":{"A":"N","B":"S"}},{"number":"64","option":{"A":"F","B":"T"}},{"number":"65","option":{"A":"P","B":"J"}},{"number":"66","option":{"A":"I","B":"E"}},{"number":"67","option":{"A":"E","B":"I"}},{"number":"68","option":{"A":"J","B":"P"}},{"number":"69","option":{"A":"T","B":"F"}},{"number":"70","option":{"A":"J","B":"P"}},{"number":"71","option":{"A":"P","B":"J"}},{"number":"72","option":{"A":"I","B":"E"}},{"number":"73","option":{"A":"S","B":"N"}},{"number":"74","option":{"A":"N","B":"S"}},{"number":"75","option":{"A":"F","B":"T"}},{"number":"76","option":{"A":"P","B":"J"}},{"number":"77","option":{"A":"E","B":"I"}},{"number":"78","option":{"A":"T","B":"F"}},{"number":"79","option":{"A":"N","B":"S"}},{"number":"80","option":{"A":"F","B":"T"}},{"number":"81","option":{"A":"T","B":"F"}},{"number":"82","option":{"A":"S","B":"N"}},{"number":"83","option":{"A":"N","B":"S"}},{"number":"84","option":{"A":"F","B":"T"}},{"number":"85","option":{"A":"T","B":"F"}},{"number":"86","option":{"A":"S","B":"N"}},{"number":"87","option":{"A":"N","B":"S"}},{"number":"88","option":{"A":"F","B":"T"}},{"number":"89","option":{"A":"T","B":"F"}},{"number":"90","option":{"A":"S","B":"N"}},{"number":"91","option":{"A":"F","B":"T"}},{"number":"92","option":{"A":"T","B":"F"}},{"number":"93","option":{"A":"S","B":"N"}}]
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
         * number : 1
         * option : {"A":"J","B":"P"}
         */

        private String number;
        private OptionBean option;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public OptionBean getOption() {
            return option;
        }

        public void setOption(OptionBean option) {
            this.option = option;
        }

        public static class OptionBean {
            /**
             * A : J
             * B : P
             */

            private String A;
            private String B;

            public String getA() {
                return A;
            }

            public void setA(String A) {
                this.A = A;
            }

            public String getB() {
                return B;
            }

            public void setB(String B) {
                this.B = B;
            }
        }
    }
}
