package com.design.pattern.strategyPattern.quackBehavior.impl;

import com.design.pattern.strategyPattern.quackBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽉꽉!!");
    }
}
