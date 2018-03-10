package com.spriteapp.decorator;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class Window implements Component {

    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
