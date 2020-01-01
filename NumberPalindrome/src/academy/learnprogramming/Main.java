package academy.learnprogramming;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int number) {
        //Init my variable reverse
        int reverse = 0;

        // Turn a negative number to a positive one
        if (number < 0){
            number = number * -1;
        }
        // Save the first number in a new variable
        int firstNumber = number;

        // A while statements to extract and reverse the digits
        while (number > 0) {

            int lastDigit = number % 10;
            number /= 10;
            reverse = (reverse*10) + lastDigit;
        }

        //Checking if the number is a palindrome
        if (firstNumber == reverse) {
            return true;
        }
        else return false;

    }
}
