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

        Wizard dani = new Wizard(5, 3);
        Wizard karen = new Wizard(2, 10);

//        System.out.println(kyle.toString());
//        kyle.setNumClaws(7);
//        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");

//        Enemies[] goblinEnemies = {kyle, gerome};
//        Enemies[] dragonEnemies = {bob, apalala};
//        Enemies[] golemEnemies = {henry, gaglahm};

        Enemies[] enemies = {kyle, gerome, bob, apalala, henry, gaglahm};
        Wizard[] wizards = {dani, karen};

        for(int i = 0; i < enemies.length; i++)
        {
            System.out.println(enemies[i]);
            count++;
        }
        for(int i = 0; i < wizards.length; i++)
        {
            System.out.println(wizards[i]);
            count++;
        }

        System.out.println("\nThere are " + count + " entities.");
        System.out.println("\nHenry yells: " + henry.yell());
        System.out.println("\nDani tries to cast a spell: " + dani.castSpell());
        System.out.println("\nKaren tries to cast a spell: " + karen.castSpell());
    }
}// end driver
