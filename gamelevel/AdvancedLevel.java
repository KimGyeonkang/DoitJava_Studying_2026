package gamelevel;
// 게임 시나리오: 중급자 레벨
// PlayerLevel를 상속받는 하위 클래스, 빨리 달리기와 점프 가능
public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달리기 가능");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump");
    }
    // 여기부터는 할 수 없는 기능
    @Override
    public void turn() {
        System.out.println("턴 못함");
    }
    // 여기부터는 레벨 정보 출력
    public void showLevelMessage() {
        System.out.println("=== 나 중급자요. ===");
    }
}
