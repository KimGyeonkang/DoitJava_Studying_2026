package chapter2;
/* 명시적 형 변환(강제 형 변환)
* 묵시적과 달리, 형 변환 기본 원칙과 반대 순서일 때 주로 활용 2026.01.03 */
public class ExplicitConversion {
    public static void main(String[] args){
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 연산
        int iNum4 = (int)(dNum1 + fNum2); // 두 실수의 합이 먼저 연산되고 형 변환
        //정수는 실수보다 덜 정밀한 자료형이므로... 강제(명시적) 형 변환이 필요.

        System.out.println(iNum3);
        System.out.println(iNum4);
        // 같은 연산이라도 형 변환의 순서에 따라 출력값이 다르게 나옴.
    }
}
