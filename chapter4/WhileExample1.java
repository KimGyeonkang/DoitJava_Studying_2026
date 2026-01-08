package chapter4;
/* 1에서 10까지 합을 출력하는 프로그램을 반복문으로 더 간단하게 만들어보기 250106*/
public class WhileExample1 {
    public static void main(String[] args){ // 시작
        int num = 1; // 더할 수를 대입할 변수 선언(1~10)
        int sum = 0; // 합계 결괏값을 대입할 변수 선언(1~10까지의 합)

        while(num < 11){ // or num <= 10
            sum += num; // sum = sum + num
            num++; // num은 1씩 커짐. 조건을 만족하는 동안 반복 수행.
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
