package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr); // StringBuilder 클래스 생성
        System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
        // buffer에 문자열 추가
        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!!");
        System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer)); // 기존 메모리에 문자열이 추가되었으므로 메모리 주소는 동일.

        javaStr = buffer.toString(); // String 클래스로 변환
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(javaStr)); // buffer 문자열을 다시 javaStr로 반환받아 새로운 문자열 생성(주소는 달라짐)
    }
}
