package com.design.pattern.wrongCode;

import com.design.pattern.wrongCode.strategy.Duck;
import com.design.pattern.wrongCode.strategy.MallardDuck;
import com.design.pattern.wrongCode.strategy.RedheadDuck;

/**
 * Chapter 01
 * HeadFirst - Design Pattern을 공부하기 위한 최초의 잘못된 사례
 * 아래와 같은 상황이면 괜찮지만 fly(), feathers()와 같은 여러 메소드가 생성되면 많은 문제가 발생한다.
 * 그래서 아래와 같은 상황은 잘못된 개발이다.
 **/
public class WrongCodeMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        System.out.println();
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();


    }
}