package com.spriteapp.singleton;

/**
 * Created by kuangxiaoguo on 2018/2/26.
 */

public class DoubleCheckInstance {

    private static volatile DoubleCheckInstance instance;

    private DoubleCheckInstance() {
    }

    public static DoubleCheckInstance getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckInstance.class) {
                if (instance == null) {
                    instance = new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }
}
