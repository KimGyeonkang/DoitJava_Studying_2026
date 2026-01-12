package Chapter5;

public class PhoneStore {
    private Phone phone; // 대리점에서 판매하는 핸드폰

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    // 구입하려는 모델과 예산이 매개변수
    public Phone sellPhone(String model, double budget) {
        String phoneModel = phone.getModel();

        // 고객이 원하는 모델과 대리점에서 가지고 있는 모델이 같고,
        // 핸드폰의 가격이 예산보다 작거나 같으면
        if (model.equals(phoneModel) && budget >= phone.getPrice()) {
            registerPayment();
            discountPromotion();
            saveData();
            return phone;
        }
        else return null;
    }

    // 핸드폰 구입 절차를 구현한 메서드
    private void registerPayment() {
        System.out.println("대리점: 요금제와 약정 등록");
    }

    private void discountPromotion() {
        System.out.println("대리점: 프로모션 할인");
    }

    private void saveData() {
        System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동");
    }
}
