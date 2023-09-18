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
        UIMethods.setBoxBounds(frame, characterBox, (x/4) - 300/4 + 5, (y/4) - (80), 80, 20);
        UIMethods.setButtonBounds(frame, levelUpButton, x/4 - 80, (y/4) + 225, 160, 25);
        UIMethods.setButtonBounds(frame, saveData, (x/4) - 300/3 + 5, (y/4) - 25, 80, 25);
        UIMethods.setButtonBounds(frame, loadData, (x/4) - 300/3 + 5, (y/4) + 10, 80, 25);
        UIMethods.setButtonBounds(frame, createNewCharacter, (x/4) - 300/3 + 120, (y/4) - (25), 80, 25);
        UIMethods.setButtonBounds(frame, deleteCharacter, (x/4) - 300/3 + 120, (y/4) + 10, 80, 25);

        // character data block
        UIMethods.setLabelBounds(frame, sex, (x/4) + 75, (y/4) - (60), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, job, (x/4) + 75, (y/4) - (80), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, level, (x/4) - 300/4 + 35, (y/4) - (60), jLabelW, jLabelH);

        // stat block
        UIMethods.setLabelBounds(frame, gold, (x/4) - 300/4, (y/4) + (50), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, status, (x/4) - 300/4, (y/4) + (65), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, hp, (x/4) - 300/4, (y/4) + 80, jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, str, (x/4) - 300/4, (y/4) + (95), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, def, (x/4) - 300/4, (y/4) + (110), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, con, (x/4) - 300/4, (y/4) + (125), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, wis, (x/4) - 300/4, (y/4) + (140), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, spd, (x/4) - 300/4, (y/4) + (155), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, lck, (x/4) - 300/4, (y/4) + (170), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, xp, (x/4) - 300/4, (y/4) + (185), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, xpToNextLevel, (x/4) - 300/4, (y/4) + (200), jLabelW, jLabelH);

        // equipment
        UIMethods.setLabelBounds(frame, mainWeapon, (x/2) - 300/4 - 20, (y/4) + (50), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, offHand, (x/2) - 300/4 - 20, (y/4) + (65), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, head, (x/2) - 300/4 - 20, (y/4) + 80, jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, neck, (x/2) - 300/4 - 20, (y/4) + (95), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, chest, (x/2) - 300/4 - 20, (y/4) + (110), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, hands, (x/2) - 300/4 - 20, (y/4) + (125), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, ring, (x/2) - 300/4 - 20, (y/4) + (140), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, belt, (x/2) - 300/4 - 20, (y/4) + (155), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, legs, (x/2) - 300/4 - 20, (y/4) + (170), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, feet, (x/2) - 300/4 - 20, (y/4) + (185), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, back, (x/2) - 300/4 - 20, (y/4) + (200), jLabelW, jLabelH);

        // top block labels
        UIMethods.setLabelBounds(frame, nameL, (x/4) - 300/3 - 15, (y/4) - (80), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, sexL, (x/4) - 300/3 + 130, (y/4) - (60), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, jobL, (x/4) - 300/3 + 130, (y/4) - (80), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, levelL, (x/4) - 300/3 - 15, (y/4) - (60), jLabelW, jLabelH);

        // lower block labels
        UIMethods.setLabelBounds(frame, goldL, (x/4) - 300/3 - 25, (y/4) + (50), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, statusL, (x/4) - 300/3 - 25, (y/4) + (65), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, hpL, (x/4) - 300/3 - 25, (y/4) + (80), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, strL, (x/4) - 300/3 - 25, (y/4) + (95), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, defL, (x/4) - 300/3 - 25, (y/4) + (110), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, conL, (x/4) - 300/3 - 25, (y/4) + (125), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, wisL, (x/4) - 300/3 - 25, (y/4) + (140), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, spdL, (x/4) - 300/3 - 25, (y/4) + (155), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, lckL, (x/4) - 300/3 - 25, (y/4) + (170), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, xpL, (x/4) - 300/3 - 25, (y/4) + (185), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, xpToNextLevelL, (x/4) - 300/3 - 25, (y/4) + (200), jLabelW, jLabelH);

        // equipment label
        UIMethods.setLabelBounds(frame, mainWeaponL, (x/2) - 300/3 - 55, (y/4) + (50), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, offHandL, (x/2) - 300/3 - 55, (y/4) + (65), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, headL, (x/2) - 300/3 - 55, (y/4) + 80, jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, neckL, (x/2) - 300/3 - 55, (y/4) + (95), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, chestL, (x/2) - 300/3 - 55, (y/4) + (110), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, handsL, (x/2) - 300/3 - 55, (y/4) + (125), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, ringL, (x/2) - 300/3 - 55, (y/4) + (140), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, beltL, (x/2) - 300/3 - 55, (y/4) + (155), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, legsL, (x/2) - 300/3 - 55, (y/4) + (170), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, feetL, (x/2) - 300/3 - 55, (y/4) + (185), jLabelW, jLabelH);
        UIMethods.setLabelBounds(frame, backL, (x/2) - 300/3 - 55, (y/4) + (200), jLabelW, jLabelH);

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        saveData.setEnabled(false);
        levelUpButton.setEnabled(false);

        // action listeners for buttons
        createNewCharacter.addActionListener(e -> Buttons.createCharacter());
        deleteCharacter.addActionListener(e -> Buttons.deleteCharacter());
        loadData.addActionListener(e -> Buttons.loadCharacterData());
        saveData.addActionListener(e -> Buttons.saveCharacterData());
        levelUpButton.addActionListener(e -> Buttons.giveXP());
        characterBox.addActionListener(e -> Buttons.selectCharacter());
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