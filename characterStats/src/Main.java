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
        // uses the Player class to create new characters with the given name, job, and sex
        // as seen with player 1, if selection is blank then the program will assign name as Vagabond, job as vagrant and sex as other
        Player player0 = new Player("mDefender", "defender", "male");
        Player player1 = new Player("mRanger", "ranger", "male");
        Player player2 = new Player("mFighter", "fighter", "male");
        Player player3 = new Player("mMage", "mage", "male");
        Player player4 = new Player("mThief", "thief", "male");
        Player player5 = new Player("mVagrant", "", "male");

        Player player6 = new Player("fDefender", "defender", "female");
        Player player7 = new Player("fRanger", "ranger", "female");
        Player player8 = new Player("fFighter", "fighter", "female");
        Player player9 = new Player("fMage", "mage", "female");
        Player player10 = new Player("fThief", "thief", "female");
        Player player11 = new Player("fVagrant", "", "female");

        characters[0] = player0;
        characters[1] = player1;
        characters[2] = player2;
        characters[3] = player3;
        characters[4] = player4;
        characters[5] = player5;
        characters[6] = player6;
        characters[7] = player7;
        characters[8] = player8;
        characters[9] = player9;
        characters[10] = player10;
        characters[11] = player11;


        // uses the Enemy class to create new enemies with the given name and type
        // Enemy enemy1 = new Enemy("Bird", "flyer");

        // "Equips" gear and adds stat buffs
        player0.gearEquipped();
        player1.gearEquipped();
        player2.gearEquipped();
        player3.gearEquipped();
        player4.gearEquipped();
        player5.gearEquipped();
        player6.gearEquipped();
        player7.gearEquipped();
        player8.gearEquipped();
        player9.gearEquipped();
        player10.gearEquipped();
        player11.gearEquipped();

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