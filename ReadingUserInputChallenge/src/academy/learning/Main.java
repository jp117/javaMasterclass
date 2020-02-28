package academy.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        while (i<10) {
            System.out.println("Enter an integer");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                sum = sum += scanner.nextInt();
                i += 1;
            } else {
                System.out.println("Invalid int");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
