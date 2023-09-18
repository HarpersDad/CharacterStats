import javax.swing.*;
import java.awt.*;

public class UIMethods
{
    // functions

    // creates a new character with the defined attributes
    public static void createPlayer(String name, String job, String sex, String equip)
    {
        Player player = new Player(name, job, sex, equip);

        for (int i = 0; i < Player.characters.length; i++)
        {
            if (Player.characters[i] == null)
            {
                Player.characters[i] = player;
                Player.characters[i].gearEquipped();
                break;
            }
        }

        StatUI.characterBox.addItem(name);
    }

    // create and set Text Field bounds
    public static void setTextBounds(JFrame myFrame, JTextField myText, int x, int y, int w, int h)
    {
        myText.setFont(new Font("Arial", Font.PLAIN, 12));
        myText.setBounds(x, y, w, h);
        myText.setForeground(Color.BLACK);
        myFrame.getContentPane().add(myText);
    }

    // create and set Button bounds
    public static void setButtonBounds(JFrame myFrame, Button myButton, int x, int y, int w, int h)
    {
        myButton.setFont(new Font("Arial", Font.PLAIN, 12));
        myButton.setBounds(x, y, w, h);
        myButton.setForeground(Color.BLACK);
        myFrame.getContentPane().add(myButton);
    }

    // create and set combo box bounds
    public static void setBoxBounds(JFrame myFrame, JComboBox<String> myBox, int x, int y, int w, int h)
    {
        myBox.setFont(new Font("Arial", Font.PLAIN, 12));
        myBox.setBounds(x, y, w, h);
        myBox.setForeground(Color.BLACK);
        myFrame.getContentPane().add(myBox);
    }

    // create and set character data labels
    public static void setLabelBounds(JFrame myFrame, JLabel myLabel, int x, int y, int w, int h)
    {
        myLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        myLabel.setBounds(x, y, w, h);
        myLabel.setForeground(Color.white);
        myFrame.getContentPane().add(myLabel);
    }

    // adds the stat and equipment data to the ui from the character array in Main
    static void fillUI()
    {
        // updates ui data accordingly
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
    }

