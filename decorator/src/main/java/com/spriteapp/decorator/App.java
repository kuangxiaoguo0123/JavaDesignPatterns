package com.spriteapp.decorator;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class App {

    public static void test() {

        Component component;
        Component componentSB;
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        Component componentBlackBoard = new BlackBorderDecorator(componentSB);
        componentBlackBoard.display();
    }
}
