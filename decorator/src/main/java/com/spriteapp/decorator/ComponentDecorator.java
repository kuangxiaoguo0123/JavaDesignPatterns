package com.spriteapp.decorator;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class ComponentDecorator implements Component {

    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
