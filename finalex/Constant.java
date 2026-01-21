package finalex;
// final 변수 이해하기: 상수
public class Constant {
    int num = 10;
    final int NUM = 100; // 상수 선언

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        // cons.NUM = 200; // 상수에 값을 대입하면 오류 발생

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
