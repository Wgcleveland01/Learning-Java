package Week_6.Examples;

public class Counter {

    //Instance Variables
    private int value;

    //Methods
    public int getValue(){
        return value;
    }

    public void click(){
        value = value + 1;
    }

    public void reset(){
        value = 0;
    }


}
