package com.spriteapp.simple_factory;

import android.text.TextUtils;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class ChartFactory {

    public static Chart getChart(String type) {

        if (TextUtils.isEmpty(type)) {
            return null;
        }
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化创建柱状图");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化创建饼状图");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化创建折线图");
        }
        return chart;
    }
}
