package string;
// 텍스트 블록 사용 예시
public class TextBlockTest {
    public static void main(String[] args) {
        String myString = "안녕하세요. \n\t반갑습니다. \n다음에 또 만나요."; // 개행과 들여쓰기를 직접 정의
        System.out.println("String 출력: ");
        System.out.println(myString);
        System.out.println( );
        // 텍스트 블록 사용
        System.out.println("Text Block 출력: ");
        String myTextBlock = """ 
                안녕하세요.
                    반갑습니다.
                다음에 또 만나요.
                """;
        System.out.println(myTextBlock);
        writerHTML();
        printStudent("김유영", 3, 4.0);
    }

    public static void writerHTML() {
        String html = """
                <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
    public static void printStudent(String name, int grade, double point) {
        String studentInfo = """
                %s 님은 // 문자열 변수 출력
                %d 학년이고 // 정수형 변수 출력
                평점은 %.1f 입니다. // 실수형(소숫점 첫째자리까지) 변수 출력
                """. formatted(name, grade, point); // 문자열 중간에 변수 등 다양한 문자열을 나타낼 때 사용하는 메서드
        System.out.println(studentInfo);
    }
}
