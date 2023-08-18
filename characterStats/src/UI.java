import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class UI
{
    static final DecimalFormat df = new DecimalFormat("0");
    static JFrame frame = new JFrame("");
    static int x = 600;
    static int y = 400;
    static int buttonH = y/4;
    static int buttonW = x/2;

    // combo box and button(s)
    static JComboBox characterBox;
    static Button levelUpButton = new Button("Add XP");
    static Button saveData = new Button("Save");
    static Button loadData = new Button("Load");

    // pulled stat
    static JLabel name = new JLabel("");
    static JLabel sex = new JLabel("");
    static JLabel job = new JLabel("");
    static JLabel level = new JLabel("");
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

    public static void newUI()
    {
        characterBox = new JComboBox();

        // creates program window
        frame.setTitle("RPG TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x, y);
        frame.setLocationRelativeTo(null);

        characterBox.setBounds((x/4) + 200, (y/4) - (80), 100, 30);
        levelUpButton.setBounds((x/4) - buttonW/3 - 25, (y/4) - (35), 80,25);
        saveData.setBounds((x/4) + 200, (y/4) - (35), 80,25);
        loadData.setBounds((x/4) + 200, (y/4) - (5), 80,25);

        // actual attributes
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setBounds((x/4) - buttonW/4 - 10, (y/4) - (120), buttonW, buttonH);

        sex.setFont(new Font("Arial", Font.PLAIN, 12));
        sex.setBounds((x/4) + 50, (y/4) - (100), buttonW, buttonH);

        job.setFont(new Font("Arial", Font.PLAIN, 12));
        job.setBounds((x/4) + 50, (y/4) - 120, buttonW, buttonH);

        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setBounds((x/4) - buttonW/4, (y/4) - (100), buttonW, buttonH);

        status.setFont(new Font("Arial", Font.PLAIN, 12));
        status.setBounds((x/4) - buttonW/4, (y/4) + (25), buttonW, buttonH);

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
        mainWeapon.setBounds((x/2) - buttonW/4, (y/4) + (25), buttonW, buttonH);

        offHand.setFont(new Font("Arial", Font.PLAIN, 12));
        offHand.setBounds((x/2) - buttonW/4, (y/4) + (40), buttonW, buttonH);

        head.setFont(new Font("Arial", Font.PLAIN, 12));
        head.setBounds((x/2) - buttonW/4, (y/4) + (55), buttonW, buttonH);

        neck.setFont(new Font("Arial", Font.PLAIN, 12));
        neck.setBounds((x/2) - buttonW/4, (y/4) + (70), buttonW, buttonH);

        chest.setFont(new Font("Arial", Font.PLAIN, 12));
        chest.setBounds((x/2) - buttonW/4, (y/4) + (85), buttonW, buttonH);

        hands.setFont(new Font("Arial", Font.PLAIN, 12));
        hands.setBounds((x/2) - buttonW/4, (y/4) + (100), buttonW, buttonH);

        ring.setFont(new Font("Arial", Font.PLAIN, 12));
        ring.setBounds((x/2) - buttonW/4, (y/4) + (115), buttonW, buttonH);

        belt.setFont(new Font("Arial", Font.PLAIN, 12));
        belt.setBounds((x/2) - buttonW/4, (y/4) + (130), buttonW, buttonH);

        legs.setFont(new Font("Arial", Font.PLAIN, 12));
        legs.setBounds((x/2) - buttonW/4, (y/4) + (145), buttonW, buttonH);

        feet.setFont(new Font("Arial", Font.PLAIN, 12));
        feet.setBounds((x/2) - buttonW/4, (y/4) + (160), buttonW, buttonH);

        back.setFont(new Font("Arial", Font.PLAIN, 12));
        back.setBounds((x/2) - buttonW/4, (y/4) + (175), buttonW, buttonH);

        frame.getContentPane().add(loadData);
        frame.getContentPane().add(saveData);
        frame.getContentPane().add(levelUpButton);
        frame.getContentPane().add(characterBox);
        frame.getContentPane().add(name);
        frame.getContentPane().add(sex);
        frame.getContentPane().add(job);
        frame.getContentPane().add(level);
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

        // labels
        nameL.setFont(new Font("Arial", Font.PLAIN, 12));
        nameL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (120), buttonW, buttonH);

        sexL.setFont(new Font("Arial", Font.PLAIN, 12));
        sexL.setBounds((x/4) - buttonW/3 + 120, (y/4) - (100), buttonW, buttonH);

        jobL.setFont(new Font("Arial", Font.PLAIN, 12));
        jobL.setBounds((x/4) - buttonW/3 + 120, (y/4) - (120), buttonW, buttonH);

        levelL.setFont(new Font("Arial", Font.PLAIN, 12));
        levelL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (100), buttonW, buttonH);

        statusL.setFont(new Font("Arial", Font.PLAIN, 12));
        statusL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (25), buttonW, buttonH);

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

        frame.getContentPane().add(nameL);
        frame.getContentPane().add(sexL);
        frame.getContentPane().add(jobL);
        frame.getContentPane().add(levelL);
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

        frame.setLayout(null);
        frame.setVisible(true);

        saveData.setEnabled(false);

        loadData.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("loading data");
                for (int i = 0; i < Main.characters.length; i++)
                {
                    Save.loadStats(i);

                    if (Main.characters[i] != null)
                    {
                        Main.characters[i].gearEquipped();
                    }
                }
                fillComboBox();
                fillUI();
                saveData.setEnabled(true);
            }
        });

        saveData.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Save.saveStats(Main.characters[characterBox.getSelectedIndex()], characterBox.getSelectedIndex());
            }
        });

        levelUpButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Main.characters[characterBox.getSelectedIndex()].xp += 1;
                Main.levelUp(Main.characters[characterBox.getSelectedIndex()]);

                name.setText(Main.characters[characterBox.getSelectedIndex()].name);
                sex.setText(Main.characters[characterBox.getSelectedIndex()].sex);
                job.setText(Main.characters[characterBox.getSelectedIndex()].job);
                level.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].level));
                status.setText(Main.characters[characterBox.getSelectedIndex()].status);
                hp.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].hp));
                str.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].str));
                def.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].def));
                con.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].con));
                wis.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].wis));
                spd.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].spd));
                lck.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].lck));
                xp.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xp)));
                xpToNextLevel.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xpToNextLevel)));
            }
        });

        characterBox.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                name.setText(Main.characters[characterBox.getSelectedIndex()].name);
                sex.setText(Main.characters[characterBox.getSelectedIndex()].sex);
                job.setText(Main.characters[characterBox.getSelectedIndex()].job);
                level.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].level));
                status.setText(Main.characters[characterBox.getSelectedIndex()].status);
                hp.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].hp));
                str.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].str));
                def.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].def));
                con.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].con));
                wis.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].wis));
                spd.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].spd));
                lck.setText(String.valueOf(Main.characters[characterBox.getSelectedIndex()].lck));
                xp.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xp)));
                xpToNextLevel.setText(String.valueOf(df.format(Main.characters[characterBox.getSelectedIndex()].xpToNextLevel)));

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
        });
    }

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

    static void fillUI()
    {
        name.setText(Main.characters[0].name);
        sex.setText(Main.characters[0].sex);
        job.setText(Main.characters[0].job);
        level.setText(String.valueOf(Main.characters[0].level));
        status.setText(Main.characters[0].status);
        hp.setText(String.valueOf(Main.characters[0].hp));
        str.setText(String.valueOf(Main.characters[0].str));
        def.setText(String.valueOf(Main.characters[0].def));
        con.setText(String.valueOf(Main.characters[0].con));
        wis.setText(String.valueOf(Main.characters[0].wis));
        spd.setText(String.valueOf(Main.characters[0].spd));
        lck.setText(String.valueOf(Main.characters[0].lck));
        xp.setText(String.valueOf(df.format(Main.characters[0].xp)));

        mainWeapon.setText(Main.characters[0].mainWeapon.name);
        offHand.setText(Main.characters[0].offHand.name);
        head.setText(Main.characters[0].head.name);
        neck.setText(Main.characters[0].neck.name);
        chest.setText(Main.characters[0].chest.name);
        hands.setText(Main.characters[0].hands.name);
        ring.setText(Main.characters[0].ring.name);
        belt.setText(Main.characters[0].belt.name);
        legs.setText(Main.characters[0].legs.name);
        feet.setText(Main.characters[0].feet.name);
        back.setText(Main.characters[0].back.name);
    }
}