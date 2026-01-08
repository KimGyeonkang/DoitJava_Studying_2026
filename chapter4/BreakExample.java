package chapter4;
// 260106
public class BreakExample {
    public static void main(String[] args){
        int sum = 0; // 합계
        int num = 0; // 더하는 수

        for (num = 0; sum < 100 ; num++){ // 0부터 시작해 숫자를 1씩 늘리면서 더할 때 몇까지 더해야 100이 넘을까?
            sum += num; // sum = sum + num
        }// 합한 값이 100보다 클 때 종료
        System.out.println(num); // num = 15
        System.out.println(sum); // sum = 105
        // 다만 이 예제에서는 정확한 num값을 구하기 힘들다. 따라서 break문 사용이 필요!
    }
}
