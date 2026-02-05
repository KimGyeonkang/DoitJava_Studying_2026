package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample1 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt"); // FileNotFoundException 발생: 찾는 파일이 없음
        } catch (FileNotFoundException e) {
            System.out.println(e); // 예외 클래스 toString() 메서드 호출
            return;
        } finally { // return과 상관없이 실행
            if (fis != null) {
                try {
                    fis.close(); // 파일을 닫는 메서드
                } catch (IOException e) {
                    e.printStackTrace(); // 예외가 어디에서 발생했는지 추적하는 메서드
                }
            }
            System.out.println("무사히 출력"); // 예외 처리가 정상적으로 되었으므로 여기도 무사히 출력됨
        }
        System.out.println("여기도 출력");
    }
}
