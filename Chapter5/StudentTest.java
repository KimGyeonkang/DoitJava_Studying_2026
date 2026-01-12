package Chapter5;
// 외부 테스트용 클래스에 main() 구현하기
public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안승연"; // 클래스의 멤버 변수에 값 대입

        System.out.println(studentAhn.studentName); // 클래스의 멤버 변수 출력
        System.out.println(studentAhn.getStudentName()); // 같은 클래스 내 메서드 호출
        // 만일 사용할 클래스가 다른 패키지에 있다면, import문으로 해당 클래스를 불러와야 함.



        Student1 studentLee = new Student1(1001, "Lee");
        // Cannot find symbol 문제 해결. 방법은 Student1 클래스 내에 주석 달아둠.

        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 50);

        Student1 studentKim = new Student1(1002, "Kim");

        studentKim.setKoreanSubject("국어", 70);
        studentKim.setMathSubject("수학", 85);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();


        Student studentLee = new Student();
        //studentLee.studentName = "이상원";
        studentLee.setStudentName("이상원");
        // variable studentLee is already defined in method main(java.lang.String[]) 오류
        // 한 변수를 두 번 이상 선언했을 때 발생.

        System.out.println(studentLee.getStudentName());
    }
}
