package com.spriteapp.strategy;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class ChildrenDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        return price - 10;
    }
}
