package com.spriteapp.strategy;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return price * 0.8;
    }
}
