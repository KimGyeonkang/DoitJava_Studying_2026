package innerclass;

class Outer {
    int outNum = 100; // 외부 클래스의 인스턴스 변수
    static int sNum = 200; // 외부 클래스의 정적 변수
    // Runnable 인터페이스: 스레드(CPU에서 실행되는 작업 단위) 만들 때 사용
    Runnable getRunnable(int i) {
        int num = 100; // 지역 변수
        // 지역 내부 클래스
        class MyRunnable implements Runnable {
            int localNum = 10; // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                // num = 200; 지역 변수는 상수로 바뀌므로 값을 변경할 수 없음.
                // i = 100; 매개변수도 상수로 바뀌므로 값을 변경할 수 없음.
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable(); // getRunnable() 메서드는, 반드시 Runnable 자료형 객체(MyRunnable 클래스)를 생성하고 반환
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
