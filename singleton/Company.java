package singleton;
// 싱글톤 패턴 예새 실습
public class Company {
    private static Company instance = new Company(); // 2. 유일한 인스턴스 생성
    private Company() { } // 1. private 생성자 먼저 생성

    // 3. 외부에서 참조할 수 있는 public 메서드
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance; // 유일하게 생성한 인스턴스를 반환함.
    }
}
