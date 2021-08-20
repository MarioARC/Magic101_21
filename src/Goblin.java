public class Goblin extends Enemies
{
    //Instance variables
    private int numClaws;
    //Constructor
    public Goblin(boolean hasClaws, int numClaws)
    {
        super(hasClaws);
        this.numClaws = numClaws;
        checkNumClaws();
    }
    //Getters and Setters

    public int getNumClaws()
    {
        return numClaws;
    }

    public void setNumClaws(int numClaws)
    {
        this.numClaws = numClaws;
        checkNumClaws();
    }

    //Brain Methods
    public void checkNumClaws()
    {
        if(getHasClaws() == true && numClaws < 1)
        {
            numClaws = 1;
        }
        else if(getHasClaws() == false && numClaws > 0)
        {
            numClaws = 0;
        }
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Goblin has " + numClaws + " claws.";
        return output;
    }
} //end Goblin class
