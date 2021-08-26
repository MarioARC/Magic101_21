public class Dragon extends Enemies
{
    //Instance variables
    private int wingLength;
    private boolean breatheFire;

    //Constructor
    public Dragon(boolean hasClaws, int wingLength, boolean breatheFire)
    {
        super(hasClaws);
        this.wingLength = wingLength;
        this.breatheFire = breatheFire;
    }

    //Getters and Setters
    public int getWingLength()
    {
        return wingLength;
    }

    public void setWingLength(int wingLength)
    {
        this.wingLength = wingLength;
    }

    public boolean getBreatheFire()
    {
        return breatheFire;
    }

    public void setBreatheFire(boolean breatheFire)
    {
        this.breatheFire = breatheFire;
    }

    //Brain Methods
    public void checkWingLength()
    {
        if(wingLength < 1)
        {
            setWingLength(1);
        }
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Dragon's wingspan is " + wingLength + ".";
        output += "\nCan he breathe fire? " + breatheFire;
        return output;
    }
} //end Dragon class
