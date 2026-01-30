package collectionframework.arraylist;

import collectionframework.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        // ArrayList에 회원 추가
        Member memberV = new Member(1001, "뷔구룽");
        Member memberKim = new Member(1002, "김아무개");

        memberArrayList.addMember(memberV);
        memberArrayList.addMember(memberKim);

        memberArrayList.showAllMember(); // 전체 회원 출력

        memberArrayList.removeMember(memberKim.getMemberId()); // 김아무개 회원 삭제
        memberArrayList.showAllMember(); // 회원 삭제 후 결과 출력
    }
}
