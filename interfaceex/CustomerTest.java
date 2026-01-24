package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // Customer형 변수 customer를 상위 인터페이스 Buy형인 buyer에 대입(형 변환)
        // buyer 변수는 Sell 인터페이스의 메서드만 호출 가능
        Buy buyer = customer;
        buyer.buy();
        buyer.order();
        // Customer형 변수 customer를 상위 인터페이스 Sell형인 seller에 대입(형 변환)
        // seller 변수는 Sell 인터페이스의 메서드만 호출 가능
        Sell seller = customer;
        seller.sell();
        seller.order();

        // 다운 캐스팅: seller를 하위 클래스형인 Customer로 다시 형 변환
        if (seller instanceof Customer) {
            Customer customer2 = (Customer)seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
