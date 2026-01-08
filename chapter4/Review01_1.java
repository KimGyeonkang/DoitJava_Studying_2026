package chapter4;

import java.util.Scanner;
// 250106 사칙연산 프로그램: 사용자에게 사칙연산 기호를 입력받아 결괏값 출력.
public class Review01_1 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;
        int result;

        Scanner scanner = new Scanner(System.in); //Java에서는 scanner로 문자(char 자료형)를 직접 입력받을 수 없다.
        System.out.print("사칙연산 기호를 입력하세요 : ");
        char operator = scanner.next().charAt(0); // next()로 문자열을 입력받은 뒤, charAt(0)으로 문자열의 첫 문자를 꺼내옴.
        /* Java에서 한 문자를 입력받는 코드
         * 참고: https://cha-coding.tistory.com/entry/Java-char%ED%98%95-%EC%9E%85%EB%A0%A5%ED%95%98%EA%B8%B0 (Last entering: 250106)*/

        if (operator == '+'){
            result = num1 + num2;
            System.out.println(result);
        }
        else if (operator == '-'){
            result = num1 - num2;
            System.out.println(result);
        }
        else if (operator == '*'){
            result = num1 * num2;
            System.out.println(result);
        }
        else if (operator == '/'){
            result = num1 / num2;
            System.out.println(result);
        }
        else {
            System.out.println("올바른 문자를 입력해주세요.");
        }
    }
}
