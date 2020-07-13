package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Burger plain = new Burger("plain", "plain", "beef", 11.24);
        double price = plain.burgerPrice();

        Burger original = new Burger("Original", "plain", "beef", 11.24);
        original.addHamburgerAddition1("Tomato", .25);
        original.addHamburgerAddition2("Lettuce", .12);
        original.addHamburgerAddition3("Onion", .18);
        original.addHamburgerAddition4("Bacon", 2.12);

        System.out.println("Price is " + original.burgerPrice());

        HealthyBurger healthy = new HealthyBurger("Turkey", 8.98);
        healthy.addhealthyAddition1("Cucumber", 1.23);
        healthy.addHamburgerAddition1("Lettuce", .12);
        System.out.println("Price is " + healthy.burgerPrice());
    }
}
