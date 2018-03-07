package com.spriteapp.abstract_factory;

/**
 * Created by kuangxiaoguo on 2018/3/7.
 */

public class App {

    public static void test() {
        SkinFactory factory;
        factory = new SpringSkinFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
