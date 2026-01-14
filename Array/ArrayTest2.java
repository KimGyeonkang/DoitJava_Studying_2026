package Array;
// 전체 배열 길이만큼 값 출력
public class ArrayTest2 {
    public static void main(String[] args) {
        // double 자료형 배열 data를 선언하고 배열 길이를 5로 초기화
        double[] data = new double[5];

        // data 배열의 각 요소에 값 대입
        data[0] = 10.0; // 10.0
        data[1] = 20.0; // 20.0
        data[2] = 30.0; // 30.0

        // 배열의 첫 번째 요소부터 배열 길이만큼 값 출력
        // 네 번째, 다섯 번째 요소에는 값이 없어 0.0으로 출력됨
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            System.out.println(data[i]);
        }
    }
}
