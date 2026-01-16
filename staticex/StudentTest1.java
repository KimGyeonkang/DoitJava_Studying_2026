package staticex;
// static 변수 테스트
public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이아무개");
        System.out.println(studentLee.serialNum); // static 변수의 초깃값(20160000)
        studentLee.serialNum++; // static 변숫값 증가

        Student studentV = new Student();
        studentV.setStudentName("뷔구룽");
        // 증가한 학번 값 출력
        System.out.println(studentLee.serialNum);
        System.out.println(studentV.serialNum);
    }
}
