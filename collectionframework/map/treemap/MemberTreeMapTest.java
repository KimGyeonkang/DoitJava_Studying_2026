package collectionframework.map.treemap;

import collectionframework.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();
        // 회원 아이디 순서와 상관없이 회원 추가
        Member memberV = new Member(1003, "뷔구룽");
        Member memberKim = new Member(1001, "김견강");
        Member memberLee = new Member(1002, "이아무개");
        Member memberPark = new Member(1004, "박아무개");

        memberTreeMap.addMember(memberV);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberPark);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
