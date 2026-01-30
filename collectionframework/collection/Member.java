package collectionframework.collection;
// 컬렉션 프레임워크 사용 예제: 회원 관리 프로그램
// 회원 클래스: 프로그램 전반에서 공통 사용
public class Member {
    // 회원 속성
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    // toString() 메서드를 필요에 따라 재정의
    // 여기서는 회원 정보 출력 기능
    @Override
    public String toString() {
        return memberName + " 회원님의 아이디:  " + memberId ;
    }
}
