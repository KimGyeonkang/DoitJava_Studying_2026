package innerclass;

// 외부 클래스 정의
class OutClass2 {
    private int num = 10; // 외부 클래스의 private 변수
    private static int sNum = 20; // 외부 클래스의 정적 변수

    static class InStaticClass { // 정적 내부 클래스
        int inNum = 100; // 정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200; // 정적 내부 클래스의 정적 변수
        // 정적 내부 클래스의 일반 메서드
        void inTest() {
            // 외부 클래스의 인스턴스 변수 사용 불가
            System.out.println("InStaticClass innum = " + inNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
            System.out.println("OutClass sInNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
        // 정적 내부 클래스의 정적 메서드
        static void sTest() {// 외부 클래스와 내부 클래스의 인스턴스 변수 사용 불가
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
        }
    }
}

public class InnerStaticTest {
    public static void main(String[] args) {

        OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass(); // 외부 클래스 생성과 무관하게 정적 내부 클래스 생성 가능
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println( );
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClass2.InStaticClass.sTest();
    }
}
