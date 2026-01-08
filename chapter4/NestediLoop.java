package chapter4;
/* 중첩 반복문: 구구단 출력하기 260106*/
public class NestediLoop { // 코딩에서는 항상 오탈자에 유의하자! 사소한 실수 하나로 큰 사고가 날 수 있다.
    public static void main(String[] args){
        int dan; // 단
        int times; // 곱하는 수

        for (dan = 2; dan <= 9; dan++){ //외부 for문: (구구단) 2~9단
            for (times = 1; times <= 9; times++){ // 내부 for문: 1~9까지 곱하기
                System.out.println(dan + "X" + times + "=" + dan * times); // 결괏값 출력
            }
            System.out.println( ); // 한 줄 공백 만들기
        }

        /* for (dan = 2; dan <= 9; dan++){
            for (times = 1; times <= 9  && times <= dan; times++){ // 조건식에 조건 추가(곱하는 수가 단보다 작거나 같을 경우)
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println( );
        }
        04장 되새김 문제 3번: 위 코드처럼 바꾸면, 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력핳 수 있음.

        for (dan = 2; dan <= 9; dan++){
            for (times = 1; ; times++){
                if (times > dan) // 곱하는 수가 단보다 클 경우
                    break; // 다음 문장을 수행하지 않음.
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println( );
        }
        혹은, 문제 조건대로 break문을 사용한다면 위 코드와 같이...*/
    }
}

/* 구조 파악이 어려운 편이므로 주의해서 차분하게 해석해보기 */
