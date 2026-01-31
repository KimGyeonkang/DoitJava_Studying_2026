package collectionframework.map.hashmap;

import collectionframework.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member); // key-value 쌍으로 회원 추가
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) { // HashMap에 매개변수로 받은 key값인 회원 아이디가 있다면
            hashMap.remove(memberId); // 해당 회원 삭제
            return true;
        }
        System.out.println("삭제할 회원: " + memberId + "이/가 존재하지 않음.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); // 모든 key값을 Set 객체로 반환
        while (ir.hasNext()) { // hashMap애 key값이 있는 동안 반복
            int key = ir.next(); // key 값(회원 아이디)을 하나씩 가져와
            Member member = hashMap.get(key); // key에서 value 값 가져오기
            System.out.println(member);
        }
        System.out.println( );
    }
}
