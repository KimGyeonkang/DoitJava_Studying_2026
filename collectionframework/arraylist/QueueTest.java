package collectionframework.arraylist;

import java.util.ArrayList;

class MyQueue {
    ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data); // 큐 맨 뒤에 요소 추가
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("Queue has no longer data.");
            return null;
        }

        return (arrayQueue.remove(0)); // 맨 앞의 자료 반환하고 큐에서 제거
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue()); // 큐에 더 이상 요소가 없을 때
    }
}
