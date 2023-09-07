// main class that creates the players and enemy units
public class Main
{
    // uses the Enemy class to create new enemies with the given name and type
    static Enemy enemy = new Enemy("Bird", "flyer");

    // main function
    public static void main(String[] args)
    {
        // creates and sets equipment
        Variables.createEquipment();

        // creates and sets items
        Variables.createItems();

        // runs the main ui
        StatUI.newUI();
    }
}