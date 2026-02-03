package lambda;


public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "뷔구룽 ";
        String s2 = "is learning Java programming.";
        StringConcat concat2 = (s, v) -> System.out.println(s + v);
        concat2.makeString(s1, s2);
    }
}
