package lambda;
// 람다식 구현 및 호출
public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x <= y) ? x : y; // 인터페이스형 변수를 선언하고 변수에 람다식 구현
        System.out.println(max.getMin(100, 300)); // 인터페이스형 변수로 메서드 호출
    }
}