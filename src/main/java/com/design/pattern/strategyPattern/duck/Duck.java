package com.design.pattern.strategyPattern.duck;

import com.design.pattern.strategyPattern.fly.FlyBehavior;
import com.design.pattern.strategyPattern.quackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {  // 동적으로 변경 가능
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {  // 동적으로 변경 가능
        quackBehavior = qb;
    }


    public void swim() {
        System.out.println("오리가 수영합니다.");
    }
    public void performFly() {
        flyBehavior.fly();  // 행동 위임
    }
    public void performQuack() {
        quackBehavior.quack();  // 행동 위임
    }


    public abstract void display();
}
