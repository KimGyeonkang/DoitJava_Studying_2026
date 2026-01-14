package Array;
// 배열 복사하기 1: for문 사용
public class ArrayCopy {
    public static void main() {
        int[] array1 = new int[3];
        int[] array2 = new int[5];
        int size = 0; // 1번 배열에서 유효한 값이 저장되는 배열 길이

        array1[0] = 1; size++;
        array1[1] = 2; size++;
        array1[2] = 3; size++;

        // 2번 배열에 1번 배열의 요솟값을 복사하는 반복문
        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }

        // 1번 배열에서 유효한 값이 저장된 배열 길이만큼만 출력
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i]);
        }

        System.out.println( ); // 출력시 한 칸 개행

        // 2번 배열의 모든 요솟값 출력(빈칸 포함)
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

}
