package collectionframework;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);

        myList.add(1, "D"); // 일크드 리스트 두 번째 위치에 D 추기
        System.out.println(myList);

        myList.add(0, "O"); // 처음 위치에 O 추가
        System.out.println(myList);
        myList.addFirst("O"); // 위와 동일, addFirst() 메서드
        System.out.println(myList);

        System.out.println(myList.removeLast()); // 맨 뒤 요소 삭제 후 무얼 삭제했는지 출력
        System.out.println(myList); // 삭제 후 링크드 리스트
    }
}
