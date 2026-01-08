package chapter4;
// break 없이 switch~case문을 사용하는 경우 20260105
public class SwitchCase3 {
    public static void main(String[] args){
        String medal = "Gold"; // 문자열 자료형 변수 선언

        switch (medal){
            case "Gold" -> System.out.println("금메달입니다."); // : 대신 -> 사용, break 생략 가능
            case "Silver" -> System.out.println("은메달입니다.");
            case "Bronze" -> System.out.println("동메달입니다.");
            default -> System.out.println("메달 없습니다.");
        }
    }
}
