package chapter4;
// 260106 구구단 짝수 단만 출력하기
public class Review02 {
    public static void main(String[] args){
        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++){ //외부 for문: (구구단) 2~9단
            if (dan % 2 != 0) // 짝수 단만 출력.
                continue; // dan이 홀수이면 다음 문장 수행하지 않음.
            for (times = 1; times <= 9; times++){ // 내부 for문: 1~9까지 곱하기
                System.out.println(dan + "X" + times + "=" + dan * times); // 결괏값 출력
            }
            System.out.println( ); // 한 줄 공백 만들기
        }
    }
}

/* 다른 방법: 외부 for문의 증감문을 dan += 2로 바꿔도 같은 결괏값 출력. */
