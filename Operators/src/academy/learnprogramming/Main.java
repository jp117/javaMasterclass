package academy.learnprogramming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore < 90) || (secondTopScore > 75)) {
            System.out.println("One of or both of the items is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This works bc logical assignment");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("You can reassign value on booleans, so be careful, this wouldn't show if you did it right");
        }

        boolean doingRight = false;
        if (doingRight == true) {
            System.out.println("You won't see this");
        }

        isCar = false;
        if (!isCar) {
            System.out.println("Cool");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Was car is true");
        }
    }
}
