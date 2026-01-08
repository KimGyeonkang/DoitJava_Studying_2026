package chapter4;

public class Q14 {
    public static void main(String[] args){
        int dan; // 단수
        int times; // 곱하는 수


        for (dan = 3; dan <= 7; dan++){ // 단수(3~7)
            for (times = 1; times <= 9; times++){ // 곱하는 수(1~9)
                System.out.println(dan + "*" + times + "=" + dan * times); // 결과 출력
            }
            System.out.println( ); // 개행(엔터)
        }
    }
}
