package stream;

import java.util.Arrays;

// 정수 배열과 스트림
// 정수 배열 개수와 합 출력
public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count();
        int max = (int) Arrays.stream(arr).max().getAsInt();
        int min = (int) Arrays.stream(arr).min().getAsInt();
        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println(sumVal);
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
