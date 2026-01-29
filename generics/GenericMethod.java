package generics;
// 제네릭 메서드 구현 예제: 두 점으로 만들어진 사각형 넓이 구하기
public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) { // 제네릭 메서드 구현
        // 두 점의 좌푯값 얻기
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();
        // 사각형의 및변과 높이 좌표 구하기
        double width = right - left;
        double height = bottom - top;

        return width * height; // 메서드의 반환값은 사각형의 넓이
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println("두 점으로 만들어진 사각형 넓이: " + rect);
    }
}
