package collectionframework.collection.hashset;

import collectionframework.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        // HashSet에 회원 추가
        Member memberV = new Member(1001, "뷔구룽");
        Member memberKim = new Member(1002, "김아무개");

        memberHashSet.addMember(memberV);
        memberHashSet.addMember(memberKim);

        memberHashSet.showAllMember(); // 전체 회원 출력

        Member memberYuko = new Member(1002, "유코"); // 아이디가 중복된 회원 추가
        memberHashSet.addMember(memberYuko);
        memberHashSet.showAllMember();
    }
}
