package chapter2;
/* 교재 56쪽, 부동 소수점 방식에 오차...(2026/01/02) */
public class DoubleEx2 {
    public static void main(String[] args){
        double dnum = 1;

        for (int i = 0; i < 10000; i++){
            dnum = dnum + 0.1;
            /* for문은 반복문. 지정 문장을 정해진 횟수만큼 반복. 여기에서는 더하기를 10000번 반복하라는 의미. */
        }
        System.out.println(dnum);
    }
}
