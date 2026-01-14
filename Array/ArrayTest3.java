package Array;
// 유효한 값이 저장된 배열 요소까지만 출력
public class ArrayTest3 {
    public static void main(String[] args) {
        double[] data = new double[5];
        int size = 0; // 유효한 값이 저장된 배열 요소 개수(처음에는 0으로 초기화)

        data[0] = 10.0; size++;
        data[1] = 20.0; size++;
        data[2] = 15.0; size++; // 각각 값을 저장한 뒤 size 증가

        // 유효한 값이 저장된 배열 요소까지만 출력하는 반복문
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
