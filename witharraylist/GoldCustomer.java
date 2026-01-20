package witharraylist;

public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(int costomerID, String costomerName) {
        super(costomerID, costomerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
