package chapter4;
/* 피라미드, 마름모 별 찍기 260106
* Reference: https://velog.io/@hyewon4052/JAVA-for%EB%AC%B8%EC%9D%84-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EB%B3%84%EC%B0%8D%EA%B8%B0 (피라미드; 260106 최종 접속)
* Reference: https://ttmcr.tistory.com/entry/JAVA-%EB%A7%88%EB%A6%84%EB%AA%A8-%EC%B6%9C%EB%A0%A5#google_vignette (마름모, 260106 최종 접속)*/
public class Review04 {
    public static void main(String[] args){

        int lineCount = 4; // 출력할 줄 수: 총 4줄
        int spaceCount = lineCount/2 +1; // 공백 갯수(첫 줄은 4/2 +1 = 3개)
        int starCount = 1; // 별 갯수(첫 줄은 1개)

        // 별 피라미드 출력
        for (int i = 0; i < lineCount; i++){ // 줄 수
            for (int j = 0; j < spaceCount; j++){ // 왼쪽 공백
                System.out.print(" "); // i, j는 지역변수(중괄호 안에서만 적용됨, 각 문마다 다시 선언할 수 있음.)
            }
            for (int j = 0; j < starCount; j++){ // 별
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++){ // 오른쪽 공백
                System.out.print(" ");
            }
            spaceCount -= 1; // 양쪽 공백 갯수는 1씩 줄어듦.
            starCount += 2; // 별 갯수는 2씩 늘어남.
            System.out.println( ); // 한 줄 엔터.
        }
        // 여기까지 되새김 4번
    }
}
