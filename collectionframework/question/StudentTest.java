package collectionframework.question;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("100", "뷔구룽"));
        set.add(new Student("200", "김아무개"));
        set.add(new Student("300", "이아무개"));
        set.add(new Student("100", "박아무개"));

        System.out.println(set);
    }
}
