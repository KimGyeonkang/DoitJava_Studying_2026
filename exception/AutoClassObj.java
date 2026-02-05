package exception;

public class AutoClassObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 종료");
    }
}
