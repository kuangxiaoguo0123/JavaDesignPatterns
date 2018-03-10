package com.spriteapp.simple_factory;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class App {

    public static void test() {

        Chart pieChart = ChartFactory.getChart("line");
        pieChart.display();
    }
}
