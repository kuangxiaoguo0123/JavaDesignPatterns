package com.spriteapp.composite;

/**
 * 抽象文件类：抽象构件
 * Created by kuangxiaoguo on 2018/3/8.
 */

abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}