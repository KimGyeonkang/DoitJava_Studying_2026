package collectionframework.question;

public class Student {
    String studentId;
    String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentId); // parseInt(매개변수): 문자열 타입의 숫자를 정수로 변환
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (this.studentId == student.studentId) {
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return studentId + ":" + studentName;
    }
}
