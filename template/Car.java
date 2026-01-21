package template;
// 추상 클래스와 템플릿 메서드 구현
public abstract class Car {
    // 추상 메서드
    public abstract void drive();
    public abstract void stop();
    // 일반(구현) 메서드
    public void startCar() {
        System.out.println("시동 켜기");
    }

    public void turnOff() {
        System.out.println("시동 끄기");
    }
    // 템플릿 메서드: 추상 클래스를 활용해 구현한 '템플릿'
    // 자동차가 시동을 켜고 끄기까지의 과정(실행 순서; 로직) 구현
    // 템플릿 메서드는 변하지 않는 실행 과정을 구현한 것이므로
    // final 예약어를 사용
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
