package Array;
// 얕은 복시: 만약 1번 배열의 어느 요숏값을 바꾼다면?
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("A", "b");
        bookArray1[1] = new Book("B", "b");
        bookArray1[2] = new Book("C", "c");
        // 배열을 복사하는 메서드
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        // 붙여 넣은 배열의 요소를 출력
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        // 새로운 과제
        // 만약 1번 배열의 첫 번째 요솟값을 바꾼다면?
        bookArray1[0].setBookName("すずめの戸締まり");
        bookArray1[0].setAuthor("新海誠");

        // 1번 배열 요소 출력
        System.out.println("=== 1번 배열 ===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        // 2번 배열 요소 출력
        System.out.println("=== 2번 배열 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        // 실핼 결과
        // 객체 배열의 요소로 저장된 값은 인스턴스 자체가 아니다(인스턴스의 주솟값).
        // 객체 배열을 복사하더라도 인스턴스의 주솟값만 복사하기 때문에
        // 한 배열의 인스턴스 값을 바꾸면 두 배열이 모두 영향을 받는다.
        // 얕은 복사 -> 인스턴스 주솟값만 복사하는 것
        // 학습 자료(박은종, 2025, Do it 자바 프로그래밍 입문, 이지스퍼블리싱) 참고해 정리
    }
}
