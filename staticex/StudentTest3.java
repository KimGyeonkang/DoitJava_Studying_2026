package staticex;
// static 변수: 인스턴스가 생성되지 않아도 사용할 수 있기에
// 클래스 이름으로 직접 참조할 수 있다!
public class StudentTest3 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이아무개");
        System.out.println(Student1.serialNum); // 클래스 이름으로 serialNum 변수를 직접 참조
        // 이아무개 학생의 이름과 학번 출력
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student1 studentV = new Student1();
        studentV.setStudentName("뷔구룽");
        // 뷔구룽 학생의 이름과 학번 출력
        System.out.println(Student1.serialNum); // 클래스 이름으로 serialNum 변수를 직접 참조
        System.out.println(studentV.studentName + " 학번: " + studentV.studentID);
    }
}
