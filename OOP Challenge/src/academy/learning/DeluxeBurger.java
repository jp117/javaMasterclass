package academy.learning;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "Poppy", "Beef", 19.54);
        super.addHamburgerAddition1("Chips", 4.62);
        super.addHamburgerAddition2("Soda", 2.87);
    }


    // You don't want the deluxe burger class to be able to add extras, so you override the class and remove the functionality.
    // The reason that the code adds additions above is because super is actually using the code in the burger class, not the deluxeBurger class.
    @Override
    public void addHamburgerAddition1(String name, double price) {
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
    }
}