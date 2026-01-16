package cooperation;
// 버스 클래스
public class Bus {
    // 필요한 속성: 버스 번호, 승객 수, 수입
    int busNumber;
    int passengerCount;
    int money;

    // 버스 번호를 매개변수로 받는 생성자: 버스가 생성될 때 버스 번호를 초기화
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객 한 명이 버스에 탄 경우를 메서드로 구현(매개변수는 탑승 요금)
    public void take(int money) {
        this.money += money; // 버스는 승객이 타면 돈을 번다.
        passengerCount++; // 승객 수 증가 표현
    }

    // 출력: 현재 버스 번호와 탑승 승객 수, 수입은?
    public void showInfo() {
        System.out.println("현재 조회 중인 버스 번호: " + busNumber
                            + ", 현재 승객 수: " + passengerCount
                            + ", 현재 수입: " + money);
    }
}
