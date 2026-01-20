package abstractex;
// 추상 클레스 테스트 프로그램: Computer
public class ComputerTest {
    public static void main(String[] args) {
        /* Computer c1 = new Computer();
        Computer c2 = new DeskTop();
        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook(); */
        // 위 코드 중 Computer와 NoteBook에서 오류가 나는 이유
        // 둘은 추상 클래스이며
        // 추상 클래스는 인스턴스(new 예약어)로 생성할 수 없다.
        // 추상 클래스는 모든 메서드가 구현되지 않았기 때문에 인스턴스로 생성할 수 없다.
        // 단, 위와 같이 형 변환(상위 클래스형으로 선언 등)은 가능하다.
    }
}
