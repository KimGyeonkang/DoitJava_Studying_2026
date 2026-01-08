package chapter4;
/* 건물의 층을 누르면 그 층에 있는 장소를 알려주는 엘리베이터
*
* 층수를 담을 변수
* 장소를 담을 변수
*
* switch(층)
* 케이스-> 1층 약국, 2츨 정형외과, 3층 피부과, 4층 치과, 5층 헬스 클럽, default 사용하지 않는 층
* -> 층에 입력된 값에 따라 해당되는 값을 장소 변수에 대입
*
* 출력 예: '5층 헬스클럽입니다.'
*
* 종료*/
public class Q10 {
    public static void main(String[] args){
        int floor = 3;
        String location;

        switch (floor){
            case 1 : location = "약국";
                break;
            case 2 : location = "정형외과";
                break;
            case 3 : location = "피부과";
                break;
            case 4 : location = "치과";
                break;
            case 5: location = "헬스클럽";
                break;
            default: location = "사용하지 않는 층";
                break;
        }
        System.out.println(floor + "층 " + location + "입니다.");
    }
}
