package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = Math.round(minutes / 60 / 24 / 365);
            long days = (minutes / 60 / 24) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
