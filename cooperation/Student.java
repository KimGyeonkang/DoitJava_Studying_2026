package cooperation;
// 학생이 버스나 지하철을 타고 학교에 가는 것을 구현한 프로그램
public class Student {
    // 학생 정보
    public String studentName; // 학생 이름
    public int grade; // 학년
    public int money; // 학생이 가진 돈

    // 학생 클래스 생성: 학생 이름과 가진 돈을 매개변수로 받는 생성자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }
    // 경우 1: 학생이 버스를 타면 1000원을 내는 기능을 메서드로 구현
    // 별도의 버스 메서드 필요
    public void takeBus(Bus bus) {
        bus.take(1000); // 버스 클래스의 take() 메서드 사용: 버스 수입 증가
        this.money -= 1000; // (버스를 타면)가진 돈 = 가진 돈 - 1000
    }
    // 경우 2: 학생이 지하철을 타면 1500원을 내는 기능을 메서드로 구현
    // 별도의 지하철 메서드 필요
    public void takeSubway(Subway subway) {
        subway.take(1500); // 지하철 클래스의 take() 메서드 사용: 지하철 수입 증가
        this.money -= 1500; // (지하철을 타면)가진 돈 = 가진 돈 - 1500
    }
    // 출력: 현재 학생의 남은 돈은 엏마?
    public void showInfo() {
        System.out.println("학생: " + studentName + ", 남은 돈: "
        + money + "원");
    }
}
