package gamelevel;
// 게임 시나리오: 공통 Player 클래스
public class Player {
    // 플레이어의 레벨 변수
    private PlayerLevel level;
    // 디폴트 생성자: 처음에는 초급자로 시작
    public Player() {
        level = new BeginnerLevel(); // 기본 레벌 값으로 초급자 대입
        level.showLevelMessage(); // 현재 레벨 출력
        }
    // 플레이어별 레벨 변수값을 얻는 메서드
    // level 변수가 private으로 선언되었기에
    // get() 메서드가 없으면 level 변수에 접근하지 못해 오류 발생
    public PlayerLevel getLevel() {
        return level;
    }
    // 레벨업(레벨 변경) 기능
    public void upgradeLevel(PlayerLevel level) {
        this.level = level; // 각 클래스에 해당하는 레벨 값 대입
        level.showLevelMessage(); // 현재 레벨 출력
    }

    public void play(int count) {
        level.go(count);
    }
}
