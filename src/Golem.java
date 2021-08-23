enum Elements
{
    STONE,
    ICE,
    MAGMA,
    AIR
}

public class Golem extends Enemies
{
    //Instance variables
    private Elements element;

    //Constructor
    public Golem(boolean hasClaws, Elements element)
    {
        super(hasClaws);
        this.element = element;
    }

    //Getters and Setters
    public Elements getElement()
    {
        return element;
    }

    public void setElement(Elements element)
    {
        this.element = element;
    }

    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Golem's element is " + element + ".";
        return output;
    }
} //end Golem class
