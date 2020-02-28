package academy.learning;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawFunds(100);

        bobsAccount.depositFunds(50);
        bobsAccount.withdrawFunds(100);

        bobsAccount.depositFunds(50);
        bobsAccount.withdrawFunds(100);

        BankAccount jimsAccount = new BankAccount(123121, 0, "Jim", "Jim@gmail.com", "(555) 555-5555");


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 100, "bob@email.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer(500, "email");
        System.out.println(person3.getEmail());

        Wall wall1 = new Wall(1.125, -1.0);
        System.out.println(wall1.getHeight());
        System.out.println(wall1.getWidth());


        Point point1 = new Point(-1, -1);
        System.out.println(point1.distance());
    }
}
