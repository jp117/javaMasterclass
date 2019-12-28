package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double firstVar = 20.00;
        double secondVar = 80.00;
        double thirdVar = 100 * (firstVar + secondVar);
        double remainVar = thirdVar % 40d;
        boolean remainBool = (remainVar == 0) ? true : false;

        System.out.println(remainBool);

        if (remainBool) {
            System.out.println("No remainder");
        }
        else {
            System.out.println("Remainder");
        }
    }
}
