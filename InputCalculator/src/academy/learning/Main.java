package academy.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true){
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                count ++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        long average = Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
