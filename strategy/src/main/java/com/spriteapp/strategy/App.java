package com.spriteapp.strategy;

/**
 * 策略模式
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class App {

    public static void test() {

        MovieTicket ticket = new MovieTicket();
        double price = 60;
        Discount discount = new VIPDiscount();
        ticket.setDiscount(discount);
        ticket.setPrice(price);
        System.out.println("原始票价：" + price);
        System.out.println("--------------------");
        System.out.println("打折票价：" + ticket.getPrice());
    }
}
