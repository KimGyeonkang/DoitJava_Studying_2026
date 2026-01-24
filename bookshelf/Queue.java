package bookshelf;
// 큐 인터페아스: 먼저 들어온 자료를 먼저 꺼내는 기능
public interface Queue {
    void enQueue(String title); // 배열의 맨 마지막에 추가
    String deQueue(); // 배열의 맨 처음 항목을 꺼내 반환
    int getSize(); // 현재 Queue에 있는 요소 개수 반환
}
