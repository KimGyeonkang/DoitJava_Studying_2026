package chapter4;

import java.util.Scanner;
/* 250106 사칙연산 프로그램: 사용자에게 사칙연산 기호를 입력받아 결괏값 출력. */
public class Review01 {
    public static void main(String[] args){ // start
        int num1 = 10;
        int num2 = 2;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = scanner.next().charAt(0);
        /* Java에서 한 문자를 입력받는 코드
        * 참고: https://cha-coding.tistory.com/entry/Java-char%ED%98%95-%EC%9E%85%EB%A0%A5%ED%95%98%EA%B8%B0 (Last entering: 250106)*/

        switch (operator){
            case '+' -> {
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");
            }
            case '/' -> {
                result = num1 / num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result + " 입니다.");
            }
            default -> System.out.println("올바른 문자를 입력해주세요.");
        }
    }
}
