package collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Member> ir = arrayList.iterator(); // Iterator 클래스 생성
        while (ir.hasNext()) { // 배열에 요소가 있는 동안 반복
            Member member = ir.next(); // 다음 요소(회원) 반환
            int tempId = member.getMemberId();
            if (tempId == memberId) { // 회원 아이디 == 매개변수이면
                arrayList.remove(member); // 해당 회원 삭제
                return true; // true 반환
            }
        }
        // 수행이 끝날 때까지 삭제하려는 값을 찾지 못한 경우
        System.out.println("삭제하려는 회원: " + memberId + "을/를 찾을 수 없음.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member); // 전체 회원 출력
        }
        System.out.println( );
    }
}