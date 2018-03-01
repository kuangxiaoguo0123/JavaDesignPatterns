package com.spriteapp.observer;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public interface Observer {

    void setName(String name);

    String getName();

    void help();

    void beAttacked(AllyControlCenter control);
}
