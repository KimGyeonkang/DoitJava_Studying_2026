package template;
// Car 클래스를 상속받는 ManualCar 클래스
public class ManualCar extends Car {
    // 상속받은 추상 메서드 구현
    @Override
    public void drive() {
        System.out.println("사람이 운전");
        System.out.println("핸들 조작");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아 정지");
    }
}
