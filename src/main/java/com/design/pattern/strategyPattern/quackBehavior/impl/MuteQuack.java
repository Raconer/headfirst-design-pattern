package com.design.pattern.strategyPattern.quackBehavior.impl;


import com.design.pattern.strategyPattern.quackBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("........(조용)");
    }
}
