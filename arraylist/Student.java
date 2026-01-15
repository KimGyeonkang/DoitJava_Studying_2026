package arraylist;
import java.util.ArrayList;

public class Student {
    int studantID;
    String studentName;
    ArrayList<Subject> subjectList; // 과목 정보를 저장할 ArrayList 선언
    // 예재에서 각 학생의 수강 과목 수가 여러 개이고 서로 다르므로 배열 활용

    // 학생 정보(학번, 학생 이름) 값을 저장하고 배열에 추가
    public Student(int studantID, String studentName) {
        this.studantID = studantID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>(); // ArrayList 생성
    }

    // 수강 과목 정보(이름, 점수)을 배열에 추가
    public void addSubject(String name, int score) {
        Subject subject = new Subject(); // 과목 정보를 담을 Subject 인스턴스 생성
        subject.setName(name); // 과목 이름 추가
        subject.setScorePoint(score); // 점수 추가
        subjectList.add(subject); // 배열에 값 저장
    }

    // 배열 요솟값(학생 성적 정보)을 활용한 출력
    public void showStudentInfo() {
        int total = 0; // 총점, 처음에는 0으로 초기화
        double average = 0; // 평균 = 총점 / 수강 과목 수

        for (Subject s : subjectList) {
            total += s.getScorePoint(); // 과목 점수를 더해 총점 연산
            average = total / subjectList.size(); // 수강 과목 수 = 과목 정보가 저장된 배열 길이(size() 메서드 사용)
            System.out.println(studentName + " " + s.getName() + " "
                                + s.getScorePoint()); // 각 과목 정보(학생 이름, 과목명, 점수) 출력
        }
        System.out.println("총점: " + total); // 총점 출력
        System.out.println("평균: " + average); // 평균 출력
    }
}
