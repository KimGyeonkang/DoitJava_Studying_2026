package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String filename, String className)
            throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } /*
        기본 예외 처리 클래스는 가장 뒤에 위치시켜야 함. 그렇지 않으면 특정 예외 처리 구문에 도달하기 전에 예외가 모두 처리되므로 오류 발생.
        */
        catch (Exception e) { // 모든 예외 클래스의 최상위 클래스, 가장 기본적인 예외 처리
            e.printStackTrace();
        }
    }
}
