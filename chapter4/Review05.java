package chapter4;

public class Review05 {
    public static void main(String[] args){

        int lineCount = 7; // 출력할 줄 수
        int spaceCount = lineCount / 2 + 1; // 공백 수
        int starCount = 1; // 별 갯수

        for (int i = 0; i < lineCount; i++){ // i, j는 반복 횟수
            for (int j = 0; j < spaceCount; j++){ // 왼쪽
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++){
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++){ // 오른쪽
                System.out.print(" ");
            }
            if (i < lineCount / 2){ // 0, 1, 2줄
                spaceCount -= 1;
                starCount += 2;
            }
            else { // 3, 4, 5줄
                spaceCount += 1;
                starCount -= 2;
            }
            System.out.println( ); // 한 줄 엔터
        }
    }
}
