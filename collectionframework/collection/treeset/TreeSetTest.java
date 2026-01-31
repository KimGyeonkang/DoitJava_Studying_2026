package collectionframework.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("뷔구룽");
        treeSet.add("김견강");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
