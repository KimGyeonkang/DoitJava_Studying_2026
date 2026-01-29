package generics;
// 제네릭 프로그래밍 구현 예시: 3D 프린터 작동 로직
// 제네릭 클래스 사용해보기: 프린터
public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // Powder형으로 클래스 생성

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); // Plastic형으로 클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
