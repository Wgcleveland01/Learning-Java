package Week_6.Examples.Letter;

public class Incorrect_Letter {
    private String recipient; private String sender;
    public Incorrect_Letter(String aRecipient, String aSender)
    {
        recipient = "John"; // Error—should use parameter variable sender = "Mary"; // Same error
    }
}

