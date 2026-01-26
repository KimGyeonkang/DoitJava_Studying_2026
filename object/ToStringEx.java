package object;
// Object 클래스의 toString() 메서드 사용 예시
class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }
    // toString() 메서드 재정의
    // 이를 통해, 아래 출력값이 (책 제목, 책 번호) 형태로 바뀜.
    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "일상");

        System.out.println(book1); // 인스턴스 정보(클래스 이름.주솟값) 출력
        // 여기서는 Object(기본) 클래스의 toString() 메서드가 자동으로 호출
        System.out.println(book1.toString()); // 인스턴스 정보를 문자열로 반환
    }
}
