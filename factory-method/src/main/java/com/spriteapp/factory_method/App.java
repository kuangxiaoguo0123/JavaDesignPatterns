package com.spriteapp.factory_method;

/**
 * 工厂方法模式
 * Created by kuangxiaoguo on 2018/3/2.
 */

public class App {

    public static void test() {
        Logger logger;
        LoggerFactory factory;
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
