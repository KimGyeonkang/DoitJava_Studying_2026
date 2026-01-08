package chapter4;
/* 나이에 따라 다른 문장 출력하기 20260105
* 메인 함수(프로그램 시작)-> 변수 선언(나이)->조건) 나이가 8세보다 많거나 같다-> 조건이 참 - 결과 1) 학교에 다닙니다 출력
* 조건이 거짓 - 결과 2) 학교에 다니지 않습니다 출력-> 프로그램 종료*/
public class IfExample1 {
    public static void main(String[] args){
        int age = 7; // 뱐수 선언
        if (age >= 8){ // 조건:나이가 8세보다 많거나 같다, 조건이 참이면
            System.out.println("학교에 다닙니다.");
        }
        else { // 조건이 거짓이면
            System.out.println("락교에 다니지 않습니다.");
        }
        } // 제어문에는 항상 중괄호를 달자! 가시성을 위해, 블록 안에는 들여쓰기를 하자
    }
