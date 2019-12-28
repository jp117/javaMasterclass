package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte challengeByte = 110;
        short challengeShort = 32000;
        int challengeInt = 40000;
        long challengeLong = (50000L + (10L * (challengeByte + challengeShort + challengeInt)));
        System.out.println(challengeLong);

    }
}
