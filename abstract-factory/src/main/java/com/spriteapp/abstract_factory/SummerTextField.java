package com.spriteapp.abstract_factory;

/**
 * Created by kuangxiaoguo on 2018/3/7.
 */

public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
