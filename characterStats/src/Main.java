import java.text.DecimalFormat;

// main class that creates the players and enemy units
public class Main
{
    static final DecimalFormat df = new DecimalFormat("0");
    public static Player[] characters = {null, null, null, null, null, null, null, null, null, null, null, null};
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
                "\nstatus: " + player.status +
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
        // uses the Enemy class to create new enemies with the given name and type
        //Enemy enemy1 = new Enemy("Bird", "flyer");

        UI.newUI();
    }
}