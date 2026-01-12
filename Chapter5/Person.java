package Chapter5;

/*
public class Person {
    String name; // 속성: 이름(문자열)
    int height; // 키(정수)
    double weight; // 몸무게(소숫점 포함하는 실수)
    char gender; // 성별('M' 또는 'F')
    boolean married; // 결혼 여부(True, false)
    // 여기까지 멤버 변수
}

 */


public class Person {
    String name;
    float height;
    float weight;

    public Person() { }
    // 디폴트 생성자: 생성자가 없는 클래스에서, 자바 컴파일러가 자동으로 만든 생성자

    public Person(String pname) {
        name = pname;
        // 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자 구현
    }

    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
        // 사람 이름과 키, 몸무게를 매개변수로 입력받는 생성자
    }

    // 생성자 오버로드: 클래스에 생성자를 두 개 이상 구현하는 경우.
    // 메소드 오버로딩: 메서드 이름은 같고, 매개변수만 다른 경우.
}