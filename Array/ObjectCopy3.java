package Array;
// 깊은 복사: 그렇다면 인스턴스 자체를 따로 복사하기 위해서는?
public class ObjectCopy3 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("A", "b");
        bookArray1[1] = new Book("B", "b");
        bookArray1[2] = new Book("C", "c");

        // 2번 배열의 인스턴스를 먼저 생성(디폴트 생성자)
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        // 1번 배열의 요소를 2번 배열의 각 인스턴스에 복사
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        // 붙여 넣은 배열의 요소를 출력
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        // 이제 ObjectCopy2와 동일하게 1번 배열의 첫 번째 요솟값을 바꾼다면?
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

        // 실행 결과
        // 1번 배열의 요솟값이 바뀌어도 2번 배영은 영향을 받지 않는다.
        // 이유는? 2번 배열에 인스턴스를 따로 생성했으므로
        // 1번 배열 요소를 복사해도 둘은 서로 다른 인스턴스를 가진다.
        // 따라서 1번 배열의 요솟값이 바뀌어도 2번 배열의 요솟값은 바뀌지 않는다.
        // 깊은 복사 -> 복사할 배열에 인스턴스를 따로 만들고 요솟값을 복사하는 것.
        // 학습 자료(박은종, 2025, Do it 자바 프로그래밍 입문, 이지스퍼블리싱) 참고해 정리
    }
}
