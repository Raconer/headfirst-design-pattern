package com.design.pattern.strategyPattern.duck;

import com.design.pattern.strategyPattern.fly.impl.FlyWithWings;
import com.design.pattern.strategyPattern.quackBehavior.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리입니다!");
    }
}
