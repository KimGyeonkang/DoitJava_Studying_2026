package Scheduler;
// 고객센터 프로그램 번외: VIP 고객에게 전화를 우선 배분 기능(요구사항) 추가
public class VIPAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객 등급을 확인해 VIP 고객에게 먼저");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬 수준이 매우 높거나 경험이 가장 풍부한 상담원에게 우선 배분");
    }
}
