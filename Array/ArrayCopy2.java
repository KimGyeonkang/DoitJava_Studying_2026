package Array;
// 배열 복사하기 2: System.arraycopy() 메서드 사용
public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50}; // 배열을 선언하고 값을 직접 대입
        int[] array2 = {1, 2, 3, 4, 5};

        // System.arraycopy(복사할 배열, 복사할 첫 위치, 붙여 넣을 배열, 붙여 넣을 첫 위치, 복사할 요소는 몇 개?)
        System.arraycopy(array1, 0, array2, 1, 4);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]); // 1, 10, 20, 30, 40
            // 복사할 요소 개수가 붗여 넣을 배열 전체 길이를 초과하면 오류 발생.
        }
    }
}
