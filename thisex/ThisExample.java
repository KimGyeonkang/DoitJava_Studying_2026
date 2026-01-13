package thisex;
// this는 생성된 인스턴스 자신을 가리킴
class BirthDay {
    int day;
    int month;
    int year;

    // 태어난 연도를 지정하는 메서드
    public void setYear(int year) {
        this.year = year; //bDay.year = year과 같음.
    }

    public void printThis() {
        System.out.println(this); // bDay 인스턴스 출력과 같음
    }
}
public class ThisExample {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000); // 태어난 연도 = 2000
        System.out.println(bDay); //참조 변수 출력
        bDay.printThis(); // this 출력 메서드 호출

    }
}
