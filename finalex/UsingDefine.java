package finalex;
// Define 클래스에 정의해둔 상수 꺼내 사용하기!
public class UsingDefine {
    public static void main(String[] args) {
        System.out.println(Define.GOOD_MORNING); // static 상수이므로 인스턴스 생성 없이 곧바로 클래스명으로 참조 가능
        System.out.println("최솟값: " + Define.MIN);
        System.out.println("최댓값: " + Define.MAX);
        System.out.println("수학 과목 코드: " + Define.MATH);
        System.out.println("영어 과목 코드: " + Define.ENG);
        System.out.println("원주율: " + Define.PI);
    }
}
