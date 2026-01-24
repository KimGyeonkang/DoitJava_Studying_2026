package interfaceex;
// ComplateCalc 클래스 테스트배 보기: 계산기 프로그램
public class CalculatorTest {
    public static void main(String[] args) {
        // 계산할 값 변수로 선언
        int num1 = 10;
        int num2 = 0;

        // CompleteCalc 인스턴스 생성
        // Calc 인터페이스(추상 메서드만 가짐)나 Calculator 클래스(추상 클래스)로는 인스턴스를 생성할 수 없음.
        CompleteCalc calc = new CompleteCalc();
        // 결괏값 출력
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println( );
        calc.showInfo(); // CompleteCalc 클래스에서 추가로 구현한 메서드 호출
        calc.description();; // 인터페이스의 디폴트 메서드 호출

        // 인터페이스의 정적 메서드 호출(모든 배열 요소의 합)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
