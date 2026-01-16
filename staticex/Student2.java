package staticex;
// static 변수를 위한 메서드(클래스 메서드)
// get(), set()
public class Student2 {
    // 먼저, 학번 기본값을 선언하되
    // 새로운 학생 인스턴스가 생성될 때마다 1씩 증가하도록 해라!
    private static int serialNum = 20260000; // public 대신 private 변수로 선언
    // 이 값이 1씩 증가하며 학생마다 새로운 학번을 부여할 것
    int studentID; // 학번
    String studentName; // 이름
    int grade; // 학년
    String address; // 주소

    //* 추가: 새로운 학생 인스턴스가 생성될 때마다
    // 증가된 학번을 새로 부여하는 메소드(생성자)를 구현
    public Student2() {
        serialNum++; // 학생 생성될 때마다 기본값 증가
        studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 대입
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
    // static 변수 serialNum의 get() 메서드
    public static int getSerialNum() {
        int i = 10; // 메서드 내부에서만 사용되는 지역 변수
        // studentName = "이아무개"; 클래스 메서드 내부에서는 인스턴스 변수 사용 불가, 왜?
        return serialNum; // serialNum은 static 변수: 클래스 매세드 내부에서도 사용 가능
    }
    // static 변수 serialNum의 set() 메서드
    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
