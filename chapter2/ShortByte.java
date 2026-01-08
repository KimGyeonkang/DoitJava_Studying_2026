package chapter2;
/* 정수 자료형 연습(2026/01/02) */
public class ShortByte {
    public static void main(String[] args){
        short sVal=10; // short형은 2바이트로 정수 표현, 선언과 동시에 초기화
        byte bVal=20; // byte형은 1바이트로 정수 표현, 선언과 동시에 초기화
        /* 기본적으로는 int형(4바이트)으로 변횐돼 처리됨. cf)long형(8바이트) */
        System.out.println(sVal+bVal);
    }
}
