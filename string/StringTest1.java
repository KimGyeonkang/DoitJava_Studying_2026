package string;
// 문자열 주솟값 비교
public class StringTest1 {
    public static void main(String[] args) {
        // 생성자로 String 객체를 생성했을 때 주솟값 비교
        String str1 = new String("일상");
        String str2 = new String("일상");

        System.out.println(str1 == str2); // 인스턴스가 매번 새로 생성되므로 물리적인 인스턴스 주소는 서로 다름.
        System.out.println(str1.equals(str2)); // 문자열 값이 논리적으로 서로 같음.
        // 문자열 상수를 곧바로 가리킬 때 주솟값 비교
        String str3 = "미소직장";
        String str4 = "미소직장";

        System.out.println(str3 == str4); // 문자열 상수는 같은 상수 풀(공간)에 저장되어 있으므로, 주소도 동일.
        System.out.println(str3.equals(str4)); // 문자열 값은 논리적으로 서로 같음.
    }
}
