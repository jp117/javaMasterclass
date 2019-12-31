package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int output = 0;
        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    output += i;
                }
            } return output;

        } else {
            return -1;
        }
    }
}
