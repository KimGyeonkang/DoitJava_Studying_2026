package Array;

public class ArrayTest {
    public void main(String[] args) {
        // 정수형 요소를 담을 배열 num을 선언하고 초기화
        int[ ] num = new int[ ] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 배열의 첫 번째부터 열 번째 요소까지 하나씩 가져와 출력하는 반복문
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            System.out.println(num[i]);
            // 위의 length는 배열 길이를 나타냄!
            // 배열 길이: 처음에 선언한 배열 전체 요소 개수
        }
    }
}
