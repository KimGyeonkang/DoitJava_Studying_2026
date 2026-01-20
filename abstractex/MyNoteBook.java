package abstractex;
// 추상 메서드 NoteBook을 상속받은 MyNoteBook 클래스
public class MyNoteBook extends NoteBook {
    // 해당 클래스는 상위 클래스의 구체적인 메서드를 상속받고
    // 모든 추상 클래스를 구체적으로 구현했으므로
    // 일반 메서드가 된다.
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing()");
    }
}
