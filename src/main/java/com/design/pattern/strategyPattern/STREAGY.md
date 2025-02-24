# 1. 전략 패턴(Strategy Pattern)
## 정의

> 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해 줍니다. 
> 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.

## 문제를 명확하게 파악하기
* **상속의 한계** : 서브클래스마다 행동이 다를 수 있지만, 상속을 사용하면 하나의 행동만 강제됨.
* **인터페이스의 한계** : Flyable, Quackable 같은 인터페이스를 사용하면 특정 행동을 구현할 수는 있지만, **코드 재사용**이 **불가능**함.
* **문제점** : 새로운 행동을 추가하거나 변경할 때, 관련된 모든 서브클래스를 수정해야 하고, 이 과정에서 버그가 발생할 가능성이 높음.
* **해결책(디자인 원칙)** : 행동을 개별적인 클래스로 분리하고 필요할 때 객체에서 동적으로 변경할 수 있도록 함. (즉, 전략 패턴 사용)

## 디자인 원칙
> **바뀌는 부분**은 따로 뽑아서 **캡슐화** 한다. 
> 그러면 나중에 **바뀌지 않는 부분**에는 영향을 미치지 않고 **그 부분만 고치거나 확장**할 수 있다.

## 바뀌는 부분과 그렇지 않은 부분 분리하기

* 바뀌는 부분
  * fly()
  * quack()
* 바뀌지 않은 부분
  * 나머지 부분
