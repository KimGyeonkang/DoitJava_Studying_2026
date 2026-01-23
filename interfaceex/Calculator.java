package interfaceex;
// 인터페이스를 클래스에서 어떻게 구현할까? : 계산기 클래스
public abstract class Calculator implements Calc { // 계산기 클래스는 추상 클래스
    // Calc 인터페이스의 add()와 substract() 메서드만 구현(재정의)
    // 구현되지 않는 추상 메서드가 있으므로, 계산기 클래스는 추상 클래스
    // 더하기 메서드 구현
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    // 빼기 메서드 구현
    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
