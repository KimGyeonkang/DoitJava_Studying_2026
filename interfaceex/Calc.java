package interfaceex;
// 인터페이스는 어떻게 만들까? : 계산기 인터페이스 예제
public interface Calc {
    // 인터페이스는 추상 메서드와 상수로만 구성.
    // 인터페이스 내부에 선언한 변수는 public static final 예약어를 사용하지 않아도
    // 컴파일 과정에서 상수로 변환됨.
    double PI = 3.14; // 원주율
    int ERROR = -999999999; // 에러 발생 시 출력할 값
    // 인터페이스 내부에 선언한 메서드는 public abstract를 사용하지 않아도
    // 컴파일 과정에서 추상 메서드로 변환됨.
    int add(int num1, int num2); // 더하기
    int substract(int num1, int num2); // 빼기
    int times(int num1, int num2); // 곱하기
    int divide(int num1, int num2); // 나누기

    // 인터페이스의 디폴트 메서드
    default void description() {
        System.out.println("정수 계산기 구현");
        myMethod(); // 아래 private 메서드
    }

    // 인터페이스의 정적 메서드
    static int total(int[] arr) { // 매개변수로 전달된 배열의 모든 요솟값을 더하기
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        myStaticMethod(); // 아래 private static 메서드
        return total;
    }

    // 여기부터 private 메서드
    private void myMethod() {
        System.out.println("private 메서드 호출");
    }
    // private static 메서드: 정적 메서드에 호출해 사용
    private static void myStaticMethod() {
        System.out.println("private static 메서드 호출(정적 메서드 안에)");
    }
}
