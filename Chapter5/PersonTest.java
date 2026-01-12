package Chapter5;

public class PersonTest {
    public static void main(String[] args) {
        /*
        Person personLee = new Person();
        // Person()은 클래스를 생성할 때 사용되는 함수(생성자)
        // 생성자를 직접 만들면 디폴트 생성자가 만들어지지 않음.
         */
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;
        // 디폴트 생성자를 사용하는 경우
        // 디폴트 생성자를 클래스로 생성한 뒤 인스턴스 변수의 값을 따로 초기화.

        Person personLee = new Person("이순신", 175, 75);
        // 매개변수가 있는 생성자를 사용하는 경우
        // 인스턴스 변수를 초기화하면서 클래스 생성
    }
}
