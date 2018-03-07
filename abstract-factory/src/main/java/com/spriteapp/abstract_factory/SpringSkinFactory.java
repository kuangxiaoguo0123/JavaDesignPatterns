package com.spriteapp.abstract_factory;

/**
 * 具体工厂,绿色皮肤
 * Created by kuangxiaoguo on 2018/3/7.
 */

public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
