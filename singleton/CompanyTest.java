package singleton;
// Company.java에 이어, 4. 싱글톤 객체를 사용하는 코드 만들기
public class CompanyTest {
    public static void main(String[] args) {
        // 클래스 이름으로 getInstance()를 호출해 참조 변수에 대입
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();
        // 두 변수가 같은 주솟값인지 비교해 결과 출력
        System.out.println(myCompany1 == myCompany2); // 두 변수의 주솟값은 같다!
        // 이렇게 static을 사용해 Company 클래스에 유일한 인스턴스를 생성해
        // 싱글톤 패턴을 구현할 수 있었다!
    }
}
