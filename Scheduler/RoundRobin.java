package Scheduler;
// 고객센터 프로그램 2: 순서대로 전화 배분하기
public class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분");
    }
}
