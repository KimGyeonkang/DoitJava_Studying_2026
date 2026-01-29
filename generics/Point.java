package generics;
// 제너릭 클래스 구현 예시: 복수의 메서드 매개변수를 자료형 매개변수로 사용
public class Point<T, V> { // 자료형 매개변수가 2개인 제너릭 클래스
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
    // 여기부터 자료형 매개변숫값를 반환하는 제너릭 메서드
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
