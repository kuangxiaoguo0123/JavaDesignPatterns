package com.spriteapp.factory_method;

/**
 * 数据库日志记录器工厂类：具体工厂
 * Created by kuangxiaoguo on 2018/3/2.
 */

public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
