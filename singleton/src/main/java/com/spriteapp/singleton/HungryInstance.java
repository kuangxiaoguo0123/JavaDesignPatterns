package com.spriteapp.singleton;

/**
 * Created by kuangxiaoguo on 2018/2/26.
 */

public class HungryInstance {

    private static final HungryInstance INSTANCE = new HungryInstance();

    private HungryInstance() {
    }

    public static HungryInstance getInstance() {
        return INSTANCE;
    }
}
