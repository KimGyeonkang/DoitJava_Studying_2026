package classex;
// Person의 Class 클래스 가져오기 예제: 아래 3가지 방법
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException { // 아래 forName()에서 발생하는 예외를 처리, 없으면 오류 발생
        Person person = new Person();
        Class pClass1 = person.getClass(); // Object 클래스의 getClass() 메서드 사용
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 class 파일 대입
        System.out.println(pClass2.getName());

        String className = "classex.Person";
        Class pClass3 = Class.forName(className);
        System.out.println(pClass3.getName());
    }
}
