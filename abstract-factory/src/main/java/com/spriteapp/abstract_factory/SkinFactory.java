package com.spriteapp.abstract_factory;

/**
 * 抽象工厂
 * Created by kuangxiaoguo on 2018/3/7.
 */

public interface SkinFactory {

    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
