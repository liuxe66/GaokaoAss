package com.liuxe.gaokaoass.bean;

import java.util.List;

public class EchartsBean {

    /**
     * title : {"text":"雷达图"}
     * tooltip : {}
     * legend : {"data":["能力值"]}
     * radar : {"name":{"textStyle":{"color":"black","backgroundColor":"yellow","borderRadius":3,"padding":[3,5]}},"indicator":[{"name":"文化","max":100},{"name":"生活","max":100},{"name":"娱乐","max":100},{"name":"流行","max":100},{"name":"科学","max":100}]}
     * series : [{"name":"能力","type":"radar","areaStyle":{"normal":{}},"data":[{"name":"能力值","value":[80,90,94,85,88]}]}]
     */

    private TitleBean title;
    private TooltipBean tooltip;
    private LegendBean legend;
    private RadarBean radar;
    private List<SeriesBean> series;

    public TitleBean getTitle() {
        return title;
    }

    public void setTitle(TitleBean title) {
        this.title = title;
    }

    public TooltipBean getTooltip() {
        return tooltip;
    }

    public void setTooltip(TooltipBean tooltip) {
        this.tooltip = tooltip;
    }

    public LegendBean getLegend() {
        return legend;
    }

    public void setLegend(LegendBean legend) {
        this.legend = legend;
    }

    public RadarBean getRadar() {
        return radar;
    }

    public void setRadar(RadarBean radar) {
        this.radar = radar;
    }

    public List<SeriesBean> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesBean> series) {
        this.series = series;
    }

    public static class TitleBean {
        /**
         * text : 雷达图
         */

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class TooltipBean {
    }

    public static class LegendBean {
        private List<String> data;

        public List<String> getData() {
            return data;
        }

        public void setData(List<String> data) {
            this.data = data;
        }
    }

    public static class RadarBean {
        /**
         * name : {"textStyle":{"color":"black","backgroundColor":"yellow","borderRadius":3,"padding":[3,5]}}
         * indicator : [{"name":"文化","max":100},{"name":"生活","max":100},{"name":"娱乐","max":100},{"name":"流行","max":100},{"name":"科学","max":100}]
         */

        private NameBean name;
        private List<IndicatorBean> indicator;

        public NameBean getName() {
            return name;
        }

        public void setName(NameBean name) {
            this.name = name;
        }

        public List<IndicatorBean> getIndicator() {
            return indicator;
        }

        public void setIndicator(List<IndicatorBean> indicator) {
            this.indicator = indicator;
        }

        public static class NameBean {
            /**
             * textStyle : {"color":"black","backgroundColor":"yellow","borderRadius":3,"padding":[3,5]}
             */

            private TextStyleBean textStyle;

            public TextStyleBean getTextStyle() {
                return textStyle;
            }

            public void setTextStyle(TextStyleBean textStyle) {
                this.textStyle = textStyle;
            }

            public static class TextStyleBean {
                /**
                 * color : black
                 * backgroundColor : yellow
                 * borderRadius : 3
                 * padding : [3,5]
                 */

                private String color;
                private String backgroundColor;
                private int borderRadius;
                private List<Integer> padding;

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getBackgroundColor() {
                    return backgroundColor;
                }

                public void setBackgroundColor(String backgroundColor) {
                    this.backgroundColor = backgroundColor;
                }

                public int getBorderRadius() {
                    return borderRadius;
                }

                public void setBorderRadius(int borderRadius) {
                    this.borderRadius = borderRadius;
                }

                public List<Integer> getPadding() {
                    return padding;
                }

                public void setPadding(List<Integer> padding) {
                    this.padding = padding;
                }
            }
        }

        public static class IndicatorBean {
            /**
             * name : 文化
             * max : 100
             */

            private String name;
            private int max;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }
        }
    }

    public static class SeriesBean {
        /**
         * name : 能力
         * type : radar
         * areaStyle : {"normal":{}}
         * data : [{"name":"能力值","value":[80,90,94,85,88]}]
         */

        private String name;
        private String type;
        private AreaStyleBean areaStyle;
        private List<DataBean> data;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public AreaStyleBean getAreaStyle() {
            return areaStyle;
        }

        public void setAreaStyle(AreaStyleBean areaStyle) {
            this.areaStyle = areaStyle;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class AreaStyleBean {
            /**
             * normal : {}
             */

            private NormalBean normal;

            public NormalBean getNormal() {
                return normal;
            }

            public void setNormal(NormalBean normal) {
                this.normal = normal;
            }

            public static class NormalBean {
            }
        }

        public static class DataBean {
            /**
             * name : 能力值
             * value : [80,90,94,85,88]
             */

            private String name;
            private List<Integer> value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }
    }
}
