package chapter2;

public class VariablePractice2 {
    public static void main(String[] args){

        char gul = '\uae00'; // '글'의 유니코드 대입

        System.out.println(gul); // 문자형 그대로 출력
        System.out.println((int)gul); // 정수형으로 형 변환
        System.out.println((double)gul); // 실수형으로 형 변환
    }
}
