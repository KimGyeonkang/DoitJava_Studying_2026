package exception;
/*
사용자 정의 예외 처리 구현 예
 */
public class IDFormatException extends Exception{
    // 생성자의 매개변수로 예외 상황 메시지 받기
    public IDFormatException(String message) {
        super(message); // 최상위 예외 처리 클래스의 메서드 호출해 사용
    }
}
