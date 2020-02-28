package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        number = number / 2;
        System.out.println("number = " + number);

        numberAsString += 1;
        System.out.println("numberAsString is now equal to: " + numberAsString);

        //now doing doubles below
        String numdoubleString = "2018.125";
        System.out.println(numdoubleString);

        double numdouble = Double.parseDouble(numdoubleString);
        System.out.println(numdouble);

        numdoubleString += 1;
        numdouble += 1;

        System.out.println(numdoubleString);
        System.out.println(numdouble);

    }
}
