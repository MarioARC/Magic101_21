public class Wizard
{
    //Instance variables
    private int magicStr;

    //Constructor
    public Wizard(int magicStr)
    {
        this.magicStr = magicStr;
    }

    //Getters and Setters
    public int getMagicStr()
    {
        return magicStr;
    }

    public void setMagicStr(int magicStr)
    {
        this.magicStr = magicStr;
    }

    //Brain Methods
    public void checkMagicStr()
    {
        if(magicStr < 0)
        {
            setMagicStr(0);
        }
    }

    //toString
    public String toString()
    {
        String output = "\nThis Wizard's magic strength is " + magicStr + ".";
        return output;
    }
}