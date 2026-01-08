package chapter2;

public class Typeinference {
    public static void main(String[] args){
        var i = 10; //int i = 10으로 컴파일
        var j = 10.0; //double j = 10으로 컴파일
        var str = "hello"; //String str = "hello"로 컴파일
        /* var : 자료형 없이 변수 선언하는 방법*/

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test"; // 다른 문자열은 대입 가능
        // str = 3; // str 변수는 이미 String 형으로 사용되었기 때문에 정숫값을 넣을 수 없음.
    }
}
