package Chapter5;
// 참조값(생성된 인스턴스의 메모리 주솟값) 출력하기
public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "안연수";

        Student student2 = new Student();
        student2.studentName = "안승연";

        // 참조 변숫값(참조값) 출력
        System.out.println(student1); // Chapter5.Student@23fc625e(클래스 이름@주솟값)
        System.out.println(student2); // Chapter5.Student@3f99bd52
    }
}
