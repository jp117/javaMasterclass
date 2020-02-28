package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 100));
        System.out.println(hasSharedDigit(100, 120));
        System.out.println(hasSharedDigit(5, 9));
        System.out.println(hasSharedDigit(15,20));
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit (int n1, int n2){
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return false;
        }
        else {
            int n11 = (n1 % 10);
            int n12 = ((n1/10)% 10);
            int n21 = (n2 % 10);
            int n22 = ((n2 / 10) % 10);

            if ((n11 == n21) || (n11 == n22) || (n12 == n21) || (n12 == n22)) {
                return true;
            } else return false;
        }
    }
}
