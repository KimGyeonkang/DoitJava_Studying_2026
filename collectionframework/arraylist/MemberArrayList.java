package collectionframework.arraylist;

import java.util.ArrayList;
import collectionframework.collection.Member; // collection 패키지에 있는 Member(회원) 클래스 호출

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); // Member형 ArrayList 선언
    }

    public void addMember(Member member) {
        arrayList.add(member); // 회원 추가
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // 회원을 순차적으로 가져옴.
            int tempId = member.getMemberId();
            if (tempId == memberId) { // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i); // 해당 회원 삭제
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member); // 전체 회원 출력
        }
        System.out.println( );
    }
}