package com.spriteapp.javadesignpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        App.test();
//        com.spriteapp.strategy.App.test();
        com.spriteapp.factory_method.App.test();
    }
}
