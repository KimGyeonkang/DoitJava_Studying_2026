package Scheduler;
// 고객센터 프로그램 5: 테스트, 입력 문자에 따라 배분 정책 수행

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식 선택(대소문자는 구분하지 않습니다.)");
        System.out.println("R: 한 명씩 차례대로");
        System.out.println("L: 현재 상담이 없거나 대기가 가장 적은 상담원에게");
        System.out.println("P: 우선순위가 높은 고객 우선");
        System.out.println("V: VIP 고객 우선");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else if (ch == 'V' || ch == 'v') {
            scheduler = new VIPAllocation();
        }
        else {
            System.out.println("지원되지 않는 기능");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
