package thisex;
// this로 다른 생성자 호출

class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1);
    } // this를 사용해, 아래 Person(String, int) 생성자 호출

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() { // 반환형은 클래스형
        return this; // this를 반환하는 메서드
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf(); // this값을 참조 변수에 대입
        System.out.println(p); // p = noName.returnItSelf(); 출력
        System.out.println(noName); // 참조 변수 출력
    }
}
