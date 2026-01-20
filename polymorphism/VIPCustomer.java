package polymorphism;
// 다형성을 활용한 고객 관리 프로그램(2): VIP 고객
public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // super: 상위 메서드의 생성자를 받아 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    // 고객의 지불 가격(, 보너스 포인트) 메서드를 재정의(오버라이드; 매개변수는 상품 정가)
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio); // 할인된 가격 반환
        // 형 변환을 하지 않으면 계산된 값의 자료형(double)과 메서드의 반환형(int)이 달라 오류 발생.
    }
    // 고객 정보 출력 메서드 재정의(오버라이드)
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 아이디: " + agentID;
        // super: 상위 클래스의 메서드를 받아 호출
    }
    // VIP 전용 상담원 아이디 값을 받는 메서드
    public int getAgentID() {
        return agentID;
    }
}
