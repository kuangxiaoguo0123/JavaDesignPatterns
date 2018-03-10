package com.spriteapp.simple_factory;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("展示折线图");
    }
}
