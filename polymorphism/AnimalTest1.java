package polymorphism;
import java.util.ArrayList;
// 다형성 테스트: Animal 클래스에 메서드를 하나 정의하고 상속받은 클래스에서 재정의하기
// 같은 코드(메서드)를 사용했지만 매개변수 종류에 따라 출력 결과가 달라짐 -> 다형성
// ver.2(260120): 형 변환(다운 캐스팅) 테스트 기능 추카

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
        System.out.println("사람: 두 발로 걷기");
    }

    public void readBook() {
        System.out.println("사람: 책도 읽을 수 있다.");
    }
}

class Tiger extends Animal {
    // 메서드 재정의
    public void move() {
        System.out.println("호랑이: 네 발로 걷기");
    }

    public void hunting() {
        System.out.println("호랑이: 사냥도 할 수 있다.");
    }
}

class Eagle extends Animal {
    // 메서드 재정의
    public void move() {
        System.out.println("독수리: 하늘 날기");
    }

    public void flying() {
        System.out.println("독수리: 날개를 펴고 비상한다.");
    }
}

public class AnimalTest1 {
    // 배열(ArrayList) 생성
    ArrayList<Animal> aniList = new ArrayList<Animal>();

    // 다운 캐스팅 테스트 결과 출력
    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.addAnimal();
        System.out.println("===== 원래 형으로 다운 캐스팅 =====");
        aTest.testCasting();
    }
    // ArrayList에 각 인스턴스 넣기
    public void addAnimal() {
        // ArrayList에 추가되면서 Animal형으로 묵시적 형 변환
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        // 배열 요소를 Animal형으로 꺼내 move()를 호출하면
        // 재정의된 함수가 호출됨
        for (Animal ani : aniList) {
            ani.move();
        }
    }
    // 형 변환(다운 캐스팅) 테스트 메서드
    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) { // 모든 배열 요소를 하나씩 대상으로
            Animal ani = aniList.get(i); // 상위 클래스인 Animal형으로 가져온다.
            if (ani instanceof Human) { // 만약 ani가 Human형이면
                Human h = (Human)ani; // Human형으로 다운 캐스팅(명시적 형 변환)
                h.readBook(); // Human 클래스의 readBook() 메서드 호출
            }
            else if (ani instanceof Tiger) { // Tiger형이면
                Tiger t = (Tiger)ani; // Tiger형으로 다운 캐스팅하고
                t.hunting(); // Tiger 클래스의 hunting() 메서드 호출
            }
            else if (ani instanceof Eagle) { // Eagle형이면
                Eagle e = (Eagle)ani; // Eagle형으로 다운 캐스팅하고
                e.flying(); // Eagle 클래스의 flying() 메서드 호출
            }
            else { // 위에 모두 해당하지 않으면
                System.out.println("지원되지 않는 형");
            }
        }
    }
/*
    // 각 클래스의 메서드를 호출하는 메서드(매개변수의 자료형이 상위 클래스)
    // 상위 클래스에서 상속받은 클래스가 매개변수로 넘어오면 모두 상위 클래스형으로 변환
    // 가상 메서드 기술 -> animal.move() 메서드는 상위 클래스가 아닌 각 인스턴스의 메서드로 호출
    public void moveAnimal(Animal animal) {
        animal.move(); // 재정의된 메서드 호출
    }

 */
}
