package string;
// 두 문자열을 연결하고 결과 확인
public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr);
        System.out.println("처음 문자열 주솟값: " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr); // 두 문자열을 연결해 javaStr를 새로 생성해 대입

        System.out.println(javaStr);
        System.out.println("연결된 문자열 주솟값: " + System.identityHashCode(javaStr));
        // 연결된 문자열 javaStr(새로 생성된 문자열)은 기존 javaStr과 다른 주소를 가리킴.
    }
}
