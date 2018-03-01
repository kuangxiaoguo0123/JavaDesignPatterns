package com.spriteapp.strategy;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class MovieTicket {

    private double price;

    private Discount discount;

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
