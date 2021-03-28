package academy.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int[] myIntegers = getIntegers(5);
        myIntegers = sortIntegersDescending(myIntegers);
        printArray(myIntegers);
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("At index " + i + ", int equals " + array[i] + ".\r");
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntegersDescending(int[] array){

        int[] sorted = new int[array.length];
        int j = 0;
        Arrays.sort(array, 0, array.length);
        for(int i=array.length-1; i>=0; i--){
            sorted[j] = array[i];
            j++;
        }
        return sorted;
    }
}
