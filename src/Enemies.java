public abstract class Enemies
{
    private boolean hasClaws;

    public Enemies(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    //Getters and Setters
    public boolean getHasClaws()
    {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    @Override
    public String toString() {
        return "\nDoes this bad boy have claws? " + hasClaws;
    }
}
