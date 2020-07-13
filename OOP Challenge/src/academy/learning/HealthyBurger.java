package academy.learning;

public class HealthyBurger extends Burger{
    private String HealthyAddName1;
    private double HealthyAddPrice1;

    private String HealthyAddName2;
    private double HealthyAddPrice2;

    public HealthyBurger(String meat, double price){
        super("Healthy", "Brown", meat, price);
    }

    public void addhealthyAddition1(String name, double price){
        this.HealthyAddName1 = name;
        this.HealthyAddPrice1 = price;
    }

    public void addhealthyAddition2(String name, double price){
        this.HealthyAddName2 = name;
        this.HealthyAddPrice2 = price;
    }

    @Override
    public double burgerPrice() {
        double burgerPrice = super.burgerPrice();
        if (this.HealthyAddName1 != null){
            burgerPrice += this.HealthyAddPrice1;
        }
        if (this.HealthyAddName2 != null){
            burgerPrice += this.HealthyAddPrice2;
        }
        return burgerPrice;
    }
}