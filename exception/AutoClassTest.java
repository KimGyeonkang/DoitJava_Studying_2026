package exception;

public class AutoClassTest {
    public static void main(String[] args) {
        try (AutoClassObj obj = new AutoClassObj()) { // 사용할 resource문 선언
            throw new Exception(); // 강제로 예외 발생시킴
        } catch (Exception e) {
            System.out.println("예외 부분");
        }
    }
}
