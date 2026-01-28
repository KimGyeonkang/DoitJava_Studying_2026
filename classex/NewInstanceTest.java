package classex;
// Person 클래스의 인스턴스 생성: newInstance()
public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person1 = new Person(); // 생성자로 인스턴스 생성
        System.out.println(person1);

        Class pClass = Class.forName("classex.Person");
        Person person2 = (Person)pClass.newInstance(); // Class 클래스의 newInstance()로 인스턴스 생성
        // newInstance()의 기본 반환값이 Object형이므로, Person형으로 다운 캐스팅
        System.out.println(person2);
    }
}
