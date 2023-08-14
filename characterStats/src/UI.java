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

    static JComboBox characterBox;
    static Button levelUpButton = new Button("Add XP");

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

    public static void newUI()
    {
        characterBox = new JComboBox();

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

        // creates program window
        frame.setTitle("RPG TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x, y);
        frame.setLocationRelativeTo(null);

        characterBox.setBounds((x/4) - buttonW/3 - 25, (y/4) - (80), 100, 30);
        levelUpButton.setBounds((x/4) - buttonW/3 - 25, (y/4) - (35), 80,25);

        // actual attributes
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setBounds((x/4) - buttonW/4, (y/4) - (20), buttonW, buttonH);

        sex.setFont(new Font("Arial", Font.PLAIN, 12));
        sex.setBounds((x/4) - buttonW/4, (y/4) - (5), buttonW, buttonH);

        job.setFont(new Font("Arial", Font.PLAIN, 12));
        job.setBounds((x/4) - buttonW/4, (y/4) + (10), buttonW, buttonH);

        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setBounds((x/4) - buttonW/4, (y/4) + (25), buttonW, buttonH);

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

        // labels
        nameL.setFont(new Font("Arial", Font.PLAIN, 12));
        nameL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (20), buttonW, buttonH);

        sexL.setFont(new Font("Arial", Font.PLAIN, 12));
        sexL.setBounds((x/4) - buttonW/3 - 25, (y/4) - (5), buttonW, buttonH);

        jobL.setFont(new Font("Arial", Font.PLAIN, 12));
        jobL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (10), buttonW, buttonH);

        levelL.setFont(new Font("Arial", Font.PLAIN, 12));
        levelL.setBounds((x/4) - buttonW/3 - 25, (y/4) + (25), buttonW, buttonH);

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

        frame.setLayout(null);
        frame.setVisible(true);

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
                switch (characterBox.getSelectedIndex()) {
                    case 0 -> {
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
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[0].xpToNextLevel)));
                    }

                    case 1 -> {
                        name.setText(Main.characters[1].name);
                        sex.setText(Main.characters[1].sex);
                        job.setText(Main.characters[1].job);
                        level.setText(String.valueOf(Main.characters[1].level));
                        status.setText(Main.characters[1].status);
                        hp.setText(String.valueOf(Main.characters[1].hp));
                        str.setText(String.valueOf(Main.characters[1].str));
                        def.setText(String.valueOf(Main.characters[1].def));
                        con.setText(String.valueOf(Main.characters[1].con));
                        wis.setText(String.valueOf(Main.characters[1].wis));
                        spd.setText(String.valueOf(Main.characters[1].spd));
                        lck.setText(String.valueOf(Main.characters[1].lck));
                        xp.setText(String.valueOf(df.format(Main.characters[1].xp)));
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[1].xpToNextLevel)));
                    }

                    case 2 -> {
                        name.setText(Main.characters[2].name);
                        sex.setText(Main.characters[2].sex);
                        job.setText(Main.characters[2].job);
                        level.setText(String.valueOf(Main.characters[2].level));
                        status.setText(Main.characters[2].status);
                        hp.setText(String.valueOf(Main.characters[2].hp));
                        str.setText(String.valueOf(Main.characters[2].str));
                        def.setText(String.valueOf(Main.characters[2].def));
                        con.setText(String.valueOf(Main.characters[2].con));
                        wis.setText(String.valueOf(Main.characters[2].wis));
                        spd.setText(String.valueOf(Main.characters[2].spd));
                        lck.setText(String.valueOf(Main.characters[2].lck));
                        xp.setText(String.valueOf(df.format(Main.characters[2].xp)));
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[2].xpToNextLevel)));
                    }

                    case 3 -> {
                        name.setText(Main.characters[3].name);
                        sex.setText(Main.characters[3].sex);
                        job.setText(Main.characters[3].job);
                        level.setText(String.valueOf(Main.characters[3].level));
                        status.setText(Main.characters[3].status);
                        hp.setText(String.valueOf(Main.characters[3].hp));
                        str.setText(String.valueOf(Main.characters[3].str));
                        def.setText(String.valueOf(Main.characters[3].def));
                        con.setText(String.valueOf(Main.characters[3].con));
                        wis.setText(String.valueOf(Main.characters[3].wis));
                        spd.setText(String.valueOf(Main.characters[3].spd));
                        lck.setText(String.valueOf(Main.characters[3].lck));
                        xp.setText(String.valueOf(df.format(Main.characters[3].xp)));
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[3].xpToNextLevel)));
                    }

                    case 4 -> {
                        name.setText(Main.characters[4].name);
                        sex.setText(Main.characters[4].sex);
                        job.setText(Main.characters[4].job);
                        level.setText(String.valueOf(Main.characters[4].level));
                        status.setText(Main.characters[4].status);
                        hp.setText(String.valueOf(Main.characters[4].hp));
                        str.setText(String.valueOf(Main.characters[4].str));
                        def.setText(String.valueOf(Main.characters[4].def));
                        con.setText(String.valueOf(Main.characters[4].con));
                        wis.setText(String.valueOf(Main.characters[4].wis));
                        spd.setText(String.valueOf(Main.characters[4].spd));
                        lck.setText(String.valueOf(Main.characters[4].lck));
                        xp.setText(String.valueOf(df.format(Main.characters[4].xp)));
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[4].xpToNextLevel)));
                    }

                    case 5 -> {
                        name.setText(Main.characters[5].name);
                        sex.setText(Main.characters[5].sex);
                        job.setText(Main.characters[5].job);
                        level.setText(String.valueOf(Main.characters[5].level));
                        status.setText(Main.characters[5].status);
                        hp.setText(String.valueOf(Main.characters[5].hp));
                        str.setText(String.valueOf(Main.characters[5].str));
                        def.setText(String.valueOf(Main.characters[5].def));
                        con.setText(String.valueOf(Main.characters[5].con));
                        wis.setText(String.valueOf(Main.characters[5].wis));
                        spd.setText(String.valueOf(Main.characters[5].spd));
                        lck.setText(String.valueOf(Main.characters[5].lck));
                        xp.setText(String.valueOf(df.format(Main.characters[5].xp)));
                        xpToNextLevel.setText(String.valueOf(df.format(Main.characters[5].xpToNextLevel)));
                    }
                }
            }
        });
    }
}
