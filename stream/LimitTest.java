package stream;

import java.util.Arrays;
import java.util.List;

// 스트림 중간 연산: limit() 메서드
public class LimitTest {
    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> mangas = Arrays.asList("일상", "미소가 끊이지 않는 직장입니다", "루리의 보석", "주술회전");

        System.out.print("기본(오름차순) 정렬: ");
        mangas.stream()
                .sorted().limit(2)
                .forEach(s -> System.out.print(s + " "));
        System.out.println( );

        System.out.print("문자열 길이에 따라 정렬: ");
        mangas.stream()
                .sorted((f1, f2) -> Integer.compare(f1.length(), f2.length())).limit(3)
                .forEach(s -> System.out.print(s + " "));

    }
}
