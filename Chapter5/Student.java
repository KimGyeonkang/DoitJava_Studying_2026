package Chapter5;

public class Student { // 접근 제어자, class 예약어, 클래스 이름
    int studentID; // 속성: 학번
    String studentName; // 속성: 학생 이른
    int grade; // 속성: 학년
    String address; // 속성: 사는 곳
    // 여기까지 멤버 변수

    // 학생 이름을 반환하는 메서드 구현
    public String getStudentName() { // 접근 제어자, 반환형(가져올 변수 값의 자료형과 같음), 메서드 이름
        return studentName;
    }

    // 학생 이름을 부여하는 메서드 구현
    public void setStudentName(String name) { // 접근 제어자, 반환형(반환할 값이 없으므로 void), 메서드 이름(매개변수)
        studentName = name;
    }

    // 학생의 이름과 주소를 출력하는 메서드 구현
    public void showStudentInfo() {
        System.out.println(studentName + "," + address); // 이름과 주소 출력
    }

    // main() 함수 추가
    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안연수"; // 클래스의 멤버 변수에 값 대입

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
