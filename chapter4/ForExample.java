package chapter4;
// for문은 초기화, 조건 비교, 증감을 한 줄로 확인할 수 있어 비교적 가독성이 좋은 반복문 260106
public class ForExample {
    public static void main(String[] args){ // start
        int i; // 반복 횟수
        int sum; // 합계

        for (i = 1, sum = 0; i <= 10; i++){ // for(초기화식; 조건식; 증감식){}
           sum += i; // 주의!: sum += sum + i(반복 횟수)

        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다."); // 합계 출력
    }
}
