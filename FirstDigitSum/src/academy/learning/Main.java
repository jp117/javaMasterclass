package academy.learning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(FirstLastDigitSum(252));
        System.out.println(FirstLastDigitSum(257));
        System.out.println(FirstLastDigitSum(0));
    }

    public static int FirstLastDigitSum(int num) {

        int answer = firstDigit(num) + lastDigit(num);

        return answer;
    }

    public static int firstDigit(int num) {
        while (num >= 10)
            num /= 10;
        return num;
    }

    public static int lastDigit(int num) {
        return (num % 10);
    }
}
