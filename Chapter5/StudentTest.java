package Chapter5;
// 외부 테스트용 클래스에 main() 구현하기
public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안승연"; // 클래스의 멤버 변수에 값 대입

        System.out.println(studentAhn.studentName); // 클래스의 멤버 변수 출력
        System.out.println(studentAhn.getStudentName()); // 같은 클래스 내 메서드 호출
        // 만일 사용할 클래스가 다른 패키지에 있다면, import문으로 해당 클래스를 불러와야 함.
    }
}
