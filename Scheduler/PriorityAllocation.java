package Scheduler;
// 고객센터 프로그램 4: 고객 우선순위에 따라 전화 배분
public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객 등급을 확인해 높은 고객 전화부터");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬 수준이 높은 상담원에게 우선 배분");
    }
}
