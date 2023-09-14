// list of things that run on program start
public class OnStart
{
    static void onStart()
    {
        // creates and sets equipment
        Objects.createEquipment();

        // creates and sets items
        Objects.createItems();

        // checks if there is a save file present
        Save.checkFile();

        // runs the main ui
        StatUI.newUI();
    }
}
