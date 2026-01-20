package abstractex;
// 추상 클래스 구현 예제
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    // 여기까지는 구현부(중괄호 {})가 없는 추상 클래스
    // 아래는 구현부가 있는 일반 클래스
    public void turnOn() {
        System.out.println("전원 켜기");
    }

    public void turnOff() {
        System.out.println("전원 끄기");
    }
}
