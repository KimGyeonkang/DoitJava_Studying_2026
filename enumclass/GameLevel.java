package enumclass;
// enum을 활용해 상수 사용: 게임 레벨 표현
public enum GameLevel {
    // 여러 개의 상수 선언
    BEGINNER_LEVEL(1, "초보자"),
    ADVANCED_LEVEL(2, "중수"),
    SUPER_LEVEL(3, "고수");
    // 상수가 가질 수 없는 속성을 인스턴스 변수로 선언
    private int level;
    private String hint;
    // 각 상수의 속성 초기화
    GameLevel(int level, String hint) {
        this.level = level;
        this.hint = hint;
    }

    public int getLevel() {
        return level;
    }

    public String getHint() {
        return hint;
    }
    // toString() 재정의: 상숫값 대신 hint 변숫값 출력
    public String toString(){
        return getHint();
    }
    /* 원래 Enum 클래스의 toString() 메서드: 상수의 이름 출력
    public String toString() {
        return name;
    */
    public static void main(String[] args) {
        /* GameLevel[] gameLevels = GameLevel.values(); // enum의 values() 메서드
        for (GameLevel level : gameLevels) { // enum에 선언한 모든 상수를 하나의 배열로 반환
            System.out.println(level);
        } */
        // valueOf()
        GameLevel gameLevel = GameLevel.valueOf("BEGINNER_LEVEL"); // enum에 해당 상수가 있는지 확인
        System.out.println(gameLevel.getLevel()); // 해당 상수가 있으면 인스턴스를 반환하고, 해당 인스턴스의 메서드 호출
        System.out.println(gameLevel.getHint());
    }
}
