package object;

class Student{
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    // toString() 메서드 재정의
    public String toString() {
        return studentID + "," + studentName;
    }
    // equals() 메서드 재정의
    @Override
    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student std = (Student)object;
            if (this.studentID == std.studentID)
                return true; // 학생의 학번이 같으면 true 반환
            else return false;
        }
        return false;
    }
    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return studentID; // 해시 코드값으로 학번 반환
    }
}

// Object 클래스의 equals() 메서드 사용 예시
public class EqualsTest {
    public static void main(String[] args) {
        Student studentV = new Student(100, "뷔구룽");
        Student studentV2 = studentV; // 주소 복사
        Student studentRoong = new Student(100, "뷔구룽");
        // 인스턴스 주소가 같으면서, 데이터 값이 같을 경우
        if (studentV == studentV2) // == 기호로 값 비교(물리적 동일성)
            System.out.println("주솟값 동일: studentV, studentV2");
        else
            System.out.println("주솟값 상이: studentV, studentV2");

        if (studentV.equals(studentV2)) // equals() 메서드로 값 비교(논리적 동일성)
            System.out.println("동일: studentV, studentV2");
        else
            System.out.println("서로 다름: studentV, studentV2");
        // 인스턴스의 주소는 다르지만 데이터 값이 같을 경우
        if (studentV == studentRoong)
            System.out.println("주솟값 동일: studentV, studentRoong");
        else
            System.out.println("주솟값 상이: studentV, studentRoong");

        if (studentV.equals(studentRoong))
            System.out.println("동일: studentV, studentRoong");
        else
            System.out.println("서로 다름: studentV, studentRoong");

        System.out.println("StudentV의 hashCode: " + studentV.hashCode());
        System.out.println("StudentRoong의 hashCode: " + studentRoong.hashCode());
        // 아래는 각 인스턴스의 실제 주솟값 출력하는 메서드 사용
        System.out.println("StudentV의 실제 주솟값: " + System.identityHashCode(studentV));
        System.out.println("StudentRoong의 실제 주솟값: " + System.identityHashCode(studentRoong));
    }
}
