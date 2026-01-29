package generics;
// 제네릭 프로그래밍 구현 예시: 3D 프린터 작동 로직
// 제네릭 클래스 정의: 프린터
// T 자료형에 사용할 자료형을 제한하기 위해 추상 클래스 Material을 상속받음.
public class GenericPrinter<T extends Material> { // <자료형 매개변수 T>을 포함해 제네릭 클래스 생성
    private T material; // 제네릭의 자료형 매개변수 T 자료형 변수

    public void setMaterial(T material) {
        this.material = material;
    }
    // T 자료형 변수 material을 반환하는 제너릭 메서드
    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }
    // T 자료형이 상위 추상 클래스인 Material형으로 변환되면서
    // Material에 있는 doPrinting() 클래스를 사용할 수 있게 됨.
    public void printing() {
        material.doPrinting();
    }
}
