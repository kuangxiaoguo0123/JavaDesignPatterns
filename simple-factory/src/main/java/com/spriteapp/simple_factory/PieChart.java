package com.spriteapp.simple_factory;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("展示饼状图");
    }
}
