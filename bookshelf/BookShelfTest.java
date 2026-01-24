package bookshelf;
// 테스트 프로그램
public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        // 순서대로 요소 추가
        shelfQueue.enQueue("일상");
        shelfQueue.enQueue("미소가 끊이지 않는 직장");
        shelfQueue.enQueue("투명남과 인간녀");
        // 넣은 순서대로 요소를 꺼내어 출력
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
