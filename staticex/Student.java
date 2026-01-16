package staticex;
// static 변수를 사용해보자!
public class Student {
    // 먼저, 학번 기본값을 선언하되
    // 새로운 학생 인스턴스가 생성될 때마다 1씩 증가하도록 해라!
    public static int serialNum = 20260000; // 기준으로 할 학번 초깃값을 먼저 선언
    // 이 값이 1씩 증가하며 학생마다 새로운 학번을 부여할 것
    public int studentID; // 학번
    public String studentName; // 이름
    public int grade; // 학년
    public String address; // 주소

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
