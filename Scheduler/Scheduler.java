package Scheduler;
// 고객 센터 프로그램 1: 인터페이스 정의
public interface Scheduler {
    public void getNextCall(); // 추상 메서드: 다음 전화 가져오기
    public void sendCallToAgent(); // 추상 메서드: 상담원에게 전화 배분
}
