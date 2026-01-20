package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList= new ArrayList<Customer>();

        Customer customerKim = new VIPCustomer(10001, "김견강", 1000);
        Customer customerV = new GoldCustomer(10002, "뷔구룽");
        Customer customerAioi = new GoldCustomer(10003, "아이오이 유코");
        Customer customerNaganohara = new Customer(10004, "나가노하라 미오");
        Customer customerMinakami = new Customer(10005, "미나카미 마이");

        customerList.add(customerKim);
        customerList.add(customerV);
        customerList.add(customerAioi);
        customerList.add(customerNaganohara);
        customerList.add(customerMinakami);

        // 향상된 for문을 사용해 고객 정보 출력(이쪽이 좀 더 코드가 간결함!)
        System.out.println("====== 고객 정보 ======");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println( );

        System.out.println("====== 할인율과 보너스 포인트 ======");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님의 지불 금액: " + cost + " 원");
            System.out.println(customer.getCustomerName() + " 민의 현재 보너스 포인트: " + customer.bonusPoint);
        }
    }
}
