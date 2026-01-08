package chapter3;
/* 3장 되새김 문제 14번 20260105* ~(반전) 연산자 활용*/
public class Review14 {
    public static void main(String[] args){

        int num = 5; // 원래 값

        System.out.println("원래 값: " + num);
        System.out.println("비트를 반대로 뒤집은 값: " + ~num); // ~ Operator
        System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(num)); // num의 이진수(0B) 값을 출력
        System.out.println("이진수로 표현한 뒤집은 값: " + Integer.toBinaryString(~num)); // ~num의 이진수 값을 출력
    }
}
