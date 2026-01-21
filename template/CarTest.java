package template;
// 템플릿 메서드 테스트
public class CarTest {
    public static void main(String[] args) {
        System.out.println("=== 자율 주행 자동차 ===");
        Car myCar = new AICar();
        myCar.run(); // 템플릿 메서드 호출

        System.out.println("=== 사람이 운전하는 자동차 ===");
        Car hisCar = new ManualCar();
        hisCar.run(); // 템플릿 메서드 호출
    }
}
