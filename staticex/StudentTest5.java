package staticex;
// 왜 인스턴스 변수는 클래스 메서드에서 사용 불가일까?
public class StudentTest5 {
    // 클래스 메서드와 클래스 변수는 인스턴스가 생성되지 않아도 언제든 사용할 수 있다.
    public static void main(String[] args) {
        System.out.println(Student2.getSerialNum());
    }
    // 반면 인스턴스 변수의 경우 인스턴스가 생성되어야만 메모리가 할당되어 사용할 수 있다.
    // 따라서 인스턴스 변수는 클래스 메서드에서 사용 불가다.
    // 참고: 박은종, 2025, Do it! 자바 프로그래밍 입문 [개정판], 200-201쪽.
}
