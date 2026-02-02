package innerclass;

// 외부 클래스 정의
class OutClass {
    private int num = 10; // 외부 클래스의 private 변수
    private static int sNum = 20; // 외부 클래스의 정적 변수

    private InClass inclass; // 내부 클래스형 변수 먼저 선언

    public OutClass() {
        inclass = new InClass(); // 외부 클래스 생성 후 내부 클래스(인스턴스) 생성 가능
    }
    // 외부 클래스 안에 내부 클래스 정의
    class InClass { // 인스턴스 내부 클래스
        int inNum = 100; // 내부 클래스의 인스턴스 변수
        static int sInNum = 200; // 인스턴스 내부 클래스의 정적 변수

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(인스턴스 내부 클래스의 정적 변수)");
        }

        static void sTest() { // 인ㅅ턴스 내부 클래스의 정적 메서드
            System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
        }

        }
    public void usingClass() {
        inclass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
        System.out.println("인스턴스 내부 클래스 정적 변수 직접 호출(sInNum) = " + OutClass.InClass.sInNum);
        OutClass.InClass.sTest(); // 인스턴스 내부 클래스의 정적 메서드 호출
    }
}
