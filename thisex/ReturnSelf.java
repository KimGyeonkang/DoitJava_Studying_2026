package thisex;
// this로 객체 자신의 인스턴스를 반환

import java.util.Formatter;

class Student {
    private int id;
    private String name;
    private int grade;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // this로 현재 객체를 참조해 인스턴스 변수 grade를 매개변수로 실행하고 이를 반환
    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public void showStudentInfo() {
        System.out.println(name + " " + id + " " + grade);
    }
}
public class ReturnSelf {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setId(12345).setName("김원상").setGrade(3).showStudentInfo();
        // 연속 호출
    }
}
