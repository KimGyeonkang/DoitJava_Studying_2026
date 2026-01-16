package staticex;
// 학번이 자동으로 부여되었는지 테스트
public class StudentTest2 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이아무개");
        System.out.println(studentLee.serialNum); // static 변수의 초깃값(20160001)
        // 이아무개 학생의 이름과 학번 출력
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student1 studentV = new Student1();
        studentV.setStudentName("뷔구룽");
        // 뷔구룽 학생의 이름과 학번 출력
        System.out.println(studentV.serialNum);
        System.out.println(studentV.studentName + " 학번: " + studentV.studentID);
    }
}
