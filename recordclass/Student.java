package recordclass;
// record 클래스 사용: 학생 정보 표현

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // equals() 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }
    // hashCode() 재정의
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    // toString() 재정의
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Student studentV = new Student(10001, "뷔구룽");
        Student studentV2 = new Student(10001, "뷔구룽");

        System.out.println(studentV);
        System.out.println(studentV.equals(studentV2));
        studentV.setName("뷔구룽");
        System.out.println(studentV.getName());
    }
}
