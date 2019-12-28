package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean isDogBarking, int hourfOfDay){
        if (0 > hourfOfDay  || hourfOfDay > 23) {
            return false;
        }
        if (isDogBarking) {
            if (hourfOfDay < 8) {
                return true;
            } else if (hourfOfDay > 22) {
                return true;
            }
            return false;
        }
        return false;
    }
}
