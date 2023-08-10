// main class that creates the players and enemy units
public class Main
{
    public static void levelUp(Player player)
    {
        player.checkLevelUp();
    }

    // prints the player's inventory
    public static void printPlayerInventory(Player player)
    {
        System.out.print("\n" + player.name + "'s Inventory\n");

        for (int i = 0; i < 25; i++)
        {
            if (player.inventory[i] != null)
            {
                System.out.println("Slot " + (i+1) + ": " + player.inventory[i].name);
            }
        }
    }

    // prints the player's equipment
    public static void printPlayerEquipment(Player player)
    {
        System.out.print("\n" + player.name + "'s Equipment\n");

        for (int i = 0; i < 10; i++)
        {
            if (player.equipment[i] != null)
            {
                System.out.println(player.equipment[i].equipType + ": " + player.equipment[i].name);
            }
        }
    }

    // prints the player stats
    public static void printPlayerStats(Player player)
    {
        System.out.println("\n" + player.name + "'s Stats");
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
                "\nxp: %.0f\n", player.xp);
    }

    // prints the enemy stats
    public static void printEnemyStats(Enemy enemy)
    {
        System.out.println("\n" + enemy.name + "'s Stats");
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

        // create and add items to inventory and equipment arrays for player1
        Items p1Item1 = new Items("signet ring", true, 25, "wis", 2,  "a worn signet ring", "ring", 1);
        Items p1Item2 = new Items("tonic", false, 5, "no buff", 0, "a healing tonic", "item", 10);
        Items p1Item3 = new Items("tent", false, 50, "no buff", 0, "a camping tent", "item", 3);
        Items p1Item4 = new Items("gloves", true, 15, "spd", 2, "a fighter's gloves", "hands", 1);

        // add to inventory array
        player1.inventory[0] = p1Item2;
        player1.inventory[1] = p1Item3;

        // add to equipment array
        player1.equipment[6] = p1Item1;
        player1.equipment[5] = p1Item4;

        // add to equip slots
        player1.ring = p1Item1;
        player1.hands = p1Item4;

        // create and add items to inventory and equipment arrays for player2
        Items p2Item1 = new Items("gold necklace", true, 30, "lck", 2, "a gold necklace", "neck", 1);
        Items p2Item2 = new Items("tonic", false, 5, "no buff", 0 , "a healing tonic", "item", 10);
        Items p2Item3 = new Items("bronze dagger", true, 60, "str", 1, "a bronze dagger", "mainWeapon", 1);
        Items p2Item4 = new Items("tent", true, 50, "no buff", 0, "a camping tent", "item", 3);

        // add to inventory array
        player2.inventory[0] = p2Item2;
        player2.inventory[1] = p2Item4;

        // add to equipment array
        player2.equipment[0] = p2Item3;
        player2.equipment[3] = p2Item1;

        // add to equip slots
        player2.mainWeapon = p2Item3;
        player2.neck = p2Item1;

        // uses the Enemy class to create new enemies with the given name and type
        Enemy enemy1 = new Enemy("Bird", "flyer");
        Enemy enemy2 = new Enemy("Goblin", "attacker");
        Enemy enemy3 = new Enemy("Warlock", "magician");

        // this block prints the player stats by calling the above method printPlayerStats()
        printPlayerStats(player1);
        printPlayerStats(player2);

        // this block prints the enemy stats by calling the above method printEnemyStats()
        printEnemyStats(enemy1);
        printEnemyStats(enemy2);
        printEnemyStats(enemy3);

        // this was used to test each player leveling up
        player1.xp = 1022;
        player2.xp = 1022;

        // this while loop checks if the player has enough xp to go to the next level by checking if their current xp
        // if equal to or greater than 2 to the power of the player's current level, 2^currentLevel
        levelUp(player1);
        levelUp(player2);

        // prints inventory and equipment
        printPlayerInventory(player1);
        printPlayerInventory(player2);

        printPlayerEquipment(player1);
        printPlayerEquipment(player2);

        // "Equips" gear and adds stat buffs
        player1.itemEquipped();
        player2.itemEquipped();

        // reprinting the player stats to see how they have changed due to leveling up and from buffs
        printPlayerStats(player1);
        printPlayerStats(player2);
    }
}
