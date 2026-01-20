package witharraylist;
// 다형성을 활용한 고객 관리 프로그램(1): 일반 고객
public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    // 디폴트 생성자: 초기화된 고객 등급과 보너스 적립률 호출
    public Customer() {
        initCustomer();
    }
    // 고객 아이디와 이름을 매개변수로 하는 생성자
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer(); // 고객 등급과 보너스 적립률 호출
    }
    // 고객 정보(등급, 포인트 적립 비율) 초기화 인스턴스 변수
    private void initCustomer() {
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }
    // 고객별 지불 가격(, 보너스 포인트)을 계산해 반환받는 메서드(매개변수는 상품의 정가)
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    // 고객 정보 출력 메서드(이름, 등급, 보너스 포인트)
    public String showCustomerInfo() {
        return customerName + " 님의 등급: " + customerGrade + ", 보유한 보너스 포인트: " + bonusPoint;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
