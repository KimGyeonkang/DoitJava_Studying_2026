package cooperation;
// 지하철 클래스(버스 클래스와 흐름 유사)
public class Subway {
    // 필요한 요소: 지하철 노선 번호, 승객 수, 수입
    String subwayNumber;
    int passengerCount;
    int money;

    // 지하철이 생성될 때 노선 번호 초기화
    public Subway(String subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    // 승객 한 명이 탔을 때 수입 변화 메서드(매개변수는 탑승 요금)
    public void take(int money) {
        this.money += money; // 승객이 탑승할 때마다 요금을 수입에 더하기
        passengerCount++; // 승갹 슈 증가
    }

    // 출력: 현재 지하철 노선 번호와 승객 수, 수입
    public void showInfo() {
        System.out.println("현재 조회 중인 지하철 노선 번호: " + subwayNumber
                            + ",  현재 승객 수: " + passengerCount
                            + ", 현재 수입: " + money);
    }
}
