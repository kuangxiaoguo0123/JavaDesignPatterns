package com.spriteapp.singleton;

/**
 * Created by kuangxiaoguo on 2018/2/26.
 */

public class LazyInstance {

    private static LazyInstance instance;

    private LazyInstance() {
    }

    public static synchronized LazyInstance getInstance() {
        if (instance == null) {
            instance = new LazyInstance();
        }
        return instance;
    }
}
