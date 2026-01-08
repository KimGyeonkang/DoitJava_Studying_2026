package chapter2;

public class CharacterEx3 {
    public static void main(String[] args){
        int a = 65;
        int b = -65;

        char a2 = 65;
        // char b2 = -65; 오류 발생, char형은 음숫값을 표현할 수 없음.

        System.out.println((char)a);
        System.out.println((char)b); // b를 char형을 변환하면 알 수 없는 문자가 출력됨.
        System.out.println(a2);
    }
}
