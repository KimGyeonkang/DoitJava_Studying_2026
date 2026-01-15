package Array;
// 참조 자료형으로 선언하는 객체 배열
public class Book {
    // 책 이름과 저자 이름을 변수로 선언
    private String bookName;
    private String author;

    public Book() {} // 디폴트 생성자

    // 책 이름과 저자 이름을 매개변수로 받는 생성자
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    // private로 선언했던 변수(책 이름)를 호출해 값을 대입하는 메서드
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    // 작가 이름 변수(private)를 호출해 값을 대입하는 메서드
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    // 책 정보를 출력하는 메서드
    public void showBookInfo() {
        System.out.println(bookName + "," + author);
    }
}
