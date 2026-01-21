package gamelevel;
// 게임 시나리오: 고급자 레벨
// PlayerLevel를 상속받는 하위 클래스, 엄청 빠르게 달리기, 아주 높이 점프, 한 바퀴 턴 가능
public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달리기 가능");
    }

    @Override
    public void jump() {
        System.out.println("겁나 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돌기 신공");
    }
    // 여기부터는 레벨 출력 기능
    @Override
    public void showLevelMessage() {
        System.out.println("=== 응, 나 쌉고수. ===");
    }
}
