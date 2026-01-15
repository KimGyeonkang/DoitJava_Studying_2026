package Array;
// 향상 for문: 배열에서 어떻게 활용할 수 있을까?
public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cake", "Dolphin", "Elephant"};

        // 향상 for문 (Enhanced For)
        // for (변수 선언 : 값을 가져올 배열)
        // String형 lang 벼수에 array 배열의 요솟값을 차례로 대입해 출력
        for (String lang : array) {
            System.out.print(lang + " ");
        }
    }
}
