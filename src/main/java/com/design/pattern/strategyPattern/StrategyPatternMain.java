package com.design.pattern.strategyPattern;

import com.design.pattern.strategyPattern.duck.Duck;
import com.design.pattern.strategyPattern.duck.MallardDuck;
import com.design.pattern.strategyPattern.duck.RubberDuck;
import com.design.pattern.strategyPattern.fly.impl.FlyWithWings;

public class StrategyPatternMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println();

        // 행동 동적 변경
        System.out.println("고무 오리가 날 수 있도록 변경!");
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
