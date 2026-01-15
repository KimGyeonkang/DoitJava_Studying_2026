package arraylist;

// 학생 정보 클래스와 과목 정보 클래스를 활용해 성적 출력 프로그햄 완성
public class StudentTest {
    public static void main(String[] args) {
        // 학생 1: 이아무개의 학생 정보 인스턴스를 만들고 수강 과목 정보 대입
        Student studentLee = new Student(1001, "이아무개");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        // 학생 2: 김아무개의 학생 정보 인스턴스를 만들고 수강 과목 정보 대입
        Student studentKim = new Student(1002, "김아무개");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        // 각 학생의 과목 정보와 총점 출력
        studentLee.showStudentInfo();
        System.out.println("=======================================");
        studentKim.showStudentInfo();
    }
}
