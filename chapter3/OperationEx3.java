package chapter3;
/* 단락 회로 평가: 논리 연산(And, Or)에서 두 항을 모두 실행하지 않아도 결괏값을 알 수 있을 때, 나머지 항은 실행하지 않는 것. 2026.01.03.*/
public class OperationEx3 {
    public static void main(String[] args){
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // boolean: 논리 자료형 선언에 사용.
        // 어차피 앞(좌항)이 거짓이므로 뒷문장(우항)을 굳이 실행하지 않아도 value는 거짓.
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 이미 위에서 boolean형으로 제시되었으므로 여기서는 자료형 생략.
        // 어차피 앞(좌항)이 참이므로 뒤(우항)을 굳이 실행하지 않아도 value는 참.
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

    }
}
