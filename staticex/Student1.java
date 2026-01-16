package staticex;
// static 변수: 새로 생성된 학생에게 학번을 자동으로 부여할 순 없을까?
public class Student1 {
    // 먼저, 학번 기본값을 선언하되
    // 새로운 학생 인스턴스가 생성될 때마다 1씩 증가하도록 해라!
    public static int serialNum = 20260000; // 기준으로 할 학번 초깃값을 먼저 선언
    // 이 값이 1씩 증가하며 학생마다 새로운 학번을 부여할 것
    public int studentID; // 학번
    public String studentName; // 이름
    public int grade; // 학년
    public String address; // 주소

    //* 추가: 새로운 학생 인스턴스가 생성될 때마다
    // 증가된 학번을 새로 부여하는 메소드(생성자)를 구현
    public Student1() {
        serialNum++; // 학생 생성될 때마다 기본값 증가
        studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 대입
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
