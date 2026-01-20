package inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        // Customer형 인스턴스 생성(일반 고객)
        Customer customerAioi = new Customer(10001, "아이오이 유코");
        System.out.println(customerAioi.getCustomerName() + " , " +
                customerAioi.calcPrice(price));

        // VIPCustomer형 인스턴스 생성(VIP)
        VIPCustomer customerNaganohara = new VIPCustomer(10002, "나가노하라 마오", 2000);
        System.out.println(customerNaganohara.getCustomerName() + " , " +
                customerNaganohara.calcPrice(price));

        // VIPCustomer 인스턴스 -> Customer형으로 변환(VIP)
        Customer vc = new VIPCustomer(10003, "미나카미 마이", 3000);
        System.out.println(vc.getCustomerName() + " , " +
                vc.calcPrice(price));
        // 가상 메서드 기술: 상위 클래스와, 상속받은 하위 클래스에 같은 이름의 메서드가 있을 때
        // 선언한 클래스형이 아닌 생성된 인스턴스의 메서드가 호출됨.
    }
}
