package Chapter5;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20; // 매개변수

        int sum = add(num1, num2); // add() 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");
    }

    public static int add(int num1, int num2) { // add() 함수 구현
        int result = num1 + num2;
        return result; // 결괏값을 result에 반환
        // 함수 호출할 때 변수와 함수 구현할 때 매개변수는 서로 다른 변수이므로, 이름이 같아도 되고 달라도 됨!
    }
}
