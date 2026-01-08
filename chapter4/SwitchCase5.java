package chapter4;
/* yield 예약어 사용 260105*/
public class SwitchCase5 {
    public static void main(String[] args){
        int month= 15;
        int day = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; //여러 case문이 동시에 수행될 수 있다(같은 수행 패턴을 보일 때).
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                if (month < 1 || month > 12){ // 없는 월을 입력했을 때
                    System.out.println("없는 달입니다.");
                }
                else {
                    System.out.println("알 수 없는 오류입니다.");
                }
                yield 0; // default 안의 제어문(조건문)을 수행한 뒤, day에 0을 반환 -> day = 0
            }
        };

        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");
    }
}
