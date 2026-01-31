package collectionframework.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collectionframework.collection.Member;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member); // hashSet에 회원 추가
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator(); // Iterator를 활용해 hashSet 요소 순회

        while (ir.hasNext()) { // hashSet에 요소가 있는 동안 반복
            Member member = ir.next(); // 회원 요소를 하나씩 가져와
            int tempId = member.getMemberId(); // 회원 아이디
            if (tempId == memberId) { // 아이디를 비교했을 때 매개변수와 같으면
                hashSet.remove(member); // 회원 삭제
                return true;
            }
        }
        // 수행이 끝날 때까지 삭제하려는 값을 찾지 못한 경우
        System.out.println("삭제하려는 회원: " + memberId + "을/를 찾을 수 없음.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member); // 모든 화원 출력
        }
        System.out.println( );
    }
}
