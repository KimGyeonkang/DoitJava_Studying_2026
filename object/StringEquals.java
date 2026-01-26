package object;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 두 인스턴스 주솟값이 같은지 비교(물리)
        System.out.println(str1.equals(str2)); // 두 인스턴스의 문자열값이 같은지 비교(논리)
    }
}
