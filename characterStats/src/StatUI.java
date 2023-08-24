import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class StatUI
{
    // ui variables
    static final DecimalFormat df = new DecimalFormat("0");
    static JFrame frame = new JFrame("");
    static int x = 600;
    static int y = 400;
    static int buttonH = 100;
    static int buttonW = 300;
    static int jLabelW = 150;
    static int jLabelH = 20;

    // combo box and button(s)
    static JComboBox characterBox;
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

    public static void newUI()
    {
        // initialize combo box
        characterBox = new JComboBox();

        // creates program window
        frame.setTitle("RPG TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((x/2) + 50, y);
        frame.setLocationRelativeTo(null);

        // sets bound for buttons and combo boxes
        characterBox.setBounds((x/4) - buttonW/4 - 10, (y/4) - (80), 80, 20);
        levelUpButton.setBounds((x/4) - buttonW/3 - 5, (y/4) - (25), 80,25);
        saveData.setBounds((x/4) - buttonW/3 - 5, (y/4) + 10, 80,25);
        loadData.setBounds((x/4) - buttonW/3 + 80, (y/4) + 10, 80,25);
        createNewCharacter.setBounds((x/4) - buttonW/3 + 80, (y/4) - (25), 80,25);

        // actual attributes
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setBounds((x/4) - buttonW/4 - 10, (y/4) - (120), buttonW, buttonH);

        sex.setFont(new Font("Arial", Font.PLAIN, 12));
        sex.setBounds((x/4) + 50, (y/4) - (100), buttonW, buttonH);

        job.setFont(new Font("Arial", Font.PLAIN, 12));
        job.setBounds((x/4) + 50, (y/4) - 120, buttonW, buttonH);

        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setBounds((x/4) - buttonW/4, (y/4) - (100), buttonW, buttonH);

        gold.setFont(new Font("Arial", Font.PLAIN, 12));
        gold.setBounds((x/4) - buttonW/4, (y/4) + (25), buttonW, buttonH);

        status.setFont(new Font("Arial", Font.PLAIN, 12));
        status.setBounds((x/4) - buttonW/4, (y/4) + (40), buttonW, buttonH);

        hp.setFont(new Font("Arial", Font.PLAIN, 12));
        hp.setBounds((x/4) - buttonW/4, (y/4) + (55), buttonW, buttonH);

        str.setFont(new Font("Arial", Font.PLAIN, 12));
        str.setBounds((x/4) - buttonW/4, (y/4) + (70), buttonW, buttonH);

        def.setFont(new Font("Arial", Font.PLAIN, 12));
        def.setBounds((x/4) - buttonW/4, (y/4) + (85), buttonW, buttonH);

        con.setFont(new Font("Arial", Font.PLAIN, 12));
        con.setBounds((x/4) - buttonW/4, (y/4) + (100), buttonW, buttonH);

        wis.setFont(new Font("Arial", Font.PLAIN, 12));
        wis.setBounds((x/4) - buttonW/4, (y/4) + (115), buttonW, buttonH);

        spd.setFont(new Font("Arial", Font.PLAIN, 12));
        spd.setBounds((x/4) - buttonW/4, (y/4) + (130), buttonW, buttonH);

        lck.setFont(new Font("Arial", Font.PLAIN, 12));
        lck.setBounds((x/4) - buttonW/4, (y/4) + (145), buttonW, buttonH);

        xp.setFont(new Font("Arial", Font.PLAIN, 12));
        xp.setBounds((x/4) - buttonW/4, (y/4) + (160), buttonW, buttonH);

        xpToNextLevel.setFont(new Font("Arial", Font.PLAIN, 12));
        xpToNextLevel.setBounds((x/4) - buttonW/4, (y/4) + (175), buttonW, buttonH);

        // equipment
        mainWeapon.setFont(new Font("Arial", Font.PLAIN, 12));
        mainWeapon.setBounds((x/2) - buttonW/4, (y/4) + (65), jLabelW, jLabelH);

        offHand.setFont(new Font("Arial", Font.PLAIN, 12));
        offHand.setBounds((x/2) - buttonW/4, (y/4) + (80), jLabelW, jLabelH);

        head.setFont(new Font("Arial", Font.PLAIN, 12));
        head.setBounds((x/2) - buttonW/4, (y/4) + (95), jLabelW, jLabelH);

        neck.setFont(new Font("Arial", Font.PLAIN, 12));
        neck.setBounds((x/2) - buttonW/4, (y/4) + (110), jLabelW, jLabelH);

        chest.setFont(new Font("Arial", Font.PLAIN, 12));
        chest.setBounds((x/2) - buttonW/4, (y/4) + (125), jLabelW, jLabelH);

        hands.setFont(new Font("Arial", Font.PLAIN, 12));
        hands.setBounds((x/2) - buttonW/4, (y/4) + (140), jLabelW, jLabelH);

        ring.setFont(new Font("Arial", Font.PLAIN, 12));
        ring.setBounds((x/2) - buttonW/4, (y/4) + (155), jLabelW, jLabelH);

        belt.setFont(new Font("Arial", Font.PLAIN, 12));
        belt.setBounds((x/2) - buttonW/4, (y/4) + (170), jLabelW, jLabelH);

        legs.setFont(new Font("Arial", Font.PLAIN, 12));
        legs.setBounds((x/2) - buttonW/4, (y/4) + (185), jLabelW, jLabelH);

        feet.setFont(new Font("Arial", Font.PLAIN, 12));
        feet.setBounds((x/2) - buttonW/4, (y/4) + (200), jLabelW, jLabelH);

        back.setFont(new Font("Arial", Font.PLAIN, 12));
        back.setBounds((x/2) - buttonW/4, (y/4) + (215), jLabelW, jLabelH);

        // labels
        nameL.setFont(new Font("Arial", Font.PLAIN, 12));
        nameL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (120), buttonW, buttonH);

        sexL.setFont(new Font("Arial", Font.PLAIN, 12));
        sexL.setBounds((x/4) - buttonW/3 + 120, (y/4) - (100), buttonW, buttonH);

        jobL.setFont(new Font("Arial", Font.PLAIN, 12));
        jobL.setBounds((x/4) - buttonW/3 + 120, (y/4) - (120), buttonW, buttonH);

        levelL.setFont(new Font("Arial", Font.PLAIN, 12));
        levelL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (100), buttonW, buttonH);

        goldL.setFont(new Font("Arial", Font.PLAIN, 12));
        goldL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (25), buttonW, buttonH);

        statusL.setFont(new Font("Arial", Font.PLAIN, 12));
        statusL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (40), buttonW, buttonH);

        hpL.setFont(new Font("Arial", Font.PLAIN, 12));
        hpL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (55), buttonW, buttonH);

        strL.setFont(new Font("Arial", Font.PLAIN, 12));
        strL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (70), buttonW, buttonH);

        defL.setFont(new Font("Arial", Font.PLAIN, 12));
        defL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (85), buttonW, buttonH);

        conL.setFont(new Font("Arial", Font.PLAIN, 12));
        conL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (100), buttonW, buttonH);

        wisL.setFont(new Font("Arial", Font.PLAIN, 12));
        wisL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (115), buttonW, buttonH);

        spdL.setFont(new Font("Arial", Font.PLAIN, 12));
        spdL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (130), buttonW, buttonH);

        lckL.setFont(new Font("Arial", Font.PLAIN, 12));
        lckL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (145), buttonW, buttonH);

        xpL.setFont(new Font("Arial", Font.PLAIN, 12));
        xpL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (160), buttonW, buttonH);

        xpToNextLevelL.setFont(new Font("Arial", Font.PLAIN, 12));
        xpToNextLevelL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (175), buttonW, buttonH);

        // equipment label
        mainWeaponL.setFont(new Font("Arial", Font.PLAIN, 12));
        mainWeaponL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (25), buttonW, buttonH);

        offHandL.setFont(new Font("Arial", Font.PLAIN, 12));
        offHandL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (40), buttonW, buttonH);

        headL.setFont(new Font("Arial", Font.PLAIN, 12));
        headL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (55), buttonW, buttonH);

        neckL.setFont(new Font("Arial", Font.PLAIN, 12));
        neckL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (70), buttonW, buttonH);

        chestL.setFont(new Font("Arial", Font.PLAIN, 12));
        chestL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (85), buttonW, buttonH);

        handsL.setFont(new Font("Arial", Font.PLAIN, 12));
        handsL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (100), buttonW, buttonH);

        ringL.setFont(new Font("Arial", Font.PLAIN, 12));
        ringL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (115), buttonW, buttonH);

        beltL.setFont(new Font("Arial", Font.PLAIN, 12));
        beltL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (130), buttonW, buttonH);

        legsL.setFont(new Font("Arial", Font.PLAIN, 12));
        legsL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (145), buttonW, buttonH);

        feetL.setFont(new Font("Arial", Font.PLAIN, 12));
        feetL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (160), buttonW, buttonH);

        backL.setFont(new Font("Arial", Font.PLAIN, 12));
        backL.setBounds((x/2) - buttonW/3 - 30, (y/4) + (175), buttonW, buttonH);

        // add data to frame
        frame.getContentPane().add(createNewCharacter);
        frame.getContentPane().add(loadData);
        frame.getContentPane().add(saveData);
        frame.getContentPane().add(levelUpButton);
        frame.getContentPane().add(characterBox);

        // removed so that the character combobox could be used instead for the name
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

        // create new character
        createNewCharacter.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (Main.characters[Main.characters.length - 1] == null)
                {
                    CreateUI.notAdded = true;
                    CreateUI.createPlayerUI();
                    saveData.setEnabled(true);
                    CreateUI.create.setEnabled(true);
                }
                else
                {
                    createNewCharacter.setEnabled(false);
                }
            }
        });

        // load saved character data
        loadData.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("loading data");
                for (int i = 0; i < Main.characters.length; i++)
                {
                    Save.loadStats(i);

                    // "equips" the gear for characters so that their stats reflect the buff provided
                    if (Main.characters[i] != null)
                    {
                        Main.characters[i].gearEquipped();
                    }
                }

                // keeps the combobox from adding duplicate entries when pressing load multiple times
                if (!resetBox)
                {
                    characterBox.removeAllItems();

                    fillComboBox();
                    fillUI();
                    getEquipInfo();

                    resetBox = true;
                }

                saveData.setEnabled(true);
            }
        });

        // save character data
        saveData.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("saving data");

                // for loop that calls the save stat method for each available character
                for (int i = 0; i < Main.characters.length; i++)
                {
                    if (Main.characters[i] != null)
                    {
                        Save.saveStats(Main.characters[i], i);
                    }

                    Save.saveAsJson();
                }
            }
        });

        // give character xp
        levelUpButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // adds the xp gain to the ui
                Main.characters[characterBox.getSelectedIndex()].xp += 1;

                // checks if the player has enough xp to level up
                Main.levelUp(Main.characters[characterBox.getSelectedIndex()]);

                // if the player levels up, this updates the ui to reflect the changes
                name.setText(Main.characters[characterBox.getSelectedIndex()].name);
                sex.setText(Main.characters[characterBox.getSelectedIndex()].sex);
                job.setText(Main.characters[characterBox.getSelectedIndex()].job);
                level.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].level));
                gold.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].gold));
                status.setText(Main.characters[characterBox.getSelectedIndex()].status);
                hp.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].hp));
                str.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].str));
                def.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].def));
                con.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].con));
                wis.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].wis));
                spd.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].spd));
                lck.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].lck));
                xp.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xp)));

                xpToNextLevel.setText(String.valueOf(
                        df.format(Main.characters[characterBox.getSelectedIndex()].xpToNextLevel)
                ));
            }
        });

        // character selection
        characterBox.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // when a character is selected, this updates the stats and equipment
                name.setText(Main.characters[characterBox.getSelectedIndex()].name);
                sex.setText(Main.characters[characterBox.getSelectedIndex()].sex);
                job.setText(Main.characters[characterBox.getSelectedIndex()].job);
                level.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].level));
                gold.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].gold));
                status.setText(Main.characters[characterBox.getSelectedIndex()].status);
                hp.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].hp));
                str.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].str));
                def.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].def));
                con.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].con));
                wis.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].wis));
                spd.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].spd));
                lck.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].lck));
                xp.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xp)));

                xpToNextLevel.setText(String.valueOf(
                        df.format(Main.characters[characterBox.getSelectedIndex()].xpToNextLevel)
                ));

                mainWeapon.setText(Main.characters[characterBox.getSelectedIndex()].mainWeapon.name);
                offHand.setText(Main.characters[characterBox.getSelectedIndex()].offHand.name);
                head.setText(Main.characters[characterBox.getSelectedIndex()].head.name);
                neck.setText(Main.characters[characterBox.getSelectedIndex()].neck.name);
                chest.setText(Main.characters[characterBox.getSelectedIndex()].chest.name);
                hands.setText(Main.characters[characterBox.getSelectedIndex()].hands.name);
                ring.setText(Main.characters[characterBox.getSelectedIndex()].ring.name);
                belt.setText(Main.characters[characterBox.getSelectedIndex()].belt.name);
                legs.setText(Main.characters[characterBox.getSelectedIndex()].legs.name);
                feet.setText(Main.characters[characterBox.getSelectedIndex()].feet.name);
                back.setText(Main.characters[characterBox.getSelectedIndex()].back.name);

                // calls the method
                getEquipInfo();
            }
        });
    }

    // adds character names to the combobox from the character array in Main
    static void fillComboBox()
    {
        if (Main.characters[0] != null)
        {
            characterBox.addItem(Main.characters[0].name);
        }
        if (Main.characters[1] != null)
        {
            characterBox.addItem(Main.characters[1].name);
        }
        if (Main.characters[2] != null)
        {
            characterBox.addItem(Main.characters[2].name);
        }
        if (Main.characters[3] != null)
        {
            characterBox.addItem(Main.characters[3].name);
        }
        if (Main.characters[4] != null)
        {
            characterBox.addItem(Main.characters[4].name);
        }
        if (Main.characters[5] != null)
        {
            characterBox.addItem(Main.characters[5].name);
        }
        if (Main.characters[6] != null)
        {
            characterBox.addItem(Main.characters[6].name);
        }
        if (Main.characters[7] != null)
        {
            characterBox.addItem(Main.characters[7].name);
        }
        if (Main.characters[8] != null)
        {
            characterBox.addItem(Main.characters[8].name);
        }
        if (Main.characters[9] != null)
        {
            characterBox.addItem(Main.characters[9].name);
        }
        if (Main.characters[10] != null)
        {
            characterBox.addItem(Main.characters[10].name);
        }
        if (Main.characters[11] != null)
        {
            characterBox.addItem(Main.characters[11].name);
        }
    }

    // adds the stat and equipment data to the ui from the character array in Main
    static void fillUI()
    {
        // updates ui data accordingly
        name.setText(Main.characters[characterBox.getSelectedIndex()].name);
        sex.setText(Main.characters[characterBox.getSelectedIndex()].sex);
        job.setText(Main.characters[characterBox.getSelectedIndex()].job);
        level.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].level));
        gold.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].gold));
        status.setText(Main.characters[characterBox.getSelectedIndex()].status);
        hp.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].hp));
        str.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].str));
        def.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].def));
        con.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].con));
        wis.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].wis));
        spd.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].spd));
        lck.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].lck));
        xp.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xp)));

        mainWeapon.setText(Main.characters[characterBox.getSelectedIndex()].mainWeapon.name);
        offHand.setText(Main.characters[characterBox.getSelectedIndex()].offHand.name);
        head.setText(Main.characters[characterBox.getSelectedIndex()].head.name);
        neck.setText(Main.characters[characterBox.getSelectedIndex()].neck.name);
        chest.setText(Main.characters[characterBox.getSelectedIndex()].chest.name);
        hands.setText(Main.characters[characterBox.getSelectedIndex()].hands.name);
        ring.setText(Main.characters[characterBox.getSelectedIndex()].ring.name);
        belt.setText(Main.characters[characterBox.getSelectedIndex()].belt.name);
        legs.setText(Main.characters[characterBox.getSelectedIndex()].legs.name);
        feet.setText(Main.characters[characterBox.getSelectedIndex()].feet.name);
        back.setText(Main.characters[characterBox.getSelectedIndex()].back.name);
    }

    // gets the equipment information for the currently selected character
    static void getEquipInfo()
    {
        // weapon
        equipmentInformation[0] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].mainWeapon.cost);
        equipmentInformation[1] = Main.characters[characterBox.getSelectedIndex()].mainWeapon.buff;
        equipmentInformation[2] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].mainWeapon.buffAmount);
        equipmentInformation[3] = Main.characters[characterBox.getSelectedIndex()].mainWeapon.description;

        // offhand
        equipmentInformation[4] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].offHand.cost);
        equipmentInformation[5] = Main.characters[characterBox.getSelectedIndex()].offHand.buff;
        equipmentInformation[6] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].offHand.buffAmount);
        equipmentInformation[7] = Main.characters[characterBox.getSelectedIndex()].offHand.description;

        // head
        equipmentInformation[8] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].head.cost);
        equipmentInformation[9] = Main.characters[characterBox.getSelectedIndex()].head.buff;
        equipmentInformation[10] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].head.buffAmount);
        equipmentInformation[11] = Main.characters[characterBox.getSelectedIndex()].head.description;

        // neck
        equipmentInformation[12] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].neck.cost);
        equipmentInformation[13] = Main.characters[characterBox.getSelectedIndex()].neck.buff;
        equipmentInformation[14] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].neck.buffAmount);
        equipmentInformation[15] = Main.characters[characterBox.getSelectedIndex()].neck.description;

        // chest
        equipmentInformation[16] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].chest.cost);
        equipmentInformation[17] = Main.characters[characterBox.getSelectedIndex()].chest.buff;
        equipmentInformation[18] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].chest.buffAmount);
        equipmentInformation[19] = Main.characters[characterBox.getSelectedIndex()].chest.description;

        // hands
        equipmentInformation[20] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].hands.cost);
        equipmentInformation[21] = Main.characters[characterBox.getSelectedIndex()].hands.buff;
        equipmentInformation[22] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].hands.buffAmount);
        equipmentInformation[23] = Main.characters[characterBox.getSelectedIndex()].hands.description;

        // ring
        equipmentInformation[24] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].ring.cost);
        equipmentInformation[25] = Main.characters[characterBox.getSelectedIndex()].ring.buff;
        equipmentInformation[26] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].ring.buffAmount);
        equipmentInformation[27] = Main.characters[characterBox.getSelectedIndex()].ring.description;

        // belt
        equipmentInformation[28] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].belt.cost);
        equipmentInformation[29] = Main.characters[characterBox.getSelectedIndex()].belt.buff;
        equipmentInformation[30] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].belt.buffAmount);
        equipmentInformation[31] = Main.characters[characterBox.getSelectedIndex()].belt.description;

        // legs
        equipmentInformation[32] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].legs.cost);
        equipmentInformation[33] = Main.characters[characterBox.getSelectedIndex()].legs.buff;
        equipmentInformation[34] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].legs.buffAmount);
        equipmentInformation[35] = Main.characters[characterBox.getSelectedIndex()].legs.description;

        // feet
        equipmentInformation[36] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].feet.cost);
        equipmentInformation[37] = Main.characters[characterBox.getSelectedIndex()].feet.buff;
        equipmentInformation[38] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].feet.buffAmount);
        equipmentInformation[39] = Main.characters[characterBox.getSelectedIndex()].feet.description;

        // back
        equipmentInformation[40] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].back.cost);
        equipmentInformation[41] = Main.characters[characterBox.getSelectedIndex()].back.buff;
        equipmentInformation[42] = Integer.toString(Main.characters[characterBox.getSelectedIndex()].back.buffAmount);
        equipmentInformation[43] = Main.characters[characterBox.getSelectedIndex()].back.description;

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
}