package Array;

public class TwoDimension {
    public static void main(String[] args) {
        // 이차원 배열 초기화
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        // 2행 3열의 표를 하나 만들었다고 생각해보자!

        // 배열의 행과 열을 각각 출력하는 이중(중첩) for문
        for (int i = 0; i < arr.length; i++) { // 행, length는 길이(행 개수)
            for (int j = 0; j < arr[i].length; j++) { // 각 행별 열, length는 길이(열 개수)
                System.out.println(arr[i][j]);
            }
            System.out.println( ); // 행 출력 후 한 줄 개행
        }

        // 여기부터는 이차원 배열의 길이 출력하는 코드
        System.out.println(arr.length); // 행 길이
        System.out.println(arr[0].length); // 열 길이
    }
}
