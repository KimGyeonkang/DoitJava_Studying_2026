package chapter3;
/* 3장 되새김 문제 10번 20260105 * 단락 회로 평가 */
public class Review10 {
    public static void main(String[] args){
        int num = 5;
        int i = 10;

        boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10); // 단락 회로 평가에 따라, 우항은 연산되지 않음.
        System.out.println(value); // True
        System.out.println(num); // num = num * 10
        System.out.println(i); // i는 그대로 출력
    }
}
