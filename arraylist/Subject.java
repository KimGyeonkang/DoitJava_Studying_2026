package arraylist;
// 과목 정보에 대한 클래스 별도로 만들기
public class Subject {
    // 클래스의 인스턴스 변수 선언(과목명, 점수)
    private String name;
    private int scorePoint;

    // 과목명을 얻는 메서드
    public String getName() {
        return name;
    }
    // 과목명을 설정(대입)하는 메서드
    public void setName(String name) {
        this.name = name;
    }
    // 점수를 얻는 메서드
    public int getScorePoint() {
        return scorePoint;
    }
    // 점수를 설정(대입)하는 메서드
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}
