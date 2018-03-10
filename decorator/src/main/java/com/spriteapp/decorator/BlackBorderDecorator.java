package com.spriteapp.decorator;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为控件增加黑色边框");
    }
}
