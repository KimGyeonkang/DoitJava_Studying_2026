package thisex.builder;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;
    
    // Student 객체에 Builder 클래스를 매개변수로 받는 생성자를 만들고
    // Builder의 속성값을 Student 속성값으로 대입
    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber;
    }
    
    // Builder 클래스를 선언해 Student 클래스의 각 속성에
    // 값을 각각 대입해 줄 수 있는 메서드 구현
    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // build() 메서드로 Student 인스턴스를 생성해 반환
        public Student build() {
            return new Student(this);
        }
    }

        // showInfo() 메서드로 Student 객체 정보 출력
        public void showInfo() {
            System.out.println(id);
            System.out.println(name);
            System.out.println(grade);
            System.out.println(major);
            System.out.println(phoneNumber);
        }

        // Student.Builder 내부 클래스 생성 후
        // 각 속성값을 넣을 메서드를 호출하고
        // 마지막에 build() 메서드 호출
        public static void main(String[] args) {
            Student student = new Student.Builder(12345, "김원상")
                    .grade(3)
                    .major("컴퓨터공학")
                    .phoneNumber("123-456-7890")
                    .build();

            student.showInfo();
        }
}
