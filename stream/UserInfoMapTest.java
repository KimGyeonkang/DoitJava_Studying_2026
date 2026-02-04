package stream;
// 스트림 중간 연산ㅣ map() 메서드

import java.util.ArrayList;
import java.util.List;

class UserInfo {
    private String name;
    private String age;

    public UserInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Integer.parseInt(age);
    }
}

public class UserInfoMapTest {
    public static void main(String[] args) {
        UserInfo userV = new UserInfo("뷔구룽", "30");
        UserInfo userKim = new UserInfo("김견강", "27");
        UserInfo userLee = new UserInfo("이아무개", "20");

        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(userV);
        userInfoList.add(userKim);
        userInfoList.add(userLee);

        userInfoList.stream().filter(user -> user.getAge() >= 25)// 25세 이상 사용자를 먼저 필터링
                .map(UserInfo::getAge) // 배열에서 나이 출력
                .forEach(s -> System.out.println(s)); // 최종 연산: 요소를 하나씩 출력
    }
}
