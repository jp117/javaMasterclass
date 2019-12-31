package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int output = 0;
        int count = 0;
        for (int i = 0; i<1000; i++){

            if (i%3 == 0 && i%5 == 0 && count <= 5) {
                output += i;
                count++;
                System.out.println(output);
            } else if (count > 5) {
                break;
            }
        }
    }
}
