package bookshelf;
import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;
    // 디폴트 생성자: Shelf 클래스 생성과 동시에 ArrayList 배열 생성
    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
