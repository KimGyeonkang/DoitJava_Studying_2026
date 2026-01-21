package gamelevel;
// 게임 시나리오: 초급자 레벨
// PlayerLevel의 하위 클래스(상속), 천천히 달리기만 가능
public class BeginnerLevel extends PlayerLevel {
    // 추상 메서드 재정의(구현)
    // 할 수 있는 기능
    @Override
    public void run() {
        System.out.println("천천히 달리기 가능");
    }
    // 여기부터는 할 수 없는 기능
    @Override
    public void jump() {
        System.out.println("점프 못해");
    }

    @Override
    public void turn() {
        System.out.println("턴 못함");
    }
    // 여기부터는 레벨 출력 기능
    @Override
    public void showLevelMessage() {
        System.out.println("=== 나 초급자요. ===");
    }
}
