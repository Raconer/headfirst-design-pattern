package com.design.pattern.strategyPattern.fly.impl;

import com.design.pattern.strategyPattern.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 날지 못합니다.");
    }
}
