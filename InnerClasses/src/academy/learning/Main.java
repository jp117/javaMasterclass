package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

        // this doesn't work to make a new gearbox
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);

        //This doesn't work either.  You need to reference the gearbox to make a gear
        //Gearbox.Gear third = new Gearbox.Gear(3, 17.8);
    }
}
