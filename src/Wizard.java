public class Wizard
{
    //Instance variables
    private int magicStr;
    private int magicPts;

    //Constructor
    public Wizard(int magicStr, int magicPts)
    {
        this.magicStr = magicStr;
        this.magicPts = magicPts;
        checkMagicStr();
        checkMagicPts();
    }

    //Getters and Setters
    public int getMagicStr()
    {
        return magicStr;
    }

    public void setMagicStr(int magicStr)
    {
        this.magicStr = magicStr;
        checkMagicStr();
    }

    public int getMagicPts()
    {
        return magicPts;
    }

    public void setMagicPts(int magicPts)
    {
        this.magicPts = magicPts;
        checkMagicPts();
    }

    //Brain Methods
    public void checkMagicStr()
    {
        if(magicStr < 0)
        {
            setMagicStr(0);
        }
    }

    public void checkMagicPts()
    {
        if(magicPts < 0)
        {
            setMagicPts(0);
        }
    }

    public void castSpell()
    {
        if(magicPts >= 5)
        {
            System.out.println("Casted spell");
        }
        else
        {
            System.out.println("Not enough MP");
        }
    }

    //toString
    public String toString()
    {
        String output = "\nThis Wizard's magic strength is " + magicStr + ".";
        return output;
    }
}