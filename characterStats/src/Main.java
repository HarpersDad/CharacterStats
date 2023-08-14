import java.text.DecimalFormat;

// main class that creates the players and enemy units
public class Main
{
    static final DecimalFormat df = new DecimalFormat("0");
    public static Player[] characters = {null, null, null, null, null, null};
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
        // uses the Player class to create new characters with the given name, job, and sex
        // as seen with player 1, if selection is blank then the program will assign name as Vagabond, job as vagrant and sex as other
        Player player1 = new Player("Defender", "defender", "male");
        Player player2 = new Player("Ranger", "ranger", "male");
        Player player3 = new Player("Fighter", "fighter", "male");

        characters[0] = player1;
        characters[1] = player2;
        characters[2] = player3;

        // uses the Enemy class to create new enemies with the given name and type
        // Enemy enemy1 = new Enemy("Bird", "flyer");

        // "Equips" gear and adds stat buffs
        player1.gearEquipped();

        // print equipment
        // printPlayerEquipment(player1);

        // this block enchants an item/equipment and then re-equips it to the character with the new stats
        // player1Equip1.enchantEquipment("wis", 30);
        // player1.itemEquipped();

        // simulate picking up a tonic
        //player1.inventory[0].numberHeld++;

        // reprinting the player stats to see how they have changed due to leveling up and from buffs
        printPlayerStats(player1);
        printPlayerInventory(player1);

        // buff equipment
        // player1.mainWeapon.enchantEquipment("str", 50);
        // player1.itemEquipped();

        // simulate damage to the player
        player1.hp -= 25;
        System.out.println("\n" + player1.name + " took 25 damage!");

        printPlayerStats(player1);

        // heals player1 using a tonic and checks player1 inventory to update item count
        player1.useItem(player1, player1.tonic);
        player1.checkInventory(player1);

        System.out.println("\n" + player1.name + " used a tonic and healed 20 hp!");

        printPlayerStats(player1);

        player1.addItemToInventory(player1, "", 1);
        player1.addItemToInventory(player1, "tent", 2);

        printPlayerInventory(player1);

        player1.status = "blind";

        printPlayerStats(player1);

        // calls damage method from Player class using the player1 object
        System.out.println(player1.checkHit(player1));

        UI.newUI();
        UI.name.setText(Main.characters[0].name);
        UI.sex.setText(Main.characters[0].sex);
        UI.job.setText(Main.characters[0].job);
        UI.level.setText(String.valueOf(Main.characters[0].level));
        UI.status.setText(Main.characters[0].status);
        UI.hp.setText(String.valueOf(Main.characters[0].hp));
        UI.str.setText(String.valueOf(Main.characters[0].str));
        UI.def.setText(String.valueOf(Main.characters[0].def));
        UI.con.setText(String.valueOf(Main.characters[0].con));
        UI.wis.setText(String.valueOf(Main.characters[0].wis));
        UI.spd.setText(String.valueOf(Main.characters[0].spd));
        UI.lck.setText(String.valueOf(Main.characters[0].lck));
        UI.xp.setText(String.valueOf(df.format(Main.characters[0].xp)));
    }
}