package Array;
// 문자를 저장해 출력하는 배열: 알파벳 출력하기
public class CharArray {
    public static void main() {
        char[] alphabets = new char[26];
        char ch = 'A'; // 대문자 A의 아스키 코드는 65

        // A~Z를 각 요소에 저장하는 반복문
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        // 알파벳 문자와 아스키 코드값(정수형으로 형 변환) 출력하는 반복문
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }

}
