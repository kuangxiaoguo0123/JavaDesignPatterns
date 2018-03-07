package com.spriteapp.abstract_factory;

/**
 * 具体产品
 * Created by kuangxiaoguo on 2018/3/7.
 */

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }
}
