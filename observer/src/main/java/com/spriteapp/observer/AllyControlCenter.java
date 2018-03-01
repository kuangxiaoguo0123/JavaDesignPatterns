package com.spriteapp.observer;

import java.util.ArrayList;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public abstract class AllyControlCenter {

    protected String allName;
    protected ArrayList<Observer> observerList = new ArrayList<>();

    public String getAllName() {
        return allName;
    }

    public void setAllName(String allName) {
        this.allName = allName;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void notifyObservers(String name);

}
