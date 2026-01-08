package chapter3;
/* 단항(증감) 연산자 2026.01.03. */
public class OperationEx2 {
    public static void main(String[] args){
        int gameScore = 150;

        int lastScore1 = ++gameScore; // 게임스코어에 1을 더한 뒤 대입
        System.out.println(lastScore1); // gameScore = 150 + 1 = 151

        int lastScore2 = --gameScore; // 게임스코어에서 1을 뺀 뒤 대입
        System.out.println(lastScore2); // gameScore = 151 - 1 = 150

        int lastScore3 = gameScore++; // 게임스코어 값을 먼저 대입한 다음, 1을 더함.
        System.out.println(lastScore3); // 150을 출력 후, gameScore = 150 + 1 = 151

        int lastScore4 = gameScore--; // 게임스코어 값을 먼저 대입한 다음, 1을 뺌.
        System.out.println(lastScore4); // 151을 출력 후, gameScore = 151 - 1 = 150

        System.out.println(gameScore); // gameScore = 150
    }
}
