package Chapter5;
// 학생의 시험 성적 정보를 저장하는 프로그램
public class Student1 {
    int studentID; // 학번
    String studentName; // 학생 이름
    Subject2 korean; // 별도로 만든 클래스를 사용해 참조 자료형 변수 선언
    Subject2 math;

    public /*void*/ Student1(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        // (StudentTest 클래스 내)Student1 studentLee = new Student1(1001, "Lee");에서 Cannot find symbol 오류 발생.
        // 해결방법: 위의 void를 지우니 정상적으로 StudentTest의 결괏값이 출력됨.
        // 내가 생각한 원인: 값을 반환해야 하는 메서드에 void 반환형을 사용해서, 대입된 값이 정산적으로 호출되지 못한 것 같음.

        korean = new Subject2();
        math = new Subject2();
        // 변수 korean과 math의 인스턴스를 생성
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korean.getSubjectName() + " 과목 점수는 "
            + korean.getScorePoint() + "점이며 " + math.getSubjectName() + " 과목의 점수는 "
            +math.getScorePoint() + "점입니다.");
        // 학생 정보(과목명, 성적) 출력
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }

    public void setMathSubject(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
        // 매개 변수로 넘긴 값을 이룔해 Subject 메서드를 호출하고 값을 대입
    }
}
