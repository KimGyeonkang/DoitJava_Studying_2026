package interfaceex;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();
        X xClass = mClass;
        xClass.x();
        // xClass.myMethod(); // 오류, 상위 인터페이스형으로 대입하면 해당 인터페이스의 메서드만 호출 가능

        Y yClass = mClass;
        yClass.y();
        // yClass.myMethod(); // 오류

        // 구현된 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메서드 호출 기능
        MyInterface iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