    // gets the equipment information for the currently selected character
    static void getEquipInfo()
    {
        // weapon
        StatUI.equipmentInformation[0] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].mainWeapon.cost);
        StatUI.equipmentInformation[1] = Player.characters[StatUI.characterBox.getSelectedIndex()].mainWeapon.buff;
        StatUI.equipmentInformation[2] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].mainWeapon.buffAmount);
        StatUI.equipmentInformation[3] = Player.characters[StatUI.characterBox.getSelectedIndex()].mainWeapon.description;

        // offhand
        StatUI.equipmentInformation[4] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].offHand.cost);
        StatUI.equipmentInformation[5] = Player.characters[StatUI.characterBox.getSelectedIndex()].offHand.buff;
        StatUI.equipmentInformation[6] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].offHand.buffAmount);
        StatUI.equipmentInformation[7] = Player.characters[StatUI.characterBox.getSelectedIndex()].offHand.description;

        // head
        StatUI.equipmentInformation[8] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].head.cost);
        StatUI.equipmentInformation[9] = Player.characters[StatUI.characterBox.getSelectedIndex()].head.buff;
        StatUI.equipmentInformation[10] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].head.buffAmount);
        StatUI.equipmentInformation[11] = Player.characters[StatUI.characterBox.getSelectedIndex()].head.description;

        // neck
        StatUI.equipmentInformation[12] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].neck.cost);
        StatUI.equipmentInformation[13] = Player.characters[StatUI.characterBox.getSelectedIndex()].neck.buff;
        StatUI.equipmentInformation[14] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].neck.buffAmount);
        StatUI.equipmentInformation[15] = Player.characters[StatUI.characterBox.getSelectedIndex()].neck.description;

        // chest
        StatUI.equipmentInformation[16] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].chest.cost);
        StatUI.equipmentInformation[17] = Player.characters[StatUI.characterBox.getSelectedIndex()].chest.buff;
        StatUI.equipmentInformation[18] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].chest.buffAmount);
        StatUI.equipmentInformation[19] = Player.characters[StatUI.characterBox.getSelectedIndex()].chest.description;

        // hands
        StatUI.equipmentInformation[20] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].hands.cost);
        StatUI.equipmentInformation[21] = Player.characters[StatUI.characterBox.getSelectedIndex()].hands.buff;
        StatUI.equipmentInformation[22] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].hands.buffAmount);
        StatUI.equipmentInformation[23] = Player.characters[StatUI.characterBox.getSelectedIndex()].hands.description;

        // ring
        StatUI.equipmentInformation[24] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].ring.cost);
        StatUI.equipmentInformation[25] = Player.characters[StatUI.characterBox.getSelectedIndex()].ring.buff;
        StatUI.equipmentInformation[26] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].ring.buffAmount);
        StatUI.equipmentInformation[27] = Player.characters[StatUI.characterBox.getSelectedIndex()].ring.description;

        // belt
        StatUI.equipmentInformation[28] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].belt.cost);
        StatUI.equipmentInformation[29] = Player.characters[StatUI.characterBox.getSelectedIndex()].belt.buff;
        StatUI.equipmentInformation[30] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].belt.buffAmount);
        StatUI.equipmentInformation[31] = Player.characters[StatUI.characterBox.getSelectedIndex()].belt.description;

        // legs
        StatUI.equipmentInformation[32] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].legs.cost);
        StatUI.equipmentInformation[33] = Player.characters[StatUI.characterBox.getSelectedIndex()].legs.buff;
        StatUI.equipmentInformation[34] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].legs.buffAmount);
        StatUI.equipmentInformation[35] = Player.characters[StatUI.characterBox.getSelectedIndex()].legs.description;

        // feet
        StatUI.equipmentInformation[36] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].feet.cost);
        StatUI.equipmentInformation[37] = Player.characters[StatUI.characterBox.getSelectedIndex()].feet.buff;
        StatUI.equipmentInformation[38] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].feet.buffAmount);
        StatUI.equipmentInformation[39] = Player.characters[StatUI.characterBox.getSelectedIndex()].feet.description;

        // back
        StatUI.equipmentInformation[40] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].back.cost);
        StatUI.equipmentInformation[41] = Player.characters[StatUI.characterBox.getSelectedIndex()].back.buff;
        StatUI.equipmentInformation[42] = Integer.toString(Player.characters[StatUI.characterBox.getSelectedIndex()].back.buffAmount);
        StatUI.equipmentInformation[43] = Player.characters[StatUI.characterBox.getSelectedIndex()].back.description;

        // calls the method
        setEquipInfo();
    }

    // adds character names to the combo-box from the character array in Main
    static void fillComboBox()
    {
        if (Player.characters[0] != null)
        {
            StatUI.characterBox.addItem(Player.characters[0].name);
        }
        if (Player.characters[1] != null)
        {
            StatUI.characterBox.addItem(Player.characters[1].name);
        }
        if (Player.characters[2] != null)
        {
            StatUI.characterBox.addItem(Player.characters[2].name);
        }
        if (Player.characters[3] != null)
        {
            StatUI.characterBox.addItem(Player.characters[3].name);
        }
        if (Player.characters[4] != null)
        {
            StatUI.characterBox.addItem(Player.characters[4].name);
        }
        if (Player.characters[5] != null)
        {
            StatUI.characterBox.addItem(Player.characters[5].name);
        }
        if (Player.characters[6] != null)
        {
            StatUI.characterBox.addItem(Player.characters[6].name);
        }
        if (Player.characters[7] != null)
        {
            StatUI.characterBox.addItem(Player.characters[7].name);
        }
        if (Player.characters[8] != null)
        {
            StatUI.characterBox.addItem(Player.characters[8].name);
        }
        if (Player.characters[9] != null)
        {
            StatUI.characterBox.addItem(Player.characters[9].name);
        }
        if (Player.characters[10] != null)
        {
            StatUI.characterBox.addItem(Player.characters[10].name);
        }
        if (Player.characters[11] != null)
        {
            StatUI.characterBox.addItem(Player.characters[11].name);
        }
    }
    static void setEquipInfo()
    {
        // presents the data from the above method when the cursor is over the name of the piece of equipment
        // main weapon
        StatUI.mainWeapon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.mainWeapon.setToolTipText("<html>Price: " + StatUI.equipmentInformation[0] +
                "<br>\nBuff: " + StatUI.equipmentInformation[1] + " + " + StatUI.equipmentInformation[2] +
                "<br>\n Description: " + StatUI.equipmentInformation[3] + "</html>");

        // offhand
        StatUI.offHand.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.offHand.setToolTipText("<html>Price: " + StatUI.equipmentInformation[4] +
                "<br>\nBuff: " + StatUI.equipmentInformation[5] + " + " + StatUI.equipmentInformation[6] +
                "<br>\n Description: " + StatUI.equipmentInformation[7] + "</html>");

        // head
        StatUI.head.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.head.setToolTipText("<html>Price: " + StatUI.equipmentInformation[8] +
                "<br>\nBuff: " + StatUI.equipmentInformation[9] + " + " + StatUI.equipmentInformation[10] +
                "<br>\n Description: " + StatUI.equipmentInformation[11] + "</html>");

        // neck
        StatUI.neck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.neck.setToolTipText("<html>Price: " + StatUI.equipmentInformation[12] +
                "<br>\nBuff: " + StatUI.equipmentInformation[13] + " + " + StatUI.equipmentInformation[14] +
                "<br>\n Description: " + StatUI.equipmentInformation[15] + "</html>");

        // chest
        StatUI.chest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.chest.setToolTipText("<html>Price: " + StatUI.equipmentInformation[16] +
                "<br>\nBuff: " + StatUI.equipmentInformation[17] + " + " + StatUI.equipmentInformation[18] +
                "<br>\n Description: " + StatUI.equipmentInformation[19] + "</html>");

        // hands
        StatUI.hands.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.hands.setToolTipText("<html>Price: " + StatUI.equipmentInformation[20] +
                "<br>\nBuff: " + StatUI.equipmentInformation[21] + " + " + StatUI.equipmentInformation[22] +
                "<br>\n Description: " + StatUI.equipmentInformation[23] + "</html>");

        // ring
        StatUI.ring.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.ring.setToolTipText("<html>Price: " + StatUI.equipmentInformation[24] +
                "<br>\nBuff: " + StatUI.equipmentInformation[25] + " + " + StatUI.equipmentInformation[26] +
                "<br>\n Description: " + StatUI.equipmentInformation[27] + "</html>");

        // belt
        StatUI.belt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.belt.setToolTipText("<html>Price: " + StatUI.equipmentInformation[28] +
                "<br>\nBuff: " + StatUI.equipmentInformation[29] + " + " + StatUI.equipmentInformation[30] +
                "<br>\n Description: " + StatUI.equipmentInformation[31] + "</html>");

        // legs
        StatUI.legs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.legs.setToolTipText("<html>Price: " + StatUI.equipmentInformation[32] +
                "<br>\nBuff: " + StatUI.equipmentInformation[33] + " + " + StatUI.equipmentInformation[34] +
                "<br>\n Description: " + StatUI.equipmentInformation[35] + "</html>");

        // feet
        StatUI.feet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.feet.setToolTipText("<html>Price: " + StatUI.equipmentInformation[36] +
                "<br>\nBuff: " + StatUI.equipmentInformation[37] + " + " + StatUI.equipmentInformation[38] +
                "<br>\n Description: " + StatUI.equipmentInformation[39] + "</html>");

        // back
        StatUI.back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        StatUI.back.setToolTipText("<html>Price: " + StatUI.equipmentInformation[40] +
                "<br>\nBuff: " + StatUI.equipmentInformation[41] + " + " + StatUI.equipmentInformation[42] +
                "<br>\n Description: " + StatUI.equipmentInformation[43] + "</html>");
    }
}
