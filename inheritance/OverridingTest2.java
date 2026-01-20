package inheritance;
// 클래스 형 변환과 재정의된 메서드 확인
public class OverridingTest2 {
    public static void main(String[] args) {
        // 묵시적 형 변환: 하위 클래스의 인스턴스를 정의할 때 상위 클래스 자료형을 사용할 수 있음
        Customer vc = new VIPCustomer(10030, "홍길동", 10001);
        vc.bonusPoint = 1500;

        System.out.println(vc.getCustomerName() + " 님의 지불 금액: "
        + vc.calcPrice(10000)); // 출력 결과: 9000
        // 가상 메서드 기술: 상위 클래스와, 상속받은 하위 클래스에 같은 이름의 메서드가 있을 때
        // 선언한 클래스형이 아닌 생성된 인스턴스의 메서드가 호출됨.
        // 위의 경우 자료형인 상위 클래스(Customer)가 아닌, 생성된 인스턴스인 하위 메서드(VIP)의 메서드가 호출됨.
    }
}
