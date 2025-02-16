package com.design.pattern.strategyPattern.fly.impl;

import com.design.pattern.strategyPattern.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 날개로 날수있습니다.");
    }
}
