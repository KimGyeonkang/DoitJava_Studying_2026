package chapter2;
/* 상수(Constant): 변하지 않는 수, final 예약어 사용 2026.01.03*/
public class Constant {
    public static void main(String[] args){
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; // 변수나 상수는 초기화(선언)하지 않으면 오류가 발생하므로, 사용 전 반드시 초기화!

        System.out.println(MAX_NUM); // System.out.println(): 출력하면서 줄바꿈
        System.out.println(MIN_NUM);

        // MAX_NUM = 1000; 상수는 갑 변경을 할 수 없다. 이 코드 입력 시 오류
    }
}

// 상수를 사용하면 프로그램 내에서 반복적으로 사용하는 값을 미리 선언해, 추후 해당 상수 포함 코드(값) 수정이 용이함!
// 리터럴(litaral): 프로그램에서 사용하는 모든 숫자와 문자, 논리값 등. 변수나 상숫값 대입 가능.
