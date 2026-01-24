package Scheduler;
// 고객센터 프로그램 3: 상담 대기가 가장 적은 상담원에게 전화 배분
public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담이 없거나 대기가 가장 적은 상담원에게 배분");
    }
}
