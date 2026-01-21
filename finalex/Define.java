package finalex;
// 여러 파일에서 공유할 수 있는 final 상수(한 프로젝트 내 기본값) 선언
public class Define {
    // 모든 상수를 static으로 선언해, 인스턴스 생성과 관계없이 클래스명으로 참조 가능
    public static final int MIN = 1;
    public static final int MAX = 99999;
    public static final int ENG = 1001;
    public static final int MATH = 2001;
    public static final double PI = 3.14;
    public static final String GOOD_MORNING = "Good Morning!";
}
