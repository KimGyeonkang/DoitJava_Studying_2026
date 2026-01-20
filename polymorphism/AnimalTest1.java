package polymorphism;
// 다형성 테스트: Animal 클래스에 메서드를 하나 정의하고 상속받은 클래스에서 재정의하기
// 같은 코드(메서드)를 사용했지만 매개변수 종류에 따라 출력 결과가 달라짐 -> 다형성

// 상위 클래스 정의
class Animal {
    public void move() {
        System.out.println("동물이 음직입니다.");
    }
}

// 여기부터 하위 클래스 정의(상위 클래스 상속)
class Human extends Animal {
    // 메서드 재정의(오버라이드)
    public void move() {
        System.out.println("두 발로 걷기");
    }
}

class Tiger extends Animal {
    // 메서드 재정의
    public void move() {
        System.out.println("네 발로 걷기");
    }
}

class Eagle extends Animal {
    // 메서드 재정의
    public void move() {
        System.out.println("하늘 날기");
    }
}

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    // 각 클래스의 메서드를 호출하는 메서드(매개변수의 자료형이 상위 클래스)
    // 상위 클래스에서 상속받은 클래스가 매개변수로 넘어오면 모두 상위 클래스형으로 변환
    // 가상 메서드 기술 -> animal.move() 메서드는 상위 클래스가 아닌 각 인스턴스의 메서드로 호출
    public void moveAnimal(Animal animal) {
        animal.move(); // 재정의된 메서드 호출
    }
}
