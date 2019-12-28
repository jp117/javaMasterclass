package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean output = false;
        if (year > 0 && year < 9999){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 ==0){
                        output = true;
                    }
                } else {
                    output = true;
                }
            }
        }
        return output;
    }
}
