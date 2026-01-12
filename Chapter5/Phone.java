package Chapter5;
// 캡슐화: 어떤 기능을 수행하는 데 필요한 정보를 하나에 모아 두고
// 사용자에게 필요한 기능만을 공개해
// 객체의 정보가 외부로 나가지 않고
// 사용할 때 오류가 발생하지 않도로 하는 것
public class Phone {
    private String model; // 핸드폰 모델
    private double price; // 가격

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
