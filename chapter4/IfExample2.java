package chapter4;
/* 다중 조건문 if~else if 20260105*/
public class IfExample2 {
    public static void main(String[] args){
        int age = 62;
        int charge; // 변수 선언: 나이, 입장료

        // 조건 여러 개 제시.
        if (age < 8){ // 조건 1: 8세 미만
            charge = 1000; // 나이에 해당하는 입장료 값 대입(아래도 동일)
            System.out.println("취학 전 아동입니다.");
        }

        else if (age < 14){ // 조건 2: 14세 미만
            charge = 2000;
            System.out.println("초등학생입니다.");
        }

        else if (age < 20){ //조건 3: 20세 미만
            charge = 2500;
            System.out.println("종고등학생입니다.");
        }
        else if (age >= 60){ // 260108 추가 : 60세 이상일 때 경로우대와 입장료 0원 출력(04장 되새김 문제 07)
            charge = 0;
            System.out.println("경로우대입니다.");
        }
        else{ // 조건 3개가 모두 거짓
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge + "원입니다."); // 다중 조건문을 모두 수행한 뒤 입장료 값 출력
    }
}
