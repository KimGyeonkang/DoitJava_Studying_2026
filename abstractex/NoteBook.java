package abstractex;
// 추상 클래스 구현 예제: Computer를 상속받은 NoteBook
public abstract class NoteBook extends Computer {
    // 여기서는 상위 클래스에서 상속받은 추상 메서드를 모두 구현하지 않고
    // display() 하나만 구현
    // 따라서, 해당 클래스는 아직 구체적으로 구현되지 않는 메서드를 갖고 있어
    // 추상 클래스가 된다.
    @Override
    public void display() {
        System.out.println("NoteBook display()");
    }
}
