package Array;
// Book.java에 이어서, 객체 배열 만들기
public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // Book 클래스형으로 객체 배열 생성
        // Book 인스턴스의 각각의 주솟값을 담을 공간 5개를 만들어라.

        // 배열에 책 정보를 넣는 반복문
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]); // 공간이 비어있을 때는 null 값 출력
        }
    }
}
