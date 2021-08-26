public class MagicDriver
{
    private static int count;

    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(true, 5);
        Goblin gerome = new Goblin(false, 0);

        Dragon bob = new Dragon(true, 0, false);
        Dragon apalala = new Dragon(false, 10, true);

        Golem henry = new Golem(false, Elements.ICE);
        Golem gaglahm = new Golem(false, Elements.MAGMA);

        Wizard dani = new Wizard(5);
        Wizard karen = new Wizard(2);

        System.out.println(dani);

//        System.out.println(kyle.toString());
//        kyle.setNumClaws(7);
//        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");

//        Enemies[] goblinEnemies = {kyle, gerome};
//        Enemies[] dragonEnemies = {bob, apalala};
//        Enemies[] golemEnemies = {henry, gaglahm};

        Enemies[] enemies = {kyle, gerome, bob, apalala, henry, gaglahm};

        for(int i = 0; i < enemies.length; i++)
        {
            System.out.println(enemies[i]);
        }

        System.out.println("\n" + henry.yell());

    }
}// end driver
