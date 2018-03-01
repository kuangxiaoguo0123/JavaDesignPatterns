package com.spriteapp.singleton;

/**
 * 单例模式
 * Created by kuangxiaoguo on 2018/2/26.
 */

public class App {

    private static final String TAG = "App";

    public void testInstance() {
        EnumInstance instance1 = EnumInstance.INSTANCE;
        EnumInstance instance2 = EnumInstance.INSTANCE;
    }
}
