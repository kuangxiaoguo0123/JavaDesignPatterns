package com.spriteapp.factory_method;

/**
 * 文件日志记录器：具体产品
 * Created by kuangxiaoguo on 2018/3/2.
 */

public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
