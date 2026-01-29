package generics;
// 제네릭 프로그래밍 구현 예시: 3D 프린터 작동 로직
// 재료 2: 플라스틱
// T 자료형에 사용할 자료형을 제한하기 위해 추상 클래스 Material을 상속받음.
public class Plastic extends Material {
    public void doPrinting() {
        System.out.println("Plastic을 재료로 출력");
    }

    public String toString() {
        return "재료는 Plastic";
    }
}
