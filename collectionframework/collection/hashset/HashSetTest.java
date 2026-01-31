package collectionframework.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("뷔구룽");
        hashSet.add("김견강");
        hashSet.add("토우노메");
        hashSet.add("토우노메");
        hashSet.add("야코");

        System.out.println(hashSet);
    }
}
