import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUI
{
    // UI initialization
    static JFrame createFrame = new JFrame("");
    static int x = 300;
    static int y = 225;
    static Button create = new Button("Create Player");
    static Button cancelCreate = new Button("Cancel");

    static JTextField name = new JTextField();

    static JLabel nameL = new JLabel("Name:");
    static JLabel jobL = new JLabel("Job:");
    static JLabel gearL = new JLabel("Gear:");
    static JLabel sexL = new JLabel("Sex:");

    // stupid boolean check - so that the create character button does fire multiple times
    static boolean notAdded = true;

    // create player UI
    public static void createPlayerUI()
    {
        // job and sex boxes
        JComboBox characterJob = new JComboBox();
        JComboBox characterSex = new JComboBox();
        JComboBox characterEquipment = new JComboBox();

        // creates program window
        createFrame.setTitle("Create New Character");
        createFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFrame.setSize(x, y);
        createFrame.setLocationRelativeTo(null);

        createFrame.setLayout(null);
        createFrame.setVisible(true);

        name.setBounds(x/2 - 45, (y/2) - (110), 100, 30);
        nameL.setBounds((x/2) - 90, (y/2) - (110), 100, 30);

        characterJob.setBounds(x/2 - 45, (y/2) - (75), 100, 30);
        jobL.setBounds((x/2) - 90, (y/2) - (75), 100, 30);

        characterEquipment.setBounds(x/2 - 45, (y/2) - (40), 100, 30);
        gearL.setBounds((x/2) - 90, (y/2) - (40), 100, 30);

        characterSex.setBounds(x/2 - 45, y/2 - 5, 100, 30);
        sexL.setBounds((x/2) - 90, y/2 - 5, 100, 30);

        create.setBounds((x/2) - 110, (y/2) + 30, 100, 30);

        cancelCreate.setBounds((x/2), (y/2) + 30, 100, 30);

        // add data and labels to the frame
        createFrame.getContentPane().add(name);
        createFrame.getContentPane().add(nameL);
        createFrame.getContentPane().add(characterJob);
        createFrame.getContentPane().add(jobL);
        createFrame.getContentPane().add(characterEquipment);
        createFrame.getContentPane().add(gearL);
        createFrame.getContentPane().add(characterSex);
        createFrame.getContentPane().add(sexL);
        createFrame.getContentPane().add(create);
        createFrame.getContentPane().add(cancelCreate);

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
        create.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                createFrame.revalidate();

                if (notAdded)
                {
                    notAdded = false;

                    createPlayer(
                            name.getText(),
                            characterJob.getSelectedItem().toString(),
                            characterSex.getSelectedItem().toString(),
                            characterEquipment.getSelectedItem().toString());

                    createFrame.dispose();
                    create.setEnabled(false);
                }
            }
        });

        cancelCreate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                createFrame.dispose();
            }
        });
    }

    // creates a new character with the defined attributes
    public static void createPlayer(String name, String job, String sex, String equip)
    {
        Player player = new Player(name, job, sex, equip);

        for (int i = 0; i < Main.characters.length; i++)
        {
            if (Main.characters[i] == null)
            {
                Main.characters[i] = player;
                Main.characters[i].gearEquipped();
                break;
            }
        }
        StatUI.characterBox.addItem(name);
    }
}