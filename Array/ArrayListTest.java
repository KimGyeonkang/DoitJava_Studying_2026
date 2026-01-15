package Array;
// ArrayList를 사용하려면 먼저 해당 클래스를 import해야 함.
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList 선언
        ArrayList<Book> library = new ArrayList<Book>();

        // 요솟값을 추가할 때는 add() 메서드를 사용
        library.add(new Book("A", "a"));
        library.add(new Book("B", "b"));
        library.add(new Book("C", "c"));
        library.add(new Book("D", "d"));
        library.add(new Book("E", "e"));

        // 배열 길이(요소 개수)만큼 출력
        // ArrayList의 경우 size() 메서드를 사용
        for (int i = 0; i < library.size(); i++) {
            // get(i) 메서드: 배열의 i 위치에 있는 요솟값 반환
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println(" "); // 한 줄 개행

        // 향상된 for문을 사용해 책 정보 출력
        System.out.println("=== 향상된 for문 사용 ===");
        for (Book book : library) {
            book.showBookInfo();
        }
    }
}
