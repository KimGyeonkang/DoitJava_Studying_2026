package chapter4;
/*  switch~case문에 문자열을 직접 사용하는 경우 20260105 */
public class SwitchCase2 {
    public static void main(String[] args){
        String medal = "Gold"; // 문자열 자료형 변수 선언

        switch (medal){
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달 없습니다.");
                break;
                /* switch~case문 작성 시에는 반드시 break를 걸어주자.
                그렇지 않으면 조건을 충족한 이후에도 수행이 멈추지 않아 의도와 다른 결과가 나올 수 있다.
                 */
        }
    }
}
