package com.liuxe.gaokaoass.ui.careerquiz.hld.bean;

import java.util.List;

/*
 *Created by Liuxe on
 *desc :霍兰德试题
 */
public class HldQBean {

    /**
     * code : 200
     * msg : success
     * data : [{"question":"1.我喜欢把一件事情做完后再做另一件事。"},{"question":"2.在学习和生活中我喜欢独自筹划，不愿受别人干涉。"},{"question":"3.在集体讨论中，我往往保持沉默。"},{"question":"4.我喜欢做戏剧、音乐、歌舞、新闻采访等方面的工作。"},{"question":"5.每次写信我都一挥而就，不再重复。"},{"question":"6.我经常不停地思考某一问题，直到想出正确的答案。"},{"question":"7.对别人借我的和我借别人的东西，我都能记得很清楚。"},{"question":"8.我喜欢抽象思维的工作，不喜欢动手的工作。"},{"question":"9.我喜欢成为人们注意的焦点。"},{"question":"10.我喜欢不时地夸耀一下自己取得的好成就。"},{"question":"11.我很渴望参加探险活动。"},{"question":"12.当我一个独处时，会感到更愉快。"},{"question":"13.我喜欢在做事情前，对此事情做出细致的安排。"},{"question":"14.我讨厌修理自行车、电器一类的工作。"},{"question":"15.我喜欢参加各种各样的聚会。"},{"question":"16.对于将来的职业，我愿意从事虽然工资少、但是比较稳定的职业。"},{"question":"17.我常陶醉于音乐之中。"},{"question":"18.我办事很少思前想后。"},{"question":"19.我在处理学校事务时，经常请示老师。"},{"question":"20.比较普通的游戏，我更喜欢需要动脑子的智力游戏。"},{"question":"21.我很难持续集中注意力在2小时以上。"},{"question":"22.我喜欢亲自动手制作一些小玩意儿，从中得到乐趣。"},{"question":"23.我的动手能力很差。"},{"question":"24.和不熟悉的人交谈对我来说毫不困难。"},{"question":"25.和别人谈判时，我总是很容易放弃自己的观点。"},{"question":"26.我很容易结识同性别的朋友。"},{"question":"27.我做人做事，既不悲观，也不偏激，基本属于不偏不倚的温和型。"},{"question":"28.当我开始做一件事情后，即使碰到再多的困难，我也要执著地干下去。"},{"question":"29.我是一个沉静而不易动感情的人。"},{"question":"30.做事情时，我喜欢避免干扰。"},{"question":"31.我的理想是当一名科学家。"},{"question":"32.与言情小说相比，我更喜欢推理小说。"},{"question":"33.有些人太霸道，有时明明知道他们是对的，也要和他们对着干。"},{"question":"34.我爱幻想。"},{"question":"35.我总是主动地向别人提出自己的建议。"},{"question":"36.我喜欢使用钳子、改锥、螺丝刀、万用表一类的工具。"},{"question":"37.我乐于助人。"},{"question":"38.我比赛或玩游戏，爱与别人打赌。"},{"question":"39.我乐于按父母和老师的安排去做事。"},{"question":"40.如果将来参加工作，我希望能经常换不同的工作来做。"},{"question":"41.与朋友约好了见面，我总留有充裕的时间以免迟到。"},{"question":"42.我喜欢阅读自然科学方面的书籍和杂志。"},{"question":"43.如果掌握一门精湛的手艺并能以此赚到足够多的钱，我会感到满足。"},{"question":"44.我对汽车司机、汽车修理工职业比较感兴趣。"},{"question":"45.听别人谈\u201c家中被盗\u201d一类的事，很难引起我的同情。"},{"question":"46.如果待遇相同，我宁愿当商品推销员，而不愿当图书管理员。"},{"question":"47.我讨厌跟各类机械打交道。"},{"question":"48.我小时候经常把玩具拆开，把里面看个究竟。"},{"question":"49.当接受新任务后，我喜欢以自己的独特方法去完成它。"},{"question":"50.我有文艺方面的天赋。"},{"question":"51.我喜欢把一切安排得整整齐齐、井井有条。"},{"question":"52.我喜欢做一名教师。"},{"question":"53.和一群人在一起的时候，我总想不出恰当的话来说。"},{"question":"54.看情感影片时，我常禁不住眼圈红润。"},{"question":"55.我讨厌学数学。"},{"question":"56.假如将我单独一个人留着实验室做实验，我会感到非常无聊。"},{"question":"57.对于急躁、爱发脾气的人，我仍能以礼相待。"},{"question":"58.遇到难解答的题目时，我常常中途放弃，改做下一题。"},{"question":"59.大家公认我是一名勤劳踏实的、愿为大家服务的人。"},{"question":"60.我喜欢协助老师做班级管理类的工作。"}]
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
         * question : 1.我喜欢把一件事情做完后再做另一件事。
         */

        private String question;

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }
    }
}
