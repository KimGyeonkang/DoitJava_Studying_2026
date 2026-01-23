package interfaceex;
// 계산기 인터페이스의 모든 추상 클래스를 구현해 완성된 클래스로 만들기
public class CompleteCalc extends Calculator {
    // Calculator 클래스를 상속받아, 나머지 추상 클래스 구현
    // 곱하기 함수
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }
    // 나누기 함수
    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) // num2 값이 0이 아니면
            return num1 / num2; // 나누기
        else // num2 값이 0이면
            System.out.println("오류 발생: 나눌 수 없음"); // 오류 메시지 출력 기능 추가
            return Calc.ERROR; // 오류 반환
    }
    // 해당 클래스에서 추가로 구현한 메서드
    public void showInfo() {
        System.out.println("Calc 인터페이스 구현");
    }
}
