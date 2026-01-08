package chapter2;

public class CharacterEx2 {
    public static void main(){ //String[] args를 넣고 안 넣고에 차이가 있을까?
        char ch1 = '한';
        char ch2 = '\uD55C'; // 유니코드 활용

        System.out.println(ch1);
        System.out.println(ch2);
    }
}
