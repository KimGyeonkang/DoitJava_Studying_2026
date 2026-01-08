package chapter2;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'Z';
        System.out.println(ch1); //문자 그대로 출력
        System.out.println((int)ch1); //문자를 아스키 코드로 변환 출력

        char ch2 = 38; //정수의 값 대입, &의 아스키 코드는 38
        System.out.println(ch2); //정숫값에 해당하는 문자 출력

        int ch3 = 97; // 정수 자료형 변수 선언
        System.out.println(ch3); // 정숫값 그대로 출력
        System.out.println((char)ch3); // 정수를 문자 자료형으로 변환 출력. 아스키 코드가 97인 문자는 a
    }
}
