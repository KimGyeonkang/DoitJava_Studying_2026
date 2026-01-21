package gamelevel;
// 게임 시나리오: Player 클래스에 포함되는 PlayerLevel 클래스
public abstract class PlayerLevel {
    // 하위 클래스에 따라 달라지는 기능(추상 메서드)
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    // go() 메서드: 각 플레이어가 공통적으로 수행하는 기능 사나리오 템플릿 정의
    // run -> jump(count 값에 따라 호출 횟수 차이) -> turn
    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
