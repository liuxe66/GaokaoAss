package com.liuxe.gaokaoass.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoBean {

    /**
     * data : [{"id":"5","rank":"4","title":"怎样了解一个大学：排名靠前的大学就一定是好大学吗？","cover-img":"https://gw.alicdn.com/L1/723/1559210786/5b/d4/64/5bd46414bb7a22c0008e43f97872dcbe.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how-1.mp4"},{"id":"6","rank":"5","title":"怎样了解一个大学：中国高校的评价体系","cover-img":"https://gw.alicdn.com/L1/723/1559211350/d5/7f/98/d57f98d38234f3729e848fbba7eafec6.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college1.mp4"},{"id":"7","rank":"6","title":"怎样了解一个大学：从学校历史看强势专业","cover-img":"https://gw.alicdn.com/L1/723/1559211428/7c/ba/e1/7cbae15cc226ba13ad3140bfbb3518d1.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college-4.mp4"},{"id":"8","rank":"7","title":"怎样了解一个大学：从院士看强势专业","cover-img":"https://gw.alicdn.com/L1/723/1559211578/85/03/fe/8503feb8825399b83997efdb28b1363f.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college5.mp4"},{"id":"9","rank":"8","title":"怎样了解一个大学：从博士点、硕士点看学校优势专业.","cover-img":"https://gw.alicdn.com/L1/723/1559211667/75/99/50/7599502b6cbe9fdb9b8029492f209fbb.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college6.mp4"},{"id":"10","rank":"9","title":"怎样了解一个大学：名字很有特点的学校","cover-img":"https://gw.alicdn.com/L1/723/1559211820/b1/3e/69/b13e69634492aa8239eef25cd4588b33.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college-2.mp4"},{"id":"11","rank":"10","title":"怎样了解一个大学：传说中的窝里横","cover-img":"https://gw.alicdn.com/L1/723/1559211892/b1/f5/b8/b1f5b84921173ca97034c8fa1f43d50d.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/college3.mp4"},{"id":"13","rank":"11","title":"怎样了解一个大学：部级直属院校","cover-img":"https://gw.alicdn.com/L1/723/1559211998/78/76/bc/7876bc0d817dfe7ceb6af2c9c5efa413.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how-8.mp4"},{"id":"14","rank":"12","title":"如何度过大学：开学时的心理落差","cover-img":"https://gw.alicdn.com/L1/723/1559212193/bd/44/df/bd44dfe497245cfdbe69c330a1c07547.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how1.mp4"},{"id":"15","rank":"13","title":"如何读过大学：关于四六级","cover-img":"https://gw.alicdn.com/L1/723/1559212430/d7/47/03/d74703b61fdca4404dc982a533e26fc3.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how2.mp4"},{"id":"16","rank":"14","title":"如何度过大学：关于考证","cover-img":"https://gw.alicdn.com/L1/723/1559212524/c1/75/df/c175df93976ac3314c28e6cfbd27d250.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how3.mp4"},{"id":"17","rank":"15","title":"怎样度过大学：关于双学位","cover-img":"https://gw.alicdn.com/L1/723/1559212733/df/84/0e/df840ef66631ac08d0736bcf1adcb11c.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how4.mp4"},{"id":"18","rank":"16","title":"如何读过大学：关于兼职","cover-img":"https://gw.alicdn.com/L1/723/1559212849/cf/09/7f/cf097fe1fb729f53bdbbef54273939ae.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how5.mp4"},{"id":"19","rank":"17","title":"如何度过大学：大学里的校园恋爱","cover-img":"https://gw.alicdn.com/L1/723/1559213097/70/08/ff/7008ff614369dc726a283cf254947a56.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how6.mp4"},{"id":"20","rank":"18","title":"怎样度过大学：大学毕业后的选择","cover-img":"https://gw.alicdn.com/L1/723/1559213080/ca/cf/90/cacf9096ea9e74fdfd1f4f61c8df1830.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how7.mp4"},{"id":"21","rank":"19","title":"如何度过大学：保研或考研应该知道的事","cover-img":"https://gw.alicdn.com/L1/723/1559213180/ce/7c/04/ce7c049efd9623673cc1a9116bfd510e.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how8.mp4"},{"id":"22","rank":"20","title":"如何度过大学：出国留学该知道的事","cover-img":"https://gw.alicdn.com/L1/723/1559213267/56/b2/3f/56b23fd914f1290bd979d45e1f8ca9d8.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how9.mp4"},{"id":"23","rank":"21","title":"如何度过大学：考公务员该知道的事","cover-img":"https://gw.alicdn.com/L1/723/1559213388/3e/d1/55/3ed15592561629ae557b884d2d009f54.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how10.mp4"},{"id":"24","rank":"22","title":"如何读过大学：毕业后直接就业该知道的事","cover-img":"https://gw.alicdn.com/L1/723/1559213538/3c/49/31/3c49319939b790866112f34ddc6beb52.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/how11.mp4"},{"id":"25","rank":"23","title":"高中生活：长大后会发现，家长和老师说的都是真话","cover-img":"https://gw.alicdn.com/L1/723/1559216404/dc/a1/49/dca149513b664d150347dba330ad53ac.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/hishschool-1.mp4"},{"id":"26","rank":"24","title":"高中生活：如果孩子不好好学习，家长该怎么办","cover-img":"https://gw.alicdn.com/L1/723/1559213754/94/4b/b9/944bb9e9c13d78ad866cecf894f3de6c.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/highschool-2.mp4"},{"id":"27","rank":"25","title":"高中生活：迷茫时怎么办？","cover-img":"https://gw.alicdn.com/L1/723/1559213853/43/ad/25/43ad253496d8c1a382e73f9f250f62d5.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/highschool-3.mp4"},{"id":"28","rank":"26","title":"高中生活：成绩差的困扰","cover-img":"https://gw.alicdn.com/L1/723/1559213909/0d/c1/ec/0dc1ecccc33eca48eae640fea8c04583.jpg","url":"https://cdn.sm.cn/quark/gaokao/video/highschool-4.mp4"}]
     * msg : succ
     * status : 0
     */

    private String msg;
    private int status;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 5
         * rank : 4
         * title : 怎样了解一个大学：排名靠前的大学就一定是好大学吗？
         * cover-img : https://gw.alicdn.com/L1/723/1559210786/5b/d4/64/5bd46414bb7a22c0008e43f97872dcbe.jpg
         * url : https://cdn.sm.cn/quark/gaokao/video/how-1.mp4
         */

        private String id;
        private String rank;
        private String title;
        @SerializedName("cover-img")
        private String coverimg;
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCoverimg() {
            return coverimg;
        }

        public void setCoverimg(String coverimg) {
            this.coverimg = coverimg;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
