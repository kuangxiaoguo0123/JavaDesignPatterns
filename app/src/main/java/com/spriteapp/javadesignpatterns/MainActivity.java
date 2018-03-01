package com.spriteapp.javadesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.spriteapp.observer.App;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        App.test();
        com.spriteapp.strategy.App.test();
    }
}
