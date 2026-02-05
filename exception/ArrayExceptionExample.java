package exception;

/* for문을 예외 처리 없이 그대로 실행하면 예외 발생
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at exception.ArrayExceptionExample.main(ArrayExceptionExample.java:8)
	길이가 5인 배열에 6개의 요소를 넣으려고 하니, 배열 길이 초과로 예외 발생(프로그램 종료)
 */
public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            for (int i = 0; i <= 5; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(e + " ");
            System.out.println("예외 발생");
        }
        System.out.println( );
        System.out.println("프로그램을 종료합니다.");
    }
}
