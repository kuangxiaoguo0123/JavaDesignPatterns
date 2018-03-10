package com.spriteapp.decorator;

/**
 * Created by kuangxiaoguo on 2018/3/10.
 */

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}
