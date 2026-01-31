package collectionframework.arraylist;

import java.util.ArrayList;

class Mystack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data); // push: 스택 맨 위에 요소 추가
    }

    public String pop() { // pop: 스택 맨 위에서 요소 꺼넴
        int len = arrayStack.size(); // 스택에 저장된 유효한 요소 개수
        if (len == 0) { // 스택에 더 이상 요소가 없을 때
            System.out.println("더 이상 pop할 값이 없습니다.");
            System.out.println("Underflow");
            return null;
        }

        return (arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 스택에서 제거
    }
}

public class StackTest {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // 스택에 더 이상 요소가 없을 때
    }
}
