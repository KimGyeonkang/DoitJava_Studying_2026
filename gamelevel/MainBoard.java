package gamelevel;
// 게임 시나리오: 테스트 프로그램
public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player(); // 레벨 기본값은 초급자이므로, 초급자로 시작
        player.play(1); // count 수에 따라 play() 메서드 호출
        // 상위 클래스형(하나의 자료형)으로 변수를 선언해도 가상 메서드 기능에 의해
        // 생성된 각 인스턴스의 메서드를 호출
        PlayerLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        PlayerLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
