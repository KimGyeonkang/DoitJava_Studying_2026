package inheritance;

public class Customer {
    // 고객 클래스의 속성(인스턴스 변수)
    // protected: 일반적으로는 private 기능, 상속받는 하위 클래스에 한해 public(접근 가능)
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint; // 보너스 포인트
    double bonusRatio; // 포인트 적립 비율

    // 고객 아이디와 이름을 반드시 지정하기 위해
    // 매개변수가 있는 생성자를 직접 만들어 보았다.
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        // System.out.println("Customer(int, String) 생성자 호출");
    }

    // 고객의 속성 기본값(고객 등급, 보너스 포인트 적립 비율)을 디폴트 생성자로 정의
    /* public Customer() {
        customerGrade = "SILVER"; // 기본 고객 등급
        bonusRatio = 0.01; // 기본 적립 비율
        System.out.println("Customer() 생성자 호출"); // "생성자를 호출했다"는 메시지
    } */
    // 보너스 포인트 적립, 지불 가격을 계산하는 메서드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }
    // 고객 정보를 반환해 출력하는 메서드(고객명, 고객 등급, 보유 보너스 포인트)
    public String showCustomerInfo() {
        return customerName + " 님의 고객 등급: " + customerGrade +
                " 보너스 포인트: " + bonusPoint;
    }
    // 여기부터는 protected 예약어로 선언한 변수를
    // 외부에서 사용할 수 있도록 하는 메서드 추가(private 변수와 유사)

    // 고객 아이디 관련
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    // 고객 이름
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    // 고객 등급
    public String getCustomerGrade() {
        return customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
