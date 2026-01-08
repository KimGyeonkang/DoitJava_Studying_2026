package chapter3;
/* 3장 되새김 문제 9번 20260105 * ++ -- 위치에 따른 연산 순서에 주의! */
public class Review09 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = gameScore++; // 게임스코어를 먼저 대입 후 1을 더하기
        System.out.println(lastScore1); // 150 출력 후, gameScore = 150 + 1 = 151

        int lastScore2 = gameScore--; // 게임스코어를 먼저 대입 후 1을 뺴기
        System.out.println(lastScore2); // 151 출력 후, gameScore = 151 - 1 = 150
    }
}
