package com.spriteapp.factory_method;

/**
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
