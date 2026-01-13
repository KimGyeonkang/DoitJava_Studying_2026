package chapter4;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(n + " ");
            }
            count = 0;
            }
        }
    }


