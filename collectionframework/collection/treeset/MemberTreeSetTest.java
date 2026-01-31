package collectionframework.collection.treeset;

import collectionframework.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        // TreeSet에 회원 추가
        Member memberV = new Member(1001, "뷔구룽");
        Member memberKim = new Member(1002, "김아무개");

        memberTreeSet.addMember(memberV);
        memberTreeSet.addMember(memberKim);

        memberTreeSet.showAllMember(); // 전체 회원 출력

        Member memberYuko = new Member(1002, "유코"); // 아이디가 중복된 회원 추가
        memberTreeSet.addMember(memberYuko);
        memberTreeSet.showAllMember();
    }
}
