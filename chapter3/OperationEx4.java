package chapter3;
/* 조건 연산자(A ? B : C) 2026.01.03.
* 조건식 A가 참이면 B 출력, 거짓이면 C 출력 */
public class OperationEx4 {
    public static void main(String[] args){
        int fatherAge = 60;
        int motherAge = 53;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch);

        fatherAge = 45;
        motherAge = 47;

        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch);
    }
}
