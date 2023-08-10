// main class that creates the players and enemy units

public class Main
{
    // prints the player's inventory
    public static void printPlayerInventory(Player player)
    {
        System.out.println("\n" + player.name + "'s Inventory");

        for (int i = 0; i < 25; i++)
        {
            if (player.items[i] != null)
            {
                System.out.println("Slot " + (i+1) + ": " + player.items[i].name);
            }
            else
            {
                System.out.printf("\nNo item in Slot %d", i + 1);
            }
        }
        System.out.println("\n");
    }

    // prints the player stats
    public static void printPlayerStats(Player player)
    {
        System.out.printf("name: " + player.name +
                "\nsex: " + player.sex +
                "\njob: " + player.job +
                "\nhealth: " + player.hp +
                "\nstrength: " + player.str +
                "\ndefense: " + player.def +
                "\nconcentration: " + player.con +
                "\nwisdom: " + player.wis +
                "\nspeed: " + player.spd +
                "\nluck: " + player.lck +
                "\nlevel: " + player.level +
                "\nxp: %.0f", player.xp);
    }

    // prints the enemy stats
    public static void printEnemyStats(Enemy enemy)
    {
        System.out.println("name: " + enemy.name +
                "\nhealth: " + enemy.hp +
                "\nstrength: " + enemy.str +
                "\ndefense: " + enemy.def +
                "\nconcentration: " + enemy.con +
                "\nwisdom: " + enemy.wis +
                "\nspeed: " + enemy.spd +
                "\nluck: " + enemy.lck);
    }

    // main function
    public static void main(String[] args)
    {

        // uses the Player class to create new characters with the given name, job, and sex
        Player player1 = new Player("Dude", "fighter", "male");
        Player player2 = new Player("Ma'am", "thief", "female");

        // create and add items to inventory
        Items p1Item1 = new Items("signet ring", true, 25, "a worn signet ring", "ring");
        Items p1Item2 = new Items("tonic", false, 5, "a healing tonic", "item");
        Items p1Item3 = new Items("tent", false, 50, "a camping tent", "item");
        Items p1Item4 = new Items("gloves", true, 15, "a fighter's gloves", "hands");
        player1.items[0] = p1Item1;
        player1.items[1] = p1Item2;
        player1.items[2] = p1Item3;
        player1.items[3] = p1Item4;

        Items p2Item1 = new Items("gold necklace", true, 30, "a gold necklace", "accessory");
        Items p2Item2 = new Items("tonic", false, 5, "a healing tonic", "item");
        Items p2Item3 = new Items("bronze dagger", true, 60, "a bronze dagger", "main weapon");
        Items p2Item4 = new Items("tent", true, 50, "a camping tent", "item");
        player2.items[0] = p2Item1;
        player2.items[1] = p2Item2;
        player2.items[2] = p2Item3;
        player2.items[3] = p2Item4;

        // uses the Enemy class to create new enemies with the given name and type
        Enemy enemy1 = new Enemy("Bird", "flyer");
        Enemy enemy2 = new Enemy("Goblin", "attacker");
        Enemy enemy3 = new Enemy("Warlock", "magician");

        // this block prints the player stats by calling the above method printPlayerStats()
        System.out.println("Player Stats");
        printPlayerStats(player1);
        System.out.println("\n");
        printPlayerStats(player2);
        System.out.println("\n");

        // this block prints the enemy stats by calling the above method printEnemyStats()
        System.out.println("Enemy Stats");
        printEnemyStats(enemy1);
        System.out.println("\n");
        printEnemyStats(enemy2);
        System.out.println("\n");
        printEnemyStats(enemy3);
        System.out.println("\n");

        // this was used to test each player leveling up
        player1.xp = 1022;
        player2.xp = 1022;

        // this while loop checks if player1 has enough xp to go to the next level by checking if their current xp
        // if equal to or greater than 2 to the power of the player's current level, 2^currentLevel
        while(player1.xp >= Math.pow(2, player1.level))
        {
            player1.checkLevelUp();
        }
        System.out.println("\n");

        // this while loop checks if player2 has enough xp to go to the next level by checking if their current xp
        // if equal to or greater than 2 to the power of the player's current level, 2^currentLevel
        while(player2.xp >= Math.pow(2, player2.level))
        {
            player2.checkLevelUp();
        }
        System.out.println("\n");

        // reprinting the player stats to see how they have changed due to leveling up
        printPlayerStats(player1);
        printPlayerStats(player2);

        System.out.println("\n");

        printPlayerInventory(player1);
        printPlayerInventory(player2);
    }
}