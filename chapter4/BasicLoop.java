package chapter4;
/* 일반적인 반복 연산 수행: 다만 매우 비효율적인... 260106*/
public class BasicLoop {
    public static void main(String[] args){
        int num = 1;
        num += 2; // num = num + 2
        num += 3; // num = num + 3
        num += 4; // 이하 유사
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;

        System.out.println("1부터 10까지의 합은 " + num + "입니다.");

        // 위와 같은 코드를 보다 효율적으로 작성하기 위해 사용하는 '반복문'!
    }
}
