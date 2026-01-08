package chapter4;
/* 반복문에서 continue문 사용 260106*/
public class ContinueExample {
    public static void main(String[] args){ // start
        int total = 0; // 합계 변수
        int num; // 더하는 값 변수

        for (num = 1; num <= 100; num++){ // 100까지 반복
            if (num % 2 == 0) // 만약 if가 짝수이면?
                continue; // 다음 문장을 수행하지 않고 num++
            total += num; // num이 홀수면 수행

        }
        System.out.println(total); // 1부터 100까지의 홀수의 합
    }
}
