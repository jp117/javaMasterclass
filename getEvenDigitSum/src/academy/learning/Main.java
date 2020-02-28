package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        int answer = 0;
        if (number < 0){
            return -1;
        }else {
            while (number > 0) {
                if ((number % 10) % 2 == 0) {
                    answer = answer + number % 10;
                }
                number = number / 10;
            }
            return answer;
        }
    }
}
