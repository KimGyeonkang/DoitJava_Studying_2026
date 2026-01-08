package chapter4;
/* (check-in BreakExample.java)break문을 사용해 정확한 num값 구하기! 260106 */
public class BreakExample2 {
    public static void main(String[] args){
        int sum = 0; // 합계
        int num = 0; // 더하는 수

        for (num = 0; sum < 100 ; num++){ // 과제: 0부터 시작해 숫자를 1씩 늘리면서 더할 때 몇까지 더해야 100이 넘을까?
            // break문 사용 시 위의 조건식은 생략 가능
            sum += num; // sum = sum + num
            if (sum >= 100) // break 수행조건: sum이 100보다 크거나 같을 때
                break; // 증감을 수행하지 않고 반복문 이탈
        }// 합한 값이 100보다 클 때 종료
        System.out.println(num); // num = 14
        System.out.println(sum); // sum = 105
        // 정확하게 num = 14라는 값을 구할 수 있음!
    }
}
