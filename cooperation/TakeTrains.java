package cooperation;
// 테스트 프로그램: 학생이 버스나 지하철을 타고 학교에 가는 것을 구현한 프로그램
public class TakeTrains {
    public static void main(String[] args) {
        // 학생 인스턴스 생성: Student(학생 이름, 가진 돈) 클래스 사용
        Student studentKim = new Student("김아무개", 5000);
        Student studentV = new Student("뷔구룽", 10000);
        Student studentKang = new Student("강철", 8000);

        // 노선 번호가 202번인 버스 생성
        Bus bus202 = new Bus(202);
        studentKim.takeBus(bus202); // 김아무개 학생이 202번 버스 탑승
        studentKang.takeBus(bus202); // 강철 학생도 부랴부랴 202번 버스 탑승
        studentKim.showInfo(); // 김아무개 학생의 정보 출력
        studentKang.showInfo(); // 강철 학생 정보 출력
        bus202.showInfo(); // 버스 정보 출력

        // 노선 번호가 대전1호선인 지하철 생성
        Subway subwayDaejeon = new Subway("대전1호선");
        studentV.takeSubway(subwayDaejeon); // 뷔구룽 학생이 1호선 지하철 탑승
        studentV.showInfo(); // 뷔구룽 학생 정보 출력
        subwayDaejeon.showInfo(); // 지하철 정보 출력
    }
}
