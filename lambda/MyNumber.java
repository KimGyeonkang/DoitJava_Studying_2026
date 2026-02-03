package lambda;
// 함수형 인터페이스
@FunctionalInterface // 애너테이션
public interface MyNumber {
    int getMin(int num1, int num2); // 두 수 중 최솟값 호출 메서드(추상 메서드)
}