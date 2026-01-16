package staticex;
// static 변수의 get(), set()를 활용해 학번 출력
public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이아무개");
        System.out.println(Student2.getSerialNum()); // Student2 클래스를 직접 참조해 get() 호출
        // 이아무개 학생의 이름과 학번 출력
        System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);

        Student2 studentV = new Student2();
        studentV.setStudentName("뷔구룽");
        // 뷔구룽 학생의 이름과 학번 출력
        System.out.println(Student2.getSerialNum()); // Student2 클래스를 직접 참조해 get() 호출
        System.out.println(studentV.studentName + " 학번: " + studentV.studentID);
    }
}
