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
    public int getMagicDmg()
    {
        return magicStr;
    }

    public void setMagicDmg(int magicStr)
    {
        this.magicStr = magicStr;
    }

}