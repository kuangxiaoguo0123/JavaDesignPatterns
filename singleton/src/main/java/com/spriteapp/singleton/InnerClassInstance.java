package com.spriteapp.singleton;

/**
 * 内部类加载
 * Created by kuangxiaoguo on 2018/2/26.
 */

public class InnerClassInstance {

    private InnerClassInstance() {
    }

    public static InnerClassInstance getInstance() {
        return SingleHolder.INSTANCE;
    }

    private static class SingleHolder {
        private static final InnerClassInstance INSTANCE = new InnerClassInstance();
    }
}
