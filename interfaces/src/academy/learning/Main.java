package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;

        // Can also do Deskphone timsPhone; instead of ITelephone

        timsPhone = new DeskPhone(1234567);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();


        // because timsPhone is ITelephone, it can be anything
        // that is an implementation if instance ITelephone
        timsPhone = new MobilePhone(7654321);
        timsPhone.powerOn();
        timsPhone.callPhone(7654321);
        timsPhone.answer();
    }
}
