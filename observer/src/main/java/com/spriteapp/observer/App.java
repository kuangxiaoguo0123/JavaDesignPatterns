package com.spriteapp.observer;

/**
 * 观察者模式
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class App {

    public static void test() {
        AllyControlCenter controlCenter = new ConcreteAllyControlCenter("金庸群侠");

        Observer player1;
        Observer player2;
        Observer player3;
        Observer player4;

        player1 = new Player("杨过");
        player2 = new Player("令狐冲");
        player3 = new Player("段誉");
        player4 = new Player("张无忌");

        controlCenter.addObserver(player1);
        controlCenter.addObserver(player2);
        controlCenter.addObserver(player3);
        controlCenter.addObserver(player4);

        player1.beAttacked(controlCenter);
    }
}
