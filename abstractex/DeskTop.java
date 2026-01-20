package abstractex;
// 추상 클래스를 어떻게 상속받을까?
public class DeskTop extends Computer {
    // 추상 클래스를 상속받는 클래스는
    // 1) 구현되지 않은 추상 메서드를 모두 구현하거나(-> 구체적인 클래스)
    // 2) 상속받는 클래스 자신도 추상 클래스화 해야 한다.
    // 여기서는 1)을 선택한다.
    @Override
    public void display() {
        System.out.println("DeskTop display()"); // 추상 메서드의 몸체 코드
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()"); // 추상 메서드의 몸체 코드
    }
}
