package collectionframework.map.hashmap;

import collectionframework.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberV = new Member(1001, "뷔구룽");
        Member memberKim = new Member(1002, "김견강");
        Member memberLee = new Member(1003, "이아무개");

        memberHashMap.addMember(memberV);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);

        memberHashMap.showAllMember();
        memberHashMap.removeMember(1003); // 회원 아이디가 1003인 회원 삭제
        memberHashMap.showAllMember();
    }
}
