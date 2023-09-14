// java file for UI button press methods

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buttons
{
    // function for leveling a character
    static void giveXP()
    {
        // adds the xp gain to the ui
        Player.characters[StatUI.characterBox.getSelectedIndex()].xp += 1;

        // checks if the player has enough xp to level up
        Player.levelUp(Player.characters[StatUI.characterBox.getSelectedIndex()]);

        // if the player levels up, this updates the ui to reflect the changes
        StatUI.name.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].name);
        StatUI.sex.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].sex);
        StatUI.job.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].job);
        StatUI.level.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].level));
        StatUI.gold.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].gold));
        StatUI.status.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].status);
        StatUI.hp.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].hp));
        StatUI.str.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].str));
        StatUI.def.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].def));
        StatUI.con.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].con));
        StatUI.wis.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].wis));
        StatUI.spd.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].spd));
        StatUI.lck.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].lck));
        StatUI.xp.setText(String.valueOf(Objects.df.format(Player.characters[StatUI.characterBox.getSelectedIndex()].xp)));

        StatUI.xpToNextLevel.setText(String.valueOf(
                Objects.df.format(Player.characters[StatUI.characterBox.getSelectedIndex()].xpToNextLevel)
        ));
    }

    // function for character selection
    static void selectCharacter()
    {
        // when a character is selected, this updates the stats and equipment
        StatUI.name.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].name);
        StatUI.sex.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].sex);
        StatUI.job.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].job);
        StatUI.level.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].level));
        StatUI.gold.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].gold));
        StatUI.status.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].status);
        StatUI.hp.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].hp));
        StatUI.str.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].str));
        StatUI.def.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].def));
        StatUI.con.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].con));
        StatUI.wis.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].wis));
        StatUI.spd.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].spd));
        StatUI.lck.setText(String.valueOf(Player.characters[StatUI.characterBox.getSelectedIndex()].lck));
        StatUI.xp.setText(String.valueOf(Objects.df.format(Player.characters[StatUI.characterBox.getSelectedIndex()].xp)));

        StatUI.xpToNextLevel.setText(String.valueOf(
                Objects.df.format(Player.characters[StatUI.characterBox.getSelectedIndex()].xpToNextLevel)
        ));

        // sets player job and equipment on creation
        Jobs.assignJob(Player.characters[StatUI.characterBox.getSelectedIndex()]);
        Equipment.setEquipment(Player.characters[StatUI.characterBox.getSelectedIndex()]);

        StatUI.mainWeapon.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].mainWeapon.name);
        StatUI.offHand.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].offHand.name);
        StatUI.head.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].head.name);
        StatUI.neck.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].neck.name);
        StatUI.chest.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].chest.name);
        StatUI.hands.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].hands.name);
        StatUI.ring.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].ring.name);
        StatUI.belt.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].belt.name);
        StatUI.legs.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].legs.name);
        StatUI.feet.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].feet.name);
        StatUI.back.setText(Player.characters[StatUI.characterBox.getSelectedIndex()].back.name);

        // calls the method
        StatUI.getEquipInfo();
    }

    // function for creating a character
    static void createCharacter()
    {
        if (Player.characters[Player.characters.length - 1] == null)
        {
            CreateUI.notAdded = true;
            CreateUI.createPlayerUI();
            CreateUI.create.setEnabled(true);
        }
        else
        {
            StatUI.createNewCharacter.setEnabled(false);
        }
    }

    // you guessed it, function for deleting a character
    static void deleteCharacter()
    {
        JSONObject ob;

        File dataFile = new File("saveData.json");
        try {
            ob = (JSONObject) new JSONParser().parse(new FileReader(dataFile));
        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }

        ob.remove(Integer.toString(StatUI.characterBox.getSelectedIndex()));
        Player.characters[StatUI.characterBox.getSelectedIndex()] = (null);

        for(int i = StatUI.characterBox.getSelectedIndex(); i < Player.characters.length-1; i++)
        {
            Player.characters[i] = Player.characters[i+1];
        }

        StatUI.characterBox.removeItemAt(StatUI.characterBox.getSelectedIndex());
    }

    // function for loading character data
    static void loadCharacterData()
    {
        System.out.println("loading data");

        for (int i = 0; i < Player.characters.length; i++)
        {
            Save.loadStats(i);
        }

        Equipment.equipGear();

        // keeps the combo-box from adding duplicate entries when pressing load multiple times
        if (!StatUI.resetBox)
        {
            StatUI.characterBox.removeAllItems();

            StatUI.fillComboBox();
            StatUI.fillUI();
            StatUI.getEquipInfo();

            StatUI.resetBox = true;
        }

        StatUI.saveData.setEnabled(true);
        StatUI.levelUpButton.setEnabled(true);
        StatUI.deleteCharacter.setEnabled(true);
        StatUI.createNewCharacter.setEnabled(true);
        StatUI.loadData.setEnabled(false);
    }

    // function for saving character data
    static void saveCharacterData()
    {
        System.out.println("saving data");

        // for loop that calls the save stat method for each available character
        for (int i = 0; i < Player.characters.length; i++)
        {
            if (Player.characters[i] != null)
            {
                Save.saveStats(Player.characters[i], i);
            }

            Save.saveAsJson();
        }
    }
}
