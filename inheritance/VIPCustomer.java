package inheritance;
// VIP 고객 = 일반 고객 혜택 + 추가 혜택
// 상속을 활용해 코드를 간결화하면서 기능 추가

// 해당 클래스는 Customer 클래스를 상속받겠다!
public class VIPCustomer extends Customer {
    // VIP 고객에게만 해당되는 속성(인스턴스 변수)
    private int agentID; // VIP 고객 전용 상담원 아이디
    double saleRatio;
    // 메서드 오버라이드: 상위 클래스의 메서드를 하위 클래스에서 재정의
    @Override // "오버라이드(재정의)된 메서드"을 의미하는 애너테이션
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; // 보너스 포인트 적립
        return price - (int) (price * saleRatio); // 할인 적용한 가격 값 반환
    }
    // 아래처럼 인텔리제이(IDE)의 오버라이드 메서드 기능을 활용해 재정의도 가능
    /*
    @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    } */

    // 기존 Customer 클래스에 명시적인 생성자를 선언했다면
    // 상속받는 VIP 클래스에서도 매개변수를 직접 지정하는 명시적인 생성자가 필요하다.
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // 상위 클래스의 Customer() 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1; // VIP는 상시 할인을 받는다.
        this.agentID = agentID; // VIP는 전용 상담원이 배정됨.
        // System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }
    // VIP 고객 속성 기본값을 정의하는 디폴트 생성자
    /* public VIPCustomer() {
        customerGrade = "VIP"; // 고객 등급
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출"); // "생성자를 호출했다"는 메시지
    } */
    // 전용 상담원 아이디를 얻는 메서드
    public int getAgentID() {
        return agentID;
    }

    // 고객 정보를 반환해 출력하는 메서드(고객명, 고객 등급, 보유 보너스 포인트)
    // super.showCustomerInfo(): 상위 클래스의 shouCustomerInfo() 메서드를 참조
    // (super 예약어)상위 클래스에 선언한 인스턴스 변수나 메서드는 하위 클래스에서도 참조할 수 있다.
    public String showVIPInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는: "
                + agentID;
    }
}
