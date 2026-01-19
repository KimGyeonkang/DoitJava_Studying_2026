package inheritance;
// 상속받은 하위 클래스는 상위 클래스의 기본 속성(변수)과 메서드 등을 정상적으로 사용할 수 있다.
public class CustomerTest1 {
    public static void main(String[] args) {
        // 실제 고객 정보를 담을 인스턴스 변수(클래스형)
        Customer customerLee = new Customer(10010, "이아무개");
        /* customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이아무개"); */
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        System.out.println("=============================");

        VIPCustomer customerV = new VIPCustomer(10020, "뷔구룽", 20001);
        /* customerV.setCustomerID(10020);
        customerV.setCustomerName("뷔구룽"); */
        customerV.bonusPoint = 10000;
        System.out.println(customerV.showVIPInfo());
        // VIP 고객 클래스는, 일반 고객 클래스를 상속받았으므로
        // 두 클래스의 생성자를 모두 호출함을 알 수 있다.
        // 이때, 하위 클래스인 VIP 클래스에서, super()를 자동으로 호출했음을 짐작할 수 있다.
    }
}
