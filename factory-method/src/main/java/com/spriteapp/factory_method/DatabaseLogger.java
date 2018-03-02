package com.spriteapp.factory_method;

/**
 * 数据库日志记录器：具体产品
 * Created by kuangxiaoguo on 2018/3/2.
 */

public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
