package com.spriteapp.observer;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void help() {
        System.out.println("坚持住," + this.name + "来救你了！");
    }

    @Override
    public void beAttacked(AllyControlCenter control) {
        System.out.println(this.name + "被攻击！");
        control.notifyObservers(this.name);
    }
}
