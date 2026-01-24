package bookshelf;
// 클래스 상속과 인터페이스 구현을 동시에 한 클래스에서
public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) { // 배열에 요소 추가
        shelf.add(title);
    }

    @Override
    public String deQueue() { // 맨 처음 요소를 배열에서 삭제하고 반환
        return shelf.remove(0);
    }

    @Override
    public int getSize() { // 배열 요소 개수(길이) 반환
        return getCount();
    }
}
