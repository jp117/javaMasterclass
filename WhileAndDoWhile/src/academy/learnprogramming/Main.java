package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count = 0;
        while (count < 6) {
            System.out.println("count is " + count);
            count ++;
        }

        count = 0;
        do {
            System.out.println("Count in do while loop is " + count);
            count ++;
        } while (count < 6);

        int start = 5;
        int end = 20;
        while (start <= end) {
            if (isEvenNumber(start)){
                System.out.println(start);
            }
            start ++;
        }

        System.out.println("Same way to write the code");
        System.out.println("The continue line of code makes it restart the while loop not executing anything under it");

        start = 4;
        end = 20;
        while (start < end){
            start ++;
            if (!isEvenNumber(start)){
                continue;
            }
            System.out.println(start);
        }

        //challenge: Using above code, add functionality to record number of even numbers up to a maximum of 5
        start = 4;
        end = 20;
        count = 0;
        while (start < end){
            start ++;
            if (!isEvenNumber(start)){
                continue;
            }
            count ++;
            if (count == 5){
                System.out.println("The last even number was " + start);
                System.out.println("There have been " + count + " even numbers");
                break;
            }
            System.out.println(start + " is an even number and count is less than 5, so we keep going.");
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0){
            return true;
        } return false;
    }
}
