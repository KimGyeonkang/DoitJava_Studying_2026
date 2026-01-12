package Chapter5;

public class Customer {
    private String name; // 고객 이름
    private double budget; // 가용 예산

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
        // 예산을 반환하는 메서드
    }

    public void buyPhone(PhoneStore store) {
        Phone phone = store.sellPhone("아이폰", budget);
        if (phone != null) {
            System.out.println("고객: 핸드폰 구입이 완료되었습니다.");
        }
        else {
            System.out.println("고객: 핸드폰을 구입하지 못했습니다.");
        }
        // 고객이 핸드폰을 구입하는 기능
        // Phonestore(대리점) 클래스 별도로 필요
    }
}


