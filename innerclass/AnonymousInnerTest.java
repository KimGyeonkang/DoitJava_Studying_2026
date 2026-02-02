package innerclass;

class Outer2 {
    Runnable getRunnable(int i) {
        int num = 100;
        // 익명 내부 클래스를 통해 Runnable 인터페이스 생성
        // MyRunnable 클래스 이름을 빼고 클래스 바로 생성
        return new Runnable() {
            @Override
            public void run() {
                // 지역 변수와 매개변수 i는 상수화되므로 다른 값으로 초기화(변경) 불가
                System.out.println(i);
                System.out.println(num);
            }
        }; // 클래스 뒤에 ;
    }
    // 익명 내부 클래스를 변수에 대입
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    }; // 클래스 뒤에 ;
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runnable = out.getRunnable(10);
        runnable.run(); // getRunnable()의 반환값 Runnable() 객체의 메서드 호출(8~15행)
        System.out.println( );
        out.runner.run(); // 외부 클래스 변수에 대입된 Runnable() 객테의 메서드 호출 (18~23행)
    }
}
