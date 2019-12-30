package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("It was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
                //technically you don't need the last break for default but better to leave it
        }

        //challenge
        char challengeValue = 'D';
        switch(challengeValue) {
            case 'A':
                System.out.println("Char is A");
                break;

            case 'B':
                System.out.println("Char is B");
                break;

            case 'C':
                System.out.println("Char is C");
                break;

            case 'D':
                System.out.println("Char is D");
                break;

            case 'E':
                System.out.println("Char is E");
                break;

            default:
                System.out.println("Char is not A B C D or E");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
