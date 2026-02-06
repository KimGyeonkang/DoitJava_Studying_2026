package exception;

public class IDFormatTest {
    private String userID;
    private String userPassword;

    public String getUserID() {
        return userID;
    }
    // 아이디 생성 조건 구현
    public void setUserID(String userID) throws IDFormatException{
        if (userID == null) {
            throw new IDFormatException("아이디는 not null값이어야 함.");
        }
        else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디: 8자 이상 20자 이하");
        }
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }
    // 비밀번호 제약 조건 예외 처리 구현
    public void setUserPassword(String userPassword) throws PwdFormatException {
        if (userPassword == null) {
            throw new PwdFormatException("비밀번호는 not null값이어야 함.");
        }
        else if (userPassword.length() < 5) {
            throw new PwdFormatException("비밀번호: 5지 이상");
        }
        else if (userPassword.matches(userPassword)) {
            throw new PwdFormatException("비밀번호: 적어도 1자의 숫자 포함");
        }
        this.userPassword = userPassword;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "100000";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println( );
        // 비밀번호 관련 예외 테스트
        String userPassword = null;
        try {
            test.setUserPassword(userPassword);
        } catch (PwdFormatException e) {
            System.out.println(e.getMessage());
        }

        userPassword = "VGurung";
        try {
            test.setUserPassword(userPassword);
        } catch (PwdFormatException e) {
            System.out.println(e.getMessage());
        }

        userPassword = "VGr";
        try {
            test.setUserPassword(userPassword);
        } catch (PwdFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
