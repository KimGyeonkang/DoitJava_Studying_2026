package classex;
// String 클래스 정보 가져오기 예제
// 리플렉션 프로그래밍에 사용할 클래스 먼저 호출
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String str = new String();
        Class strClass = str.getClass(); // String 클래스를 객체(인스턴스)로 만들고 getClass()로 정보 가져오기
        // Class strClass = Class.forName("java.lang.String"); // 클래스 이름으로 가져오기

        Constructor[ ] cons = strClass.getConstructors(); // 모든 생성자 가져오기
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println( );
        Field[ ] fields = strClass.getFields(); // 모든 인스턴스 변수(필드) 가져오기
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println( );
        Method[ ] methods = strClass.getMethods(); // 모든 메서드 가져오기
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
