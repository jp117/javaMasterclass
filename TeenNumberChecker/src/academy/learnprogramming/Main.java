package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen (int one, int two, int three) {
        return isTeen(one) || isTeen(two) || isTeen(three);
    }

    public static boolean isTeen (int one) {
        return 13 <= one && one <= 19;
    }
}
