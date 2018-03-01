package com.spriteapp.observer;

/**
 * Created by kuangxiaoguo on 2018/3/1.
 */

public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allName) {
        System.out.println(allName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allName = allName;
    }

    @Override
    public void notifyObservers(String name) {
        System.out.println(this.allName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        for (Observer observer : observerList) {
            if (name.equalsIgnoreCase(observer.getName())) {
                continue;
            }
            observer.help();
        }
    }
}
