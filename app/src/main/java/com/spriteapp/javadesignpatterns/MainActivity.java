package com.spriteapp.javadesignpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.spriteapp.observer.App;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testComposite();
    }

    /**
     * 组合模式
     */
    private void testComposite() {
        com.spriteapp.composite.App.test();
    }

    /**
     * 抽象工厂
     */
    private void testAbstractFactory() {
        com.spriteapp.abstract_factory.App.test();
    }

    /**
     * 观察者模式
     */
    private void testObserver() {
        App.test();
    }

    /**
     * 策略模式
     */
    private void testStrategy() {
        com.spriteapp.strategy.App.test();
    }

    /**
     * 工厂方法模式
     */
    private void testFactoryMethod() {
        com.spriteapp.factory_method.App.test();
    }
}
