package exception;

public class PwdFormatException extends Exception {
    // 생성자의 매개변수로 예외 상황 메시지 받기
    public PwdFormatException(String message) {
        super(message); // 최상위 예외 처리 클래스의 메서드 호출해 사용
    }
}
