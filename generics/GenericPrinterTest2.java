package generics;
// 제네릭 프로그래밍 구현 예시: 3D 프린터 작동 로직
// 제네릭 클래스 사용해보기: 프린터(상위 클래스 Material을 상속받아 Material의 메서드 사용하기)
// T 자료형에 사용할 자료형을 제한하기 위해 추상 클래스 Material을 상속받음.
public class GenericPrinterTest2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        powderPrinter.printing(); // 싱위 클래스 Material의 메서드 호출

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        plasticPrinter.printing(); // 싱위 클래스 Material의 메서드 호출
    }
}
