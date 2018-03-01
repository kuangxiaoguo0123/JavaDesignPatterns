package com.spriteapp.strategy;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        System.out.println("增加积分");
        return price * 0.5;
    }
}
