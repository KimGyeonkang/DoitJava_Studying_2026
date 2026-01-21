package template;
// Car 클래스를 상속받는 AICar 클래스
public class AICar extends Car{
    // 상속받은 추상 메서드 구현
    @Override
    public void drive() {
        System.out.println("자율 주행");
        System.out.println("알아서 방향 전환");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춤");
    }
}
