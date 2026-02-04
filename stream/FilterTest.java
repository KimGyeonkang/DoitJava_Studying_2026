package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// 스트림 중간 연산: filter() 메서드
public class FilterTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0; // 양수를 찾는 Predicate

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7); // 배열 정의
        Stream<Integer> s = numbers.stream().filter(isPositive); // filter() 연산 수행
        s.forEach(n -> System.out.println(n)); // 최종 연산: 배열의 요소를 하나씩 출력
    }
}
