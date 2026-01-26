package object;
// String 클래스의 hashCode() 메서드 사용 예시
public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        // 두 문자열의 값이 같으므로 아래는 같은 해시 코드값 출력
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
