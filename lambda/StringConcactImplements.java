package lambda;

public class StringConcactImplements implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
    }

    public static void main(String[] args) {
        String s1 = "뷔";
        String s2 = "구룽";
        StringConcactImplements concat1 = new StringConcactImplements();
        concat1.makeString(s1, s2);
    }
}