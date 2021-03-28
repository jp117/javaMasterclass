package academy.learning;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    // this is the contract, class written that follows this interface
    //must have these types
}
