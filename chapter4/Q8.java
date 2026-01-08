package chapter4;
/* 성적에 따라 학점 부여하기
* 조건1 100~90 A
* 조건2 89~80 B
* 조건3 79~70 C
* 조건4 69~60 D
* 그렇지 않으면 나머지 F
*
* int score = 90;
* char grade; // 조건에 따라 다른 값 대입*/
public class Q8 {
    public static void main(String[] args){
        int score = 90;
        char grade;
        if (score <= 100 && score >= 90){ // 100~90
            grade = 'A';
        }
        else if (score < 90 && score >= 80) { // 89~80
            grade = 'B';
        }
        else if (score < 80 && score >= 70) { // 79~70
            grade = 'C';
        }
        else if (score < 70 && score >= 60) { // 69~60
            grade = 'D';
        }
        else { // 나머지
            grade = 'F';
        }
        System.out.println("귀하의 점수는 " + score + "점, " + "학점은 " + grade + "입니다."); // 점수와 학점 출력
    }
}
