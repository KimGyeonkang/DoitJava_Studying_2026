package chapter4;
/* switch~case 표현식 예제 260105*/
public class SwitchCase4 {
    public static void main(String[] args){
        String medal = "Gold"; // 메달 색깔 변수 선언

        String message = switch(medal){ // 출력할 메시지 변수를 문자열로 선언하고, 곧바로 switch~case문 실행(표현식)
            case "Gold" -> "금메달입니다."; // medal이 Gold일 결루, message에 다음 값 대입.
            case "Silver" -> "은메달입니다.";
            case "Bronze" -> "동메달입니다.";
            default -> "메달 없습니다.";
        }; // 반드시 세미콜론!

        System.out.println(message); // message 결괏값 출력
    }
}
