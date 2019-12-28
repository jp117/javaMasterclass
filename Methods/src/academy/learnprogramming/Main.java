package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

/*
        This is one way to do it

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
 */
        // this is the shorter way

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        System.out.println(calculateScoreNew(true, 500, 5, 100));


        /*
            challenge:
            Create a method called displayHighScorePosition
            it should take a players name as a parameter and a 2nd parameter as position in the high score table
            you should display the players name along with a message like "managed to get into position" and the
            position they got to and a further message " on the high score table"

            create a 2nd method called calculateHighScorePosition
            it should be sent one argument only, the player score
            it should return an int
            the return data should be
            1 if the score is > 1000
            2 if the score is > 500 and < 1000
            3 if the score is > 100 and > 500
            4 for all other cases

            call both methods and display the results of the following
            a score of 1500, 900, 400 and 50

         */

        System.out.println(displayHighScorePosition("John", calculateHighScorePosition(1500)));
        System.out.println(displayHighScorePosition("Chris", calculateHighScorePosition(900)));
        System.out.println(displayHighScorePosition("Joe", calculateHighScorePosition(400)));
        System.out.println(displayHighScorePosition("Joy", calculateHighScorePosition(50)));


    }

    //method with void does not return data, just does stuff
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    // method to return data, don't use void
    public  static int calculateScoreNew(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static String displayHighScorePosition(String name, int position){
        return name + " managed to get into position " + position + " on the high score table";
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position =  2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
