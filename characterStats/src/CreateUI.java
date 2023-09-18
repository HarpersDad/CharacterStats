import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CreateUI
{
    // create player UI
    public static void createPlayerUI()
    {
        // job and sex boxes
        characterJob = new JComboBox<>();
        characterSex = new JComboBox<>();
        characterEquipment = new JComboBox<>();

        // creates program window
        createFrame.setTitle("Create New Character");
        createFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFrame.setSize(x, y);
        createFrame.setLocationRelativeTo(null);
        createFrame.setLayout(null);
        createFrame.setVisible(true);
        createFrame.getContentPane().setBackground(Color.getHSBColor(0.66f,.80f,.80f));

        // labels
        UIMethods.setLabelBounds(createFrame, nameL, (x/2) - 90, (y/2) - (105), jLabelW, jLabelH);
        UIMethods.setLabelBounds(createFrame, jobL, (x/2) - 90, (y/2) - (70), jLabelW, jLabelH);
        UIMethods.setLabelBounds(createFrame, gearL, (x/2) - 90, (y/2) - (35), jLabelW, jLabelH);
        UIMethods.setLabelBounds(createFrame, sexL, (x/2) - 90, (y/2), jLabelW, jLabelH);

        // Boxes, Buttons, and Text Fields
        UIMethods.setTextBounds(createFrame, name, x/2 - 45, (y/2) - (110), 100, 30);

        UIMethods.setBoxBounds(createFrame, characterJob, x/2 - 45, (y/2) - (75), 100, 30);
        UIMethods.setBoxBounds(createFrame, characterEquipment, x/2 - 45, (y/2) - (40), 100, 30);
        UIMethods.setBoxBounds(createFrame, characterSex, x/2 - 45, (y/2) - (5), 100, 30);

        UIMethods.setButtonBounds(createFrame, create, (x/2) - 110, (y/2) + 30, 100, 30);
        UIMethods.setButtonBounds(createFrame, cancelCreate, (x/2), (y/2) + 30, 100, 30);

        // adds data to combo box
        // populate job box
        for (int i = 0; i < Player.jobs.length; i++)
        {
            characterJob.addItem(Player.jobs[i]);
        }

        // populate sex box
        for (int i = 0; i < Player.sexes.length; i++)
        {
            characterSex.addItem(Player.sexes[i]);
        }

        // populate gear box
        for (int i = 0; i < Player.equipSets.length; i++)
        {
            characterEquipment.addItem(Player.equipSets[i]);
        }

        // stops user from closing creation window
        // if a user would close the creation window it would close the entire program
        createFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // stops user from maximizing window
        createFrame.setResizable(false);

        // create character button
        create.addActionListener(e ->
        {
            createFrame.revalidate();

            if (notAdded)
            {
                notAdded = false;

                UIMethods.createPlayer(
                        name.getText(),
                        Objects.requireNonNull(characterJob.getSelectedItem()).toString(),
                        Objects.requireNonNull(characterSex.getSelectedItem()).toString(),
                        Objects.requireNonNull(characterEquipment.getSelectedItem()).toString()
                );

                createFrame.getContentPane().removeAll();
                createFrame.dispose();
                create.setEnabled(false);
                StatUI.saveData.setEnabled(true);
                StatUI.levelUpButton.setEnabled(true);
                StatUI.deleteCharacter.setEnabled(true);
            }
        });

        // when canceled this closes the create window
        cancelCreate.addActionListener(e ->
                {
                    createFrame.getContentPane().removeAll();
                    createFrame.dispose();
                });
    }

    // UI initialization
    static JFrame createFrame = new JFrame("");
    static int x = 300;
    static int y = 225;
    static int jLabelW = 150;
    static int jLabelH = 20;
    static Button create = new Button("Create Player");
    static Button cancelCreate = new Button("Cancel");
    static JTextField name = new JTextField("");
    static JComboBox<String> characterJob;
    static JComboBox<String> characterSex;
    static JComboBox<String> characterEquipment;
    static JLabel nameL = new JLabel("Name:");
    static JLabel jobL = new JLabel("Job:");
    static JLabel gearL = new JLabel("Gear:");
    static JLabel sexL = new JLabel("Sex:");

    // stupid boolean check - so that the create character button does fire multiple times
    static boolean notAdded = true;
}