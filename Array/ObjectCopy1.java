package Array;
// 객체 배열도 복사해서 사용 가능
public class ObjectCopy1 {
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
    }
}
