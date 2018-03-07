package com.spriteapp.abstract_factory;

/**
 * 具体工厂，蓝色皮肤工厂
 * Created by kuangxiaoguo on 2018/3/7.
 */

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
