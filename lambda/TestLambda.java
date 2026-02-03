package lambda;


interface PrintString{
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s); // 람다식을 변수에 대입
        lambdaStr.showString("Hello.");
        showMyString(lambdaStr); // 람다식을 매개변수로 전달
        PrintString reStr = returnString();
        reStr.showString("Hi. ");
    }
    public static void showMyString(PrintString p) {
        p.showString("It's me.");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "Awesome"); // 람다식을 반환값으로 사용
    }
}
