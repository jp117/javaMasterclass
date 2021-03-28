package academy.learning;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //this creates a new array that takes integers and has a length of 10 elements
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        int [] anotherIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(anotherIntArray[3]);


        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }

        printArray(myIntArray);


        //real life use of arrays below
        int[] myIntegers = getIntegers(5);

        for (int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average was " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
