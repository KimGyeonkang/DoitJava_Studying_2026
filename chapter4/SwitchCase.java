package chapter4;
/* switch~case문 20260105*/
public class SwitchCase {
    public static void main(String[] args){
        int ranking = 1; // 변수 1: 순위
        char medalColor; // 변수 2: 메달 색깔

        switch (ranking){ // switch (조건)
            case 1 : medalColor = 'G'; // 1) 순위 = 1
                    break;
            case 2 : medalColor = 'S'; // 2) 순위 = 2
                    break;
            case 3 : medalColor = 'B'; // 3) 순위 = 3
                    break;
            default: // 4) 위 케이스 어디에도 해당하지 않을 때
                medalColor = 'A';
        }
        System.out.println(ranking + "등 메달 색깔은 " + medalColor + "입니다."); // 조건문 수행을 모두 마치고 결괏값 출력
    }
}
