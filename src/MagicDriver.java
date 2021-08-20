public class MagicDriver
{
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(true, 5);
        Goblin gerome = new Goblin(false, 0);

        Dragon bob = new Dragon(true, 0);
        Dragon apalala = new Dragon(false, 10);

        Golem henry = new Golem(false, Elements.ICE);
        Golem gaglahm = new Golem(false, Elements.MAGMA);

//        System.out.println(kyle.toString());
//        kyle.setNumClaws(7);
//        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");

        Enemies[] goblinEnemies = {kyle, gerome};
        Enemies[] dragonEnemies = {bob, apalala};
        Enemies[] golemEnemies = {henry, gaglahm};

        for(int i = 0; i < goblinEnemies.length; i++)
        {
            System.out.println(goblinEnemies[i]);
            System.out.println(dragonEnemies[i]);
            System.out.println(golemEnemies[i]);
        }

    }
}
