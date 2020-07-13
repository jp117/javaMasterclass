package academy.learning;

import org.w3c.dom.ls.LSOutput;

public class Burger {

    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Burger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double burgerPrice(){
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger is " + this.price);
        if(this.additionName1 != null) {
            burgerPrice += this.additionPrice1;
            System.out.println("with " + this.additionName1 + " extra cost is " + this.additionPrice1);
        }
        if(this.additionName2 != null) {
            burgerPrice += this.additionPrice2;
            System.out.println("with " + this.additionName2 + " extra cost is " + this.additionPrice2);
        }
        if(this.additionName3 != null) {
            burgerPrice += this.additionPrice3;
            System.out.println("with " + this.additionName3 + " extra cost is " + this.additionPrice3);
        }
        if(this.additionName4 != null) {
            burgerPrice += this.additionPrice4;
            System.out.println("with " + this.additionName4 + " extra cost is " + this.additionPrice4);
        }
        return burgerPrice;
    }
}
