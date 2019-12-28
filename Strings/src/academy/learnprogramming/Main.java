package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and this is more";
        System.out.println(myString);

        //treats the int as text in lastString
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
