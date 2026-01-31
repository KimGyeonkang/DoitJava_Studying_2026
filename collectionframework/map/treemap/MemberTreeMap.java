package collectionframework.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collectionframework.collection.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member); // key-value 쌍
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) { // treeMap에 매개변수로 받은 key값인 회원 아이디가 있다면
            treeMap.remove(memberId); // key값에 맞는 회원 삭제
            return true;
        }
        System.out.println("삭제하려는 회원: " + memberId + "이/가 존재하지 않음.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println( );
    }
}
