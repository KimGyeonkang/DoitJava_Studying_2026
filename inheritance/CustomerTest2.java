package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerV = new VIPCustomer(10020, "뷔구룽", 20001);
        customerV.setCustomerID(10020);
        customerV.setCustomerName("뷔구룽");
        customerV.bonusPoint = 10000;
        System.out.println(customerV.showVIPInfo());

    }
}
