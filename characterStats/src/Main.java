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

    // main function
    public static void main(String[] args)
    {
        // uses the Enemy class to create new enemies with the given name and type
        Enemy enemy = new Enemy("Bird", "flyer");

        // creates equipment
        Equipment.createEquipment();

        // runs the main ui
        StatUI.newUI();
    }
}