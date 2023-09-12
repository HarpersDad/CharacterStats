import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StatUI
{
    public static void newUI()
    {
        // initialize combo box
        characterBox = new JComboBox<>();

        // creates program window
        frame.setTitle("RPG TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((x/2) + 50, y);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.getHSBColor(0.66f,.80f,.80f));

        // set bounds for buttons and combo boxes
        characterBox.setBounds((x/4) - 300/4 + 5, (y/4) - (80), 80, 20);
        levelUpButton.setBounds(x/4 - 80, (y/4) + 225, 160,25);
        saveData.setBounds((x/4) - 300/3 + 5, (y/4) - 25, 80,25);
        loadData.setBounds((x/4) - 300/3 + 5, (y/4) + 10, 80,25);
        createNewCharacter.setBounds((x/4) - 300/3 + 120, (y/4) - (25), 80,25);
        deleteCharacter.setBounds((x/4) - 300/3 + 120, (y/4) + 10, 80,25);

        // character data block
        setLabelBounds(sex, (x/4) + 75, (y/4) - (60), jLabelW, jLabelH);
        setLabelBounds(job, (x/4) + 75, (y/4) - (80), jLabelW, jLabelH);
        setLabelBounds(level, (x/4) - 300/4 + 35, (y/4) - (60), jLabelW, jLabelH);

        // stat block
        setLabelBounds(gold, (x/4) - 300/4, (y/4) + (50), jLabelW, jLabelH);
        setLabelBounds(status, (x/4) - 300/4, (y/4) + (65), jLabelW, jLabelH);
        setLabelBounds(hp, (x/4) - 300/4, (y/4) + 80, jLabelW, jLabelH);
        setLabelBounds(str, (x/4) - 300/4, (y/4) + (95), jLabelW, jLabelH);
        setLabelBounds(def, (x/4) - 300/4, (y/4) + (110), jLabelW, jLabelH);
        setLabelBounds(con, (x/4) - 300/4, (y/4) + (125), jLabelW, jLabelH);
        setLabelBounds(wis, (x/4) - 300/4, (y/4) + (140), jLabelW, jLabelH);
        setLabelBounds(spd, (x/4) - 300/4, (y/4) + (155), jLabelW, jLabelH);
        setLabelBounds(lck, (x/4) - 300/4, (y/4) + (170), jLabelW, jLabelH);
        setLabelBounds(xp, (x/4) - 300/4, (y/4) + (185), jLabelW, jLabelH);
        setLabelBounds(xpToNextLevel, (x/4) - 300/4, (y/4) + (200), jLabelW, jLabelH);

        // equipment
        setLabelBounds(mainWeapon, (x/2) - 300/4 - 20, (y/4) + (50), jLabelW, jLabelH);
        setLabelBounds(offHand, (x/2) - 300/4 - 20, (y/4) + (65), jLabelW, jLabelH);
        setLabelBounds(head, (x/2) - 300/4 - 20, (y/4) + 80, jLabelW, jLabelH);
        setLabelBounds(neck, (x/2) - 300/4 - 20, (y/4) + (95), jLabelW, jLabelH);
        setLabelBounds(chest, (x/2) - 300/4 - 20, (y/4) + (110), jLabelW, jLabelH);
        setLabelBounds(hands, (x/2) - 300/4 - 20, (y/4) + (125), jLabelW, jLabelH);
        setLabelBounds(ring, (x/2) - 300/4 - 20, (y/4) + (140), jLabelW, jLabelH);
        setLabelBounds(belt, (x/2) - 300/4 - 20, (y/4) + (155), jLabelW, jLabelH);
        setLabelBounds(legs, (x/2) - 300/4 - 20, (y/4) + (170), jLabelW, jLabelH);
        setLabelBounds(feet, (x/2) - 300/4 - 20, (y/4) + (185), jLabelW, jLabelH);
        setLabelBounds(back, (x/2) - 300/4 - 20, (y/4) + (200), jLabelW, jLabelH);

        // top block labels
        setLabelBounds(nameL, (x/4) - 300/3 - 15, (y/4) - (80), jLabelW, jLabelH);
        setLabelBounds(sexL, (x/4) - 300/3 + 130, (y/4) - (60), jLabelW, jLabelH);
        setLabelBounds(jobL, (x/4) - 300/3 + 130, (y/4) - (80), jLabelW, jLabelH);
        setLabelBounds(levelL, (x/4) - 300/3 - 15, (y/4) - (60), jLabelW, jLabelH);

        // lower block labels
        setLabelBounds(goldL, (x/4) - 300/3 - 25, (y/4) + (50), jLabelW, jLabelH);
        setLabelBounds(statusL, (x/4) - 300/3 - 25, (y/4) + (65), jLabelW, jLabelH);
        setLabelBounds(hpL, (x/4) - 300/3 - 25, (y/4) + (80), jLabelW, jLabelH);
        setLabelBounds(strL, (x/4) - 300/3 - 25, (y/4) + (95), jLabelW, jLabelH);
        setLabelBounds(defL, (x/4) - 300/3 - 25, (y/4) + (110), jLabelW, jLabelH);
        setLabelBounds(conL, (x/4) - 300/3 - 25, (y/4) + (125), jLabelW, jLabelH);
        setLabelBounds(wisL, (x/4) - 300/3 - 25, (y/4) + (140), jLabelW, jLabelH);
        setLabelBounds(spdL, (x/4) - 300/3 - 25, (y/4) + (155), jLabelW, jLabelH);
        setLabelBounds(lckL, (x/4) - 300/3 - 25, (y/4) + (170), jLabelW, jLabelH);
        setLabelBounds(xpL, (x/4) - 300/3 - 25, (y/4) + (185), jLabelW, jLabelH);
        setLabelBounds(xpToNextLevelL, (x/4) - 300/3 - 25, (y/4) + (200), jLabelW, jLabelH);

        // equipment label
        setLabelBounds(mainWeaponL, (x/2) - 300/3 - 55, (y/4) + (50), jLabelW, jLabelH);
        setLabelBounds(offHandL, (x/2) - 300/3 - 55, (y/4) + (65), jLabelW, jLabelH);
        setLabelBounds(headL, (x/2) - 300/3 - 55, (y/4) + 80, jLabelW, jLabelH);
        setLabelBounds(neckL, (x/2) - 300/3 - 55, (y/4) + (95), jLabelW, jLabelH);
        setLabelBounds(chestL, (x/2) - 300/3 - 55, (y/4) + (110), jLabelW, jLabelH);
        setLabelBounds(handsL, (x/2) - 300/3 - 55, (y/4) + (125), jLabelW, jLabelH);
        setLabelBounds(ringL, (x/2) - 300/3 - 55, (y/4) + (140), jLabelW, jLabelH);
        setLabelBounds(beltL, (x/2) - 300/3 - 55, (y/4) + (155), jLabelW, jLabelH);
        setLabelBounds(legsL, (x/2) - 300/3 - 55, (y/4) + (170), jLabelW, jLabelH);
        setLabelBounds(feetL, (x/2) - 300/3 - 55, (y/4) + (185), jLabelW, jLabelH);
        setLabelBounds(backL, (x/2) - 300/3 - 55, (y/4) + (200), jLabelW, jLabelH);

        // add data to frame
        frame.getContentPane().add(deleteCharacter);
        frame.getContentPane().add(createNewCharacter);
        frame.getContentPane().add(loadData);
        frame.getContentPane().add(saveData);
        frame.getContentPane().add(levelUpButton);
        frame.getContentPane().add(characterBox);

        frame.setResizable(false);

        frame.setLayout(null);
        frame.setVisible(true);

        saveData.setEnabled(false);
        levelUpButton.setEnabled(false);

        // create new character
        createNewCharacter.addActionListener(e ->
        {
            if (Player.characters[Player.characters.length - 1] == null)
            {
                CreateUI.notAdded = true;
                CreateUI.createPlayerUI();
                CreateUI.create.setEnabled(true);
            }
            else
            {
                createNewCharacter.setEnabled(false);
            }
        });

        // delete character selected
        deleteCharacter.addActionListener(e ->
        {


            JSONObject ob;

            File dataFile = new File("saveData.json");
            try {
                ob = (JSONObject) new JSONParser().parse(new FileReader(dataFile));
            } catch (IOException | ParseException ex) {
                throw new RuntimeException(ex);
            }

            ob.remove(Integer.toString(characterBox.getSelectedIndex()));
            Player.characters[characterBox.getSelectedIndex()] = (null);

            for(int i = characterBox.getSelectedIndex(); i < Player.characters.length-1; i++)
            {
                Player.characters[i] = Player.characters[i+1];
            }
            characterBox.removeItemAt(characterBox.getSelectedIndex());

            System.out.println(ob.get("1"));


        });

        // load saved character data
        loadData.addActionListener(e ->
        {
            System.out.println("loading data");

            for (int i = 0; i < Player.characters.length; i++)
            {
                Save.loadStats(i);
            }

            Equipment.equipGear();

            // keeps the combo-box from adding duplicate entries when pressing load multiple times
            if (!resetBox)
            {
                characterBox.removeAllItems();

                fillComboBox();
                fillUI();
                getEquipInfo();

                resetBox = true;
            }

            saveData.setEnabled(true);
            levelUpButton.setEnabled(true);
            deleteCharacter.setEnabled(true);
            createNewCharacter.setEnabled(true);
            loadData.setEnabled(false);
        });

        // save character data
        saveData.addActionListener(e ->
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
        });

        // give character xp
        levelUpButton.addActionListener(e ->
        {
            // adds the xp gain to the ui
            Player.characters[characterBox.getSelectedIndex()].xp += 1;

            // checks if the player has enough xp to level up
            Player.levelUp(Player.characters[characterBox.getSelectedIndex()]);

            // if the player levels up, this updates the ui to reflect the changes
            name.setText(Player.characters[characterBox.getSelectedIndex()].name);
            sex.setText(Player.characters[characterBox.getSelectedIndex()].sex);
            job.setText(Player.characters[characterBox.getSelectedIndex()].job);
            level.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].level));
            gold.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].gold));
            status.setText(Player.characters[characterBox.getSelectedIndex()].status);
            hp.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].hp));
            str.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].str));
            def.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].def));
            con.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].con));
            wis.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].wis));
            spd.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].spd));
            lck.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].lck));
            xp.setText(String.valueOf(Variables.df.format(Player.characters[characterBox.getSelectedIndex()].xp)));

            xpToNextLevel.setText(String.valueOf(
                    Variables.df.format(Player.characters[characterBox.getSelectedIndex()].xpToNextLevel)
            ));
        });

        // character selection
        characterBox.addActionListener(e ->
        {
            // when a character is selected, this updates the stats and equipment
            name.setText(Player.characters[characterBox.getSelectedIndex()].name);
            sex.setText(Player.characters[characterBox.getSelectedIndex()].sex);
            job.setText(Player.characters[characterBox.getSelectedIndex()].job);
            level.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].level));
            gold.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].gold));
            status.setText(Player.characters[characterBox.getSelectedIndex()].status);
            hp.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].hp));
            str.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].str));
            def.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].def));
            con.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].con));
            wis.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].wis));
            spd.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].spd));
            lck.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].lck));
            xp.setText(String.valueOf(Variables.df.format(Player.characters[characterBox.getSelectedIndex()].xp)));

            xpToNextLevel.setText(String.valueOf(
                    Variables.df.format(Player.characters[characterBox.getSelectedIndex()].xpToNextLevel)
            ));

            // sets player job and equipment on creation
            Jobs.assignJob(Player.characters[characterBox.getSelectedIndex()]);
            Equipment.setEquipment(Player.characters[characterBox.getSelectedIndex()]);

            mainWeapon.setText(Player.characters[characterBox.getSelectedIndex()].mainWeapon.name);
            offHand.setText(Player.characters[characterBox.getSelectedIndex()].offHand.name);
            head.setText(Player.characters[characterBox.getSelectedIndex()].head.name);
            neck.setText(Player.characters[characterBox.getSelectedIndex()].neck.name);
            chest.setText(Player.characters[characterBox.getSelectedIndex()].chest.name);
            hands.setText(Player.characters[characterBox.getSelectedIndex()].hands.name);
            ring.setText(Player.characters[characterBox.getSelectedIndex()].ring.name);
            belt.setText(Player.characters[characterBox.getSelectedIndex()].belt.name);
            legs.setText(Player.characters[characterBox.getSelectedIndex()].legs.name);
            feet.setText(Player.characters[characterBox.getSelectedIndex()].feet.name);
            back.setText(Player.characters[characterBox.getSelectedIndex()].back.name);

            // calls the method
            getEquipInfo();
        });
    }

    // create and set character data labels
    public static void setLabelBounds(JLabel myLabel, int x, int y, int w, int h)
    {
        myLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        myLabel.setBounds(x, y, w, h);
        myLabel.setForeground(Color.white);
        frame.getContentPane().add(myLabel);
    }

    // adds character names to the combo-box from the character array in Main
    static void fillComboBox()
    {
        if (Player.characters[0] != null)
        {
            characterBox.addItem(Player.characters[0].name);
        }
        if (Player.characters[1] != null)
        {
            characterBox.addItem(Player.characters[1].name);
        }
        if (Player.characters[2] != null)
        {
            characterBox.addItem(Player.characters[2].name);
        }
        if (Player.characters[3] != null)
        {
            characterBox.addItem(Player.characters[3].name);
        }
        if (Player.characters[4] != null)
        {
            characterBox.addItem(Player.characters[4].name);
        }
        if (Player.characters[5] != null)
        {
            characterBox.addItem(Player.characters[5].name);
        }
        if (Player.characters[6] != null)
        {
            characterBox.addItem(Player.characters[6].name);
        }
        if (Player.characters[7] != null)
        {
            characterBox.addItem(Player.characters[7].name);
        }
        if (Player.characters[8] != null)
        {
            characterBox.addItem(Player.characters[8].name);
        }
        if (Player.characters[9] != null)
        {
            characterBox.addItem(Player.characters[9].name);
        }
        if (Player.characters[10] != null)
        {
            characterBox.addItem(Player.characters[10].name);
        }
        if (Player.characters[11] != null)
        {
            characterBox.addItem(Player.characters[11].name);
        }
    }

    // adds the stat and equipment data to the ui from the character array in Main
    static void fillUI()
    {
        // updates ui data accordingly
        name.setText(Player.characters[characterBox.getSelectedIndex()].name);
        sex.setText(Player.characters[characterBox.getSelectedIndex()].sex);
        job.setText(Player.characters[characterBox.getSelectedIndex()].job);
        level.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].level));
        gold.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].gold));
        status.setText(Player.characters[characterBox.getSelectedIndex()].status);
        hp.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].hp));
        str.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].str));
        def.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].def));
        con.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].con));
        wis.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].wis));
        spd.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].spd));
        lck.setText(String.valueOf(Player.characters[characterBox.getSelectedIndex()].lck));
        xp.setText(String.valueOf(Variables.df.format(Player.characters[characterBox.getSelectedIndex()].xp)));

        mainWeapon.setText(Player.characters[characterBox.getSelectedIndex()].mainWeapon.name);
        offHand.setText(Player.characters[characterBox.getSelectedIndex()].offHand.name);
        head.setText(Player.characters[characterBox.getSelectedIndex()].head.name);
        neck.setText(Player.characters[characterBox.getSelectedIndex()].neck.name);
        chest.setText(Player.characters[characterBox.getSelectedIndex()].chest.name);
        hands.setText(Player.characters[characterBox.getSelectedIndex()].hands.name);
        ring.setText(Player.characters[characterBox.getSelectedIndex()].ring.name);
        belt.setText(Player.characters[characterBox.getSelectedIndex()].belt.name);
        legs.setText(Player.characters[characterBox.getSelectedIndex()].legs.name);
        feet.setText(Player.characters[characterBox.getSelectedIndex()].feet.name);
        back.setText(Player.characters[characterBox.getSelectedIndex()].back.name);
    }

    // gets the equipment information for the currently selected character
    static void getEquipInfo()
    {
        // weapon
        equipmentInformation[0] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].mainWeapon.cost);
        equipmentInformation[1] = Player.characters[characterBox.getSelectedIndex()].mainWeapon.buff;
        equipmentInformation[2] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].mainWeapon.buffAmount);
        equipmentInformation[3] = Player.characters[characterBox.getSelectedIndex()].mainWeapon.description;

        // offhand
        equipmentInformation[4] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].offHand.cost);
        equipmentInformation[5] = Player.characters[characterBox.getSelectedIndex()].offHand.buff;
        equipmentInformation[6] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].offHand.buffAmount);
        equipmentInformation[7] = Player.characters[characterBox.getSelectedIndex()].offHand.description;

        // head
        equipmentInformation[8] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].head.cost);
        equipmentInformation[9] = Player.characters[characterBox.getSelectedIndex()].head.buff;
        equipmentInformation[10] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].head.buffAmount);
        equipmentInformation[11] = Player.characters[characterBox.getSelectedIndex()].head.description;

        // neck
        equipmentInformation[12] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].neck.cost);
        equipmentInformation[13] = Player.characters[characterBox.getSelectedIndex()].neck.buff;
        equipmentInformation[14] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].neck.buffAmount);
        equipmentInformation[15] = Player.characters[characterBox.getSelectedIndex()].neck.description;

        // chest
        equipmentInformation[16] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].chest.cost);
        equipmentInformation[17] = Player.characters[characterBox.getSelectedIndex()].chest.buff;
        equipmentInformation[18] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].chest.buffAmount);
        equipmentInformation[19] = Player.characters[characterBox.getSelectedIndex()].chest.description;

        // hands
        equipmentInformation[20] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].hands.cost);
        equipmentInformation[21] = Player.characters[characterBox.getSelectedIndex()].hands.buff;
        equipmentInformation[22] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].hands.buffAmount);
        equipmentInformation[23] = Player.characters[characterBox.getSelectedIndex()].hands.description;

        // ring
        equipmentInformation[24] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].ring.cost);
        equipmentInformation[25] = Player.characters[characterBox.getSelectedIndex()].ring.buff;
        equipmentInformation[26] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].ring.buffAmount);
        equipmentInformation[27] = Player.characters[characterBox.getSelectedIndex()].ring.description;

        // belt
        equipmentInformation[28] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].belt.cost);
        equipmentInformation[29] = Player.characters[characterBox.getSelectedIndex()].belt.buff;
        equipmentInformation[30] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].belt.buffAmount);
        equipmentInformation[31] = Player.characters[characterBox.getSelectedIndex()].belt.description;

        // legs
        equipmentInformation[32] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].legs.cost);
        equipmentInformation[33] = Player.characters[characterBox.getSelectedIndex()].legs.buff;
        equipmentInformation[34] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].legs.buffAmount);
        equipmentInformation[35] = Player.characters[characterBox.getSelectedIndex()].legs.description;

        // feet
        equipmentInformation[36] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].feet.cost);
        equipmentInformation[37] = Player.characters[characterBox.getSelectedIndex()].feet.buff;
        equipmentInformation[38] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].feet.buffAmount);
        equipmentInformation[39] = Player.characters[characterBox.getSelectedIndex()].feet.description;

        // back
        equipmentInformation[40] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].back.cost);
        equipmentInformation[41] = Player.characters[characterBox.getSelectedIndex()].back.buff;
        equipmentInformation[42] = Integer.toString(Player.characters[characterBox.getSelectedIndex()].back.buffAmount);
        equipmentInformation[43] = Player.characters[characterBox.getSelectedIndex()].back.description;

        // calls the method
        setEquipInfo();
    }

    // presents the data from the above method when the cursor is over the name of the piece of equipment
    static void setEquipInfo()
    {
        // main weapon
        mainWeapon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainWeapon.setToolTipText("<html>Price: " + equipmentInformation[0] +
                "<br>\nBuff: " + equipmentInformation[1] + " + " + equipmentInformation[2] +
                "<br>\n Description: " + equipmentInformation[3] + "</html>");

        // offhand
        offHand.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        offHand.setToolTipText("<html>Price: " + equipmentInformation[4] +
                "<br>\nBuff: " + equipmentInformation[5] + " + " + equipmentInformation[6] +
                "<br>\n Description: " + equipmentInformation[7] + "</html>");

        // head
        head.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        head.setToolTipText("<html>Price: " + equipmentInformation[8] +
                "<br>\nBuff: " + equipmentInformation[9] + " + " + equipmentInformation[10] +
                "<br>\n Description: " + equipmentInformation[11] + "</html>");

        // neck
        neck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        neck.setToolTipText("<html>Price: " + equipmentInformation[12] +
                "<br>\nBuff: " + equipmentInformation[13] + " + " + equipmentInformation[14] +
                "<br>\n Description: " + equipmentInformation[15] + "</html>");

        // chest
        chest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chest.setToolTipText("<html>Price: " + equipmentInformation[16] +
                "<br>\nBuff: " + equipmentInformation[17] + " + " + equipmentInformation[18] +
                "<br>\n Description: " + equipmentInformation[19] + "</html>");

        // hands
        hands.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hands.setToolTipText("<html>Price: " + equipmentInformation[20] +
                "<br>\nBuff: " + equipmentInformation[21] + " + " + equipmentInformation[22] +
                "<br>\n Description: " + equipmentInformation[23] + "</html>");

        // ring
        ring.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ring.setToolTipText("<html>Price: " + equipmentInformation[24] +
                "<br>\nBuff: " + equipmentInformation[25] + " + " + equipmentInformation[26] +
                "<br>\n Description: " + equipmentInformation[27] + "</html>");

        // belt
        belt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        belt.setToolTipText("<html>Price: " + equipmentInformation[28] +
                "<br>\nBuff: " + equipmentInformation[29] + " + " + equipmentInformation[30] +
                "<br>\n Description: " + equipmentInformation[31] + "</html>");

        // legs
        legs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        legs.setToolTipText("<html>Price: " + equipmentInformation[32] +
                "<br>\nBuff: " + equipmentInformation[33] + " + " + equipmentInformation[34] +
                "<br>\n Description: " + equipmentInformation[35] + "</html>");

        // feet
        feet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        feet.setToolTipText("<html>Price: " + equipmentInformation[36] +
                "<br>\nBuff: " + equipmentInformation[37] + " + " + equipmentInformation[38] +
                "<br>\n Description: " + equipmentInformation[39] + "</html>");

        // back
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setToolTipText("<html>Price: " + equipmentInformation[40] +
                "<br>\nBuff: " + equipmentInformation[41] + " + " + equipmentInformation[42] +
                "<br>\n Description: " + equipmentInformation[43] + "</html>");
    }

    // ui variables
    static JFrame frame = new JFrame("");
    static int x = 600;
    static int y = 400;
    static int jLabelW = 150;
    static int jLabelH = 20;

    // combo box and button(s)
    static JComboBox<String> characterBox;
    static Button levelUpButton = new Button("Add XP");
    static Button saveData = new Button("Save");
    static Button loadData = new Button("Load");
    static Button createNewCharacter = new Button("New Player");
    static Button deleteCharacter = new Button("Delete Player");

    // pulled stat
    static JLabel name = new JLabel("");
    static JLabel sex = new JLabel("");
    static JLabel job = new JLabel("");
    static JLabel level = new JLabel("");
    static JLabel gold = new JLabel("");
    static JLabel status = new JLabel("");
    static JLabel hp = new JLabel("");
    static JLabel str = new JLabel("");
    static JLabel def = new JLabel("");
    static JLabel con = new JLabel("");
    static JLabel wis = new JLabel("");
    static JLabel spd = new JLabel("");
    static JLabel lck = new JLabel("");
    static JLabel xp = new JLabel("");
    static JLabel xpToNextLevel = new JLabel("");

    // stat label
    static JLabel nameL = new JLabel("NAME:");
    static JLabel sexL = new JLabel("SEX:");
    static JLabel jobL = new JLabel("JOB:");
    static JLabel levelL = new JLabel("LEVEL:");
    static JLabel goldL = new JLabel("GOLD:");
    static JLabel statusL = new JLabel("STATUS:");
    static JLabel hpL = new JLabel("HP:");
    static JLabel strL = new JLabel("STR:");
    static JLabel defL = new JLabel("DEF:");
    static JLabel conL = new JLabel("CON:");
    static JLabel wisL = new JLabel("WIS:");
    static JLabel spdL = new JLabel("SPD:");
    static JLabel lckL = new JLabel("LCK:");
    static JLabel xpL = new JLabel("XP:");
    static JLabel xpToNextLevelL = new JLabel("LvlUp:");

    // equipment info array for mouse over data
    static String[] equipmentInformation = new String[44];

    // pulled armor
    static JLabel mainWeapon = new JLabel("");
    static JLabel offHand = new JLabel("");
    static JLabel head = new JLabel("");
    static JLabel neck = new JLabel("");
    static JLabel chest = new JLabel("");
    static JLabel hands = new JLabel("");
    static JLabel ring = new JLabel("");
    static JLabel belt = new JLabel("");
    static JLabel legs = new JLabel("");
    static JLabel feet = new JLabel("");
    static JLabel back = new JLabel("");

    // armor slot
    static JLabel mainWeaponL = new JLabel("Main:");
    static JLabel offHandL = new JLabel("Off Hand:");
    static JLabel headL = new JLabel("Head:");
    static JLabel neckL = new JLabel("Neck:");
    static JLabel chestL = new JLabel("Chest:");
    static JLabel handsL = new JLabel("Hands:");
    static JLabel ringL = new JLabel("Ring:");
    static JLabel beltL = new JLabel("Belt:");
    static JLabel legsL = new JLabel("Legs:");
    static JLabel feetL = new JLabel("Feet:");
    static JLabel backL = new JLabel("Back:");

    static boolean resetBox = false;
}