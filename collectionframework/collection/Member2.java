package collectionframework.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
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
    @Override // hashCode() 재정의
    public int hashCode() {
        return memberId; // 회원 아이디 반환
    }

    @Override // equals() 재정의
    public boolean equals(Object obj) {
        if (obj instanceof Member2) { // 매개변수가 Member 자료형인지 확인
            Member2 member = (Member2) obj; // 매개변수를 Member형으로 변환 후 member에 대입
            if (this.memberId == member.memberId) { // 매개변수가 회원 아이디와 같으면
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override // Comparator 인터페이스의 compere() 메서드 재정의
    public int compare(Member2 mem1, Member2 mem2) {
        return mem1.getMemberId() - mem2.getMemberId(); // 두 매개변수의 값 비교
    }
}
