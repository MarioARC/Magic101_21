public class Dragon extends Enemies
{
    //Instance variables
    private int wingLength;

    //Constructor
    public Dragon(boolean hasClaws, int wingLength)
    {
        super(hasClaws);
        this.wingLength = wingLength;
        checkWingLength();
    }

    //Getters and Setters
    public int getWingLength()
    {
        return wingLength;
    }

    public void setWingLength(int wingLength)
    {
        this.wingLength = wingLength;
        checkWingLength();
    }

    public void checkWingLength()
    {
        if(wingLength < 1)
        {
            wingLength = 1;
        }
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Dragon's wingspan is " + wingLength + ".";
        return output;
    }
} //end Dragon class
