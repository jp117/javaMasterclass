package academy.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter a number");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                if (number > maximum){
                    maximum = number;
                }
                if (number < minimum){
                    minimum = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The minimum was: " + minimum);
        System.out.println("The maximum was: " + maximum);
        scanner.close();
    }
}
