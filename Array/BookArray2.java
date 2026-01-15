package Array;
// BookArray.java에 이어서, 객체 배열의 각 배열 요소에 인스턴스 생성
public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        // 인스턴스를 직접 생성해 각 배열 요소에 저장
        library[0] = new Book("A", "a");
        library[1] = new Book("B", "b");
        library[2] = new Book("C", "c");
        library[3] = new Book("D", "d");
        library[4] = new Book("E", "e");

        // 책 정보(저장된 배열 요솟값)을 출력(메서드 호출)
        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }
        System.out.println( );
        // Book 인스턴스가 저장된 메모리 공간 주소(인스턴스 주솟값) 출력
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
