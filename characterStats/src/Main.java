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

        // for loop cycles through inventory array
        for (int i = 0; i < 25; i++)
        {
            // prints item at array[i] and number held
            if (player.inventory[i] != null)
            {
                System.out.println("Slot " + (i+1) + ": " + player.inventory[i].name + " x " + player.inventory[i].numberHeld);
            }
        }
    }

    // prints the player's equipment
    public static void printPlayerEquipment(Player player)
    {
        System.out.print("\n" + player.name + "'s Equipment\n");

        // for loop that cycles through equipment array
        for (int i = 0; i < 10; i++)
        {
            // prints equipment at array[i]
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
        // as seen with player 1, if selection is blank then the program will assign name as Vagabond, job as vagrant and sex as other
        Player player1 = new Player("defender", "defender", "male");
        Player player2 = new Player("fighter", "fighter", "male");

        // uses the Enemy class to create new enemies with the given name and type
        Enemy enemy1 = new Enemy("Bird", "flyer");
        Enemy enemy2 = new Enemy("Goblin", "attacker");
        Enemy enemy3 = new Enemy("Warlock", "magician");

        // this block prints the player stats by calling the above method printPlayerStats()
        //printPlayerStats(player1);
        //printPlayerStats(player2);

        // this block prints the enemy stats by calling the above method printEnemyStats()
        //printEnemyStats(enemy1);
        //printEnemyStats(enemy2);
        //printEnemyStats(enemy3);

        // this was used to test each player leveling up
        player1.xp = 1022;
        player2.xp = 1022;

        // this while loop checks if the player has enough xp to go to the next level by checking if their current xp
        // if equal to or greater than 2 to the power of the player's current level, 2^currentLevel
        levelUp(player1);
        levelUp(player2);

        printPlayerStats(player1);
        printPlayerStats(player2);

        // "Equips" gear and adds stat buffs
        player1.gearEquipped();
        player2.gearEquipped();

        // print equipment
        printPlayerEquipment(player1);
        printPlayerEquipment(player2);

        // this block enchants an item/equipment and then re-equips it to the character with the new stats
        //player1Equip1.enchantEquipment("wis", 30);
        //player1.itemEquipped();

        // reprinting the player stats to see how they have changed due to leveling up and from buffs
        printPlayerStats(player1);
        //printPlayerStats(player2);

        // buff equipment
        //player1.mainWeapon.enchantEquipment("str", 50);
        //player1.itemEquipped();

        player1.hp -= 25;

        printPlayerStats(player1);
        //printPlayerStats(player2);

        // heals player1 using a tonic and checks player1 inventory to update item count
        player1.useItem(player1, player1.tonic);
        player1.checkInventory(player1);

        printPlayerStats(player1);

        printPlayerInventory(player1);

        // calls damage method from Player class using the player1 object
        //System.out.println(player1.checkHit(player1));
    }
}