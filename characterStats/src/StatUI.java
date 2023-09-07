import javax.swing.*;
import java.awt.*;

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
        characterBox.setBounds((x/4) - buttonW/4 + 5, (y/4) - (80), 80, 20);
        levelUpButton.setBounds((x/4) - buttonW/3 + 5, (y/4) - (25), 80,25);
        saveData.setBounds((x/4) - buttonW/3 + 5, (y/4) + 10, 80,25);
        loadData.setBounds((x/4) - buttonW/3 + 120, (y/4) + 10, 80,25);
        createNewCharacter.setBounds((x/4) - buttonW/3 + 120, (y/4) - (25), 80,25);

        // actual attributes
        sex.setFont(new Font("Arial", Font.PLAIN, 12));
        sex.setBounds((x/4) + 75, (y/4) - (100), buttonW, buttonH);
        sex.setForeground(Color.white);

        job.setFont(new Font("Arial", Font.PLAIN, 12));
        job.setBounds((x/4) + 75, (y/4) - 120, buttonW, buttonH);
        job.setForeground(Color.white);

        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setBounds((x/4) - buttonW/4 + 35, (y/4) - (100), buttonW, buttonH);
        level.setForeground(Color.white);

        gold.setFont(new Font("Arial", Font.PLAIN, 12));
        gold.setBounds((x/4) - buttonW/4, (y/4) + (25), buttonW, buttonH);
        gold.setForeground(Color.white);

        status.setFont(new Font("Arial", Font.PLAIN, 12));
        status.setBounds((x/4) - buttonW/4, (y/4) + (40), buttonW, buttonH);
        status.setForeground(Color.white);

        hp.setFont(new Font("Arial", Font.PLAIN, 12));
        hp.setBounds((x/4) - buttonW/4, (y/4) + (55), buttonW, buttonH);
        hp.setForeground(Color.white);

        str.setFont(new Font("Arial", Font.PLAIN, 12));
        str.setBounds((x/4) - buttonW/4, (y/4) + (70), buttonW, buttonH);
        str.setForeground(Color.white);

        def.setFont(new Font("Arial", Font.PLAIN, 12));
        def.setBounds((x/4) - buttonW/4, (y/4) + (85), buttonW, buttonH);
        def.setForeground(Color.white);

        con.setFont(new Font("Arial", Font.PLAIN, 12));
        con.setBounds((x/4) - buttonW/4, (y/4) + (100), buttonW, buttonH);
        con.setForeground(Color.white);

        wis.setFont(new Font("Arial", Font.PLAIN, 12));
        wis.setBounds((x/4) - buttonW/4, (y/4) + (115), buttonW, buttonH);
        wis.setForeground(Color.white);

        spd.setFont(new Font("Arial", Font.PLAIN, 12));
        spd.setBounds((x/4) - buttonW/4, (y/4) + (130), buttonW, buttonH);
        spd.setForeground(Color.white);

        lck.setFont(new Font("Arial", Font.PLAIN, 12));
        lck.setBounds((x/4) - buttonW/4, (y/4) + (145), buttonW, buttonH);
        lck.setForeground(Color.white);

        xp.setFont(new Font("Arial", Font.PLAIN, 12));
        xp.setBounds((x/4) - buttonW/4, (y/4) + (160), buttonW, buttonH);
        xp.setForeground(Color.white);

        xpToNextLevel.setFont(new Font("Arial", Font.PLAIN, 12));
        xpToNextLevel.setBounds((x/4) - buttonW/4, (y/4) + (175), buttonW, buttonH);
        xpToNextLevel.setForeground(Color.white);

        // equipment
        mainWeapon.setFont(new Font("Arial", Font.PLAIN, 12));
        mainWeapon.setBounds((x/2) - buttonW/4 - 20, (y/4) + (65), jLabelW, jLabelH);
        mainWeapon.setForeground(Color.white);

        offHand.setFont(new Font("Arial", Font.PLAIN, 12));
        offHand.setBounds((x/2) - buttonW/4 - 20, (y/4) + (80), jLabelW, jLabelH);
        offHand.setForeground(Color.white);

        head.setFont(new Font("Arial", Font.PLAIN, 12));
        head.setBounds((x/2) - buttonW/4 - 20, (y/4) + (95), jLabelW, jLabelH);
        head.setForeground(Color.white);

        neck.setFont(new Font("Arial", Font.PLAIN, 12));
        neck.setBounds((x/2) - buttonW/4 - 20, (y/4) + (110), jLabelW, jLabelH);
        neck.setForeground(Color.white);

        chest.setFont(new Font("Arial", Font.PLAIN, 12));
        chest.setBounds((x/2) - buttonW/4 - 20, (y/4) + (125), jLabelW, jLabelH);
        chest.setForeground(Color.white);

        hands.setFont(new Font("Arial", Font.PLAIN, 12));
        hands.setBounds((x/2) - buttonW/4 - 20, (y/4) + (140), jLabelW, jLabelH);
        hands.setForeground(Color.white);

        ring.setFont(new Font("Arial", Font.PLAIN, 12));
        ring.setBounds((x/2) - buttonW/4 - 20, (y/4) + (155), jLabelW, jLabelH);
        ring.setForeground(Color.white);

        belt.setFont(new Font("Arial", Font.PLAIN, 12));
        belt.setBounds((x/2) - buttonW/4 - 20, (y/4) + (170), jLabelW, jLabelH);
        belt.setForeground(Color.white);

        legs.setFont(new Font("Arial", Font.PLAIN, 12));
        legs.setBounds((x/2) - buttonW/4 - 20, (y/4) + (185), jLabelW, jLabelH);
        legs.setForeground(Color.white);

        feet.setFont(new Font("Arial", Font.PLAIN, 12));
        feet.setBounds((x/2) - buttonW/4 - 20, (y/4) + (200), jLabelW, jLabelH);
        feet.setForeground(Color.white);

        back.setFont(new Font("Arial", Font.PLAIN, 12));
        back.setBounds((x/2) - buttonW/4 - 20, (y/4) + (215), jLabelW, jLabelH);
        back.setForeground(Color.white);

        // labels
        nameL.setFont(new Font("Arial", Font.PLAIN, 12));
        nameL.setBounds((x/4) - buttonW/3 - 15, (y/4) - (120), buttonW, buttonH);
        nameL.setForeground(Color.white);

        sexL.setFont(new Font("Arial", Font.PLAIN, 12));
        sexL.setBounds((x/4) - buttonW/3 + 130, (y/4) - (100), buttonW, buttonH);
        sexL.setForeground(Color.white);

        jobL.setFont(new Font("Arial", Font.PLAIN, 12));
        jobL.setBounds((x/4) - buttonW/3 + 130, (y/4) - (120), buttonW, buttonH);
        jobL.setForeground(Color.white);

        levelL.setFont(new Font("Arial", Font.PLAIN, 12));
        levelL.setBounds((x/4) - buttonW/3 - 15, (y/4) - (100), buttonW, buttonH);
        levelL.setForeground(Color.white);

        goldL.setFont(new Font("Arial", Font.PLAIN, 12));
        goldL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (25), buttonW, buttonH);
        goldL.setForeground(Color.white);

        statusL.setFont(new Font("Arial", Font.PLAIN, 12));
        statusL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (40), buttonW, buttonH);
        statusL.setForeground(Color.white);

        hpL.setFont(new Font("Arial", Font.PLAIN, 12));
        hpL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (55), buttonW, buttonH);
        hpL.setForeground(Color.white);

        strL.setFont(new Font("Arial", Font.PLAIN, 12));
        strL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (70), buttonW, buttonH);
        strL.setForeground(Color.white);

        defL.setFont(new Font("Arial", Font.PLAIN, 12));
        defL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (85), buttonW, buttonH);
        defL.setForeground(Color.white);

        conL.setFont(new Font("Arial", Font.PLAIN, 12));
        conL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (100), buttonW, buttonH);
        conL.setForeground(Color.white);

        wisL.setFont(new Font("Arial", Font.PLAIN, 12));
        wisL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (115), buttonW, buttonH);
        wisL.setForeground(Color.white);

        spdL.setFont(new Font("Arial", Font.PLAIN, 12));
        spdL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (130), buttonW, buttonH);
        spdL.setForeground(Color.white);

        lckL.setFont(new Font("Arial", Font.PLAIN, 12));
        lckL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (145), buttonW, buttonH);
        lckL.setForeground(Color.white);

        xpL.setFont(new Font("Arial", Font.PLAIN, 12));
        xpL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (160), buttonW, buttonH);
        xpL.setForeground(Color.white);

        xpToNextLevelL.setFont(new Font("Arial", Font.PLAIN, 12));
        xpToNextLevelL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (175), buttonW, buttonH);
        xpToNextLevelL.setForeground(Color.white);

        // equipment label
        mainWeaponL.setFont(new Font("Arial", Font.PLAIN, 12));
        mainWeaponL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (25), buttonW, buttonH);
        mainWeaponL.setForeground(Color.white);

        offHandL.setFont(new Font("Arial", Font.PLAIN, 12));
        offHandL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (40), buttonW, buttonH);
        offHandL.setForeground(Color.white);

        headL.setFont(new Font("Arial", Font.PLAIN, 12));
        headL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (55), buttonW, buttonH);
        headL.setForeground(Color.white);

        neckL.setFont(new Font("Arial", Font.PLAIN, 12));
        neckL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (70), buttonW, buttonH);
        neckL.setForeground(Color.white);

        chestL.setFont(new Font("Arial", Font.PLAIN, 12));
        chestL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (85), buttonW, buttonH);
        chestL.setForeground(Color.white);

        handsL.setFont(new Font("Arial", Font.PLAIN, 12));
        handsL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (100), buttonW, buttonH);
        handsL.setForeground(Color.white);

        ringL.setFont(new Font("Arial", Font.PLAIN, 12));
        ringL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (115), buttonW, buttonH);
        ringL.setForeground(Color.white);

        beltL.setFont(new Font("Arial", Font.PLAIN, 12));
        beltL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (130), buttonW, buttonH);
        beltL.setForeground(Color.white);

        legsL.setFont(new Font("Arial", Font.PLAIN, 12));
        legsL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (145), buttonW, buttonH);
        legsL.setForeground(Color.white);

        feetL.setFont(new Font("Arial", Font.PLAIN, 12));
        feetL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (160), buttonW, buttonH);
        feetL.setForeground(Color.white);

        backL.setFont(new Font("Arial", Font.PLAIN, 12));
        backL.setBounds((x/2) - buttonW/3 - 55, (y/4) + (175), buttonW, buttonH);
        backL.setForeground(Color.white);

        // add data to frame
        frame.getContentPane().add(createNewCharacter);
        frame.getContentPane().add(loadData);
        frame.getContentPane().add(saveData);
        frame.getContentPane().add(levelUpButton);
        frame.getContentPane().add(characterBox);

        // removed so that the character combo-box could be used instead for the name
        //frame.getContentPane().add(name);

        frame.getContentPane().add(sex);
        frame.getContentPane().add(job);
        frame.getContentPane().add(level);
        frame.getContentPane().add(gold);
        frame.getContentPane().add(status);
        frame.getContentPane().add(hp);
        frame.getContentPane().add(str);
        frame.getContentPane().add(def);
        frame.getContentPane().add(con);
        frame.getContentPane().add(wis);
        frame.getContentPane().add(spd);
        frame.getContentPane().add(lck);
        frame.getContentPane().add(xp);
        frame.getContentPane().add(xpToNextLevel);

        // equipment pulled
        frame.getContentPane().add(mainWeapon);
        frame.getContentPane().add(offHand);
        frame.getContentPane().add(head);
        frame.getContentPane().add(neck);
        frame.getContentPane().add(chest);
        frame.getContentPane().add(hands);
        frame.getContentPane().add(ring);
        frame.getContentPane().add(belt);
        frame.getContentPane().add(legs);
        frame.getContentPane().add(feet);
        frame.getContentPane().add(back);

        // add data labels to frame
        frame.getContentPane().add(nameL);
        frame.getContentPane().add(sexL);
        frame.getContentPane().add(jobL);
        frame.getContentPane().add(levelL);
        frame.getContentPane().add(goldL);
        frame.getContentPane().add(statusL);
        frame.getContentPane().add(hpL);
        frame.getContentPane().add(strL);
        frame.getContentPane().add(defL);
        frame.getContentPane().add(conL);
        frame.getContentPane().add(wisL);
        frame.getContentPane().add(spdL);
        frame.getContentPane().add(lckL);
        frame.getContentPane().add(xpL);
        frame.getContentPane().add(xpToNextLevelL);

        // add equipment labels to frame
        frame.getContentPane().add(mainWeaponL);
        frame.getContentPane().add(offHandL);
        frame.getContentPane().add(headL);
        frame.getContentPane().add(neckL);
        frame.getContentPane().add(chestL);
        frame.getContentPane().add(handsL);
        frame.getContentPane().add(ringL);
        frame.getContentPane().add(beltL);
        frame.getContentPane().add(legsL);
        frame.getContentPane().add(feetL);
        frame.getContentPane().add(backL);

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
    static int buttonH = 100;
    static int buttonW = 300;
    static int jLabelW = 150;
    static int jLabelH = 20;

    // combo box and button(s)
    static JComboBox<String> characterBox;
    static Button levelUpButton = new Button("Add XP");
    static Button saveData = new Button("Save");
    static Button loadData = new Button("Load");
    static Button createNewCharacter = new Button("New Player");

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