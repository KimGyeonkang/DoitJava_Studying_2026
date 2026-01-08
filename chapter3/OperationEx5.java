package chapter3;
/* 비트 연산자 2026.01.05. */
public class OperationEx5 {
    public static void main(String[] args){
        int num = 0B00000101; // 5를 2진수(0B)로

        System.out.println(num << 2); //왼쪽으로 2비트 이동
        System.out.println(num >> 2); //오른쪽으로 2비트 이동
        System.out.println(num >>> 2); //오른쪽으로 2비트 이동
        // >>> 연산자: >>와 동일하게 비트를 오른쪽으로 이동. 왼쪽에 채워지는 비트값이 부호 비트와 상관없이 무조건 0이 됨(교재 84쪽).

        System.out.println(num);

        num = num << 2; // 결괏값을 직접 num에 대입 -> 비트가 이동된 값으로 바뀜.
        System.out.println(num);
    }
}
