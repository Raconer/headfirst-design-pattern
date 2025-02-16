package com.design.pattern.strategyPattern.duck;

import com.design.pattern.strategyPattern.fly.impl.FlyNoWay;
import com.design.pattern.strategyPattern.quackBehavior.impl.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("저는 고무 오리입니다!");
    }
}
