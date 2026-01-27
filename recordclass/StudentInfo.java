package recordclass;
// record 클래스 사용: 변하지 않는 학생 정보 정의
public record StudentInfo(int id, String name) { // 클래스 이름 뒤에 곧바로 매개변수(필드) 선언
    // record 내에 equals() 메서드 추가 구현
    public boolean equals(Object obj) {
        if (obj instanceof StudentInfo std) {
            return this.id == std.id; // id만 같아도 true 반환
        }
        else return false;
    }

    /*
    // record 클래스 내의 필드는 한 번 정해지면 값이 변할 수 없으므로(private final)
    // setName() 처럼 값을 변경시키는 메서드를 구현할 수 없음.
    public void setName(String name) {
        this.name = name; // 오류 발생
    }
    */

    // static 변수를 사용해 추가 변수 선언 가능
    public static String SCHOOL_NAME = "UNIVERSITY";

    public static void main(String[] args) {

        StudentInfo studentInfo = new StudentInfo(10002, "김견강");
        StudentInfo studentInfo2 = new StudentInfo(10002, "김아무개");

        System.out.println(studentInfo.equals(studentInfo2)); // 두 인스턴스의 필드값 비교
        System.out.println(studentInfo.name()); // name 변수의 필드값을 가져오는 메서드
        System.out.println(studentInfo); // Student 클래스에서 재정의한 toString() 메서드에 따라 호출
        // 출력 예시: StudentInfo[id=10002, name=김견강]
    }
}
