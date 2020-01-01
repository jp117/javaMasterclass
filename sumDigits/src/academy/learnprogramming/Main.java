package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(34543245));
    }

    public static int sumDigits(int number){
        int sum = 0;
        if (number < 10){
            return -1;
        } else {
            while (number > 0){
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }
    }
}
