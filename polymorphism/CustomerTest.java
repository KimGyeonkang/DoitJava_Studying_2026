package polymorphism;
// 다형성을 활용한 고객 관리 프로그램(3): 테스트
public class CustomerTest {
    public static void main(String[] args) {
        Customer customerV = new Customer();
        customerV.setCustomerID(10001);
        customerV.setCustomerName("뷔구룽");
        customerV.bonusPoint = 1000;

        System.out.println(customerV.showCustomerInfo());

        Customer customerKim = new VIPCustomer(10002, "김견강", 1000);
        customerKim.bonusPoint = 20000;

        System.out.println(customerKim.showCustomerInfo());
        System.out.println("====== 할인율과 보너스 포인트 계산 ======");

        int price = 100000;
        int vPrice = customerV.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerV.getCustomerName() + " 님의 지불 금액: " + vPrice + "원");
        System.out.println(customerV.showCustomerInfo());
        System.out.println(customerKim.getCustomerName() + " 님의 지불 금액: " + kimPrice + "원");
        System.out.println(customerKim.showCustomerInfo());
    }
}
