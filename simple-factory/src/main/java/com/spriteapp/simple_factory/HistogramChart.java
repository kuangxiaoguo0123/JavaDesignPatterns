package com.spriteapp.simple_factory;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("展示柱状图");
    }
}
