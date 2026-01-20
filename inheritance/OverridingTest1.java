package inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerKim = new Customer(10010, "김견강");
        customerKim.bonusPoint = 1000;

        VIPCustomer customerV = new VIPCustomer(10020, "뷔구룽", 12345);
        customerV.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerKim.getCustomerName() + " 님의 지불 금액: "
                + customerKim.calcPrice(price));
        System.out.println(customerV.getCustomerName() + " 님의 지불 금액: "
                + customerV.calcPrice(price));
    }
}
