package com.liuxe.gaokaoass.bean;

import java.util.List;

public class ScorePartBean {

        private List<ScoresAndRanksBean> scores_and_ranks;
        private List<String> need_years;

        public List<ScoresAndRanksBean> getScores_and_ranks() {
            return scores_and_ranks;
        }

        public void setScores_and_ranks(List<ScoresAndRanksBean> scores_and_ranks) {
            this.scores_and_ranks = scores_and_ranks;
        }

        public List<String> getNeed_years() {
            return need_years;
        }

        public void setNeed_years(List<String> need_years) {
            this.need_years = need_years;
        }

        public static class ScoresAndRanksBean {
            /**
             * numbers : 11
             * score : 697
             * sums : 11
             */

            private String numbers;
            private String score;
            private String sums;

            public String getNumbers() {
                return numbers;
            }

            public void setNumbers(String numbers) {
                this.numbers = numbers;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getSums() {
                return sums;
            }

            public void setSums(String sums) {
                this.sums = sums;
            }
        }

}
