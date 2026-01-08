package chapter4;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("팩토리얼 계산할 숫자를 입력하세요 : ");
        int n = scanner.nextInt(); // 입력받은 정수를 n에 저장

        int fac = 1; // factorial(팩토리얼) 값, 초기값은 1(초기값을 0으로 하면, for문 실행 결과가 전부 0이 되는 오류 발생)

        for (int i = 1; i <= n ; i++){
            fac *= 1 + (i - 1); // 2! = 1 + (2 - 1), 3! = 1 + (2 - 1) + (3 - 1), ...
            // *n! : 1 * 2 * 3 * ... * n = 1*(1+1)*(1+2)* ... *(1+(n-1))
        }

        System.out.println(n + "팩토리얼은 " + fac + "입니다.");
    }
}
