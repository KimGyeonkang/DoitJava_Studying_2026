package chapter4;
/* do~while문 활용, 1에서 10까지 합을 출력하는 프로그램 260106*/
public class DoWhileExample {
    public static void main(String[] args){ //start
        int num = 1;
        int sum = 0; // 두 변수는 반드시 먼저 초기화를 해야 함!

        do {
            sum += num;
            num++; // do~while문 : 먼저 중괄호 안의 문장을 한 변 수행한 뒤 조건식 검사
        }
        while(num < 11); // or num <= 10

        System.out.println("1부터 10까지의 합은" + sum + "입니다."); // 합계 출력
    }
} // 종료
