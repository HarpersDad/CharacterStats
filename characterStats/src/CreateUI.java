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

    // combo box and button(s)
    static JComboBox characterJob;
    static JComboBox characterSex;
    static Button create = new Button("Create Player");

    static JTextField name = new JTextField();

    static JLabel nameL = new JLabel("Name:");
    static JLabel jobL = new JLabel("Job:");
    static JLabel sexL = new JLabel("Sex:");

    // stupid boolean check - so that the create character button does fire multiple times
    static boolean notAdded = true;

    // create player UI
    public static void createPlayerUI()
    {
        // job and sex boxes
        characterJob = new JComboBox();
        characterSex = new JComboBox();

        // creates program window
        createFrame.setTitle("Create New Character");
        createFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFrame.setSize(x, y);
        createFrame.setLocationRelativeTo(null);

        createFrame.setLayout(null);
        createFrame.setVisible(true);

        name.setBounds(x/2 - 45, (y/2) - (100), 100, 30);
        nameL.setBounds((x/2) - 90, (y/2) - (100), 100, 30);

        characterJob.setBounds(x/2 - 45, (y/2) - (60), 100, 30);
        jobL.setBounds((x/2) - 90, (y/2) - (60), 100, 30);

        characterSex.setBounds(x/2 - 45, y/2 - 20, 100, 30);
        sexL.setBounds((x/2) - 90, y/2 - 20, 100, 30);

        create.setBounds((x/2) - 68, (y/2) + 20, 100, 30);

        // add data and labels to the frame
        createFrame.getContentPane().add(name);
        createFrame.getContentPane().add(nameL);
        createFrame.getContentPane().add(characterJob);
        createFrame.getContentPane().add(jobL);
        createFrame.getContentPane().add(characterSex);
        createFrame.getContentPane().add(sexL);
        createFrame.getContentPane().add(create);

        // adds data to combo box
        fillBox();

        // create character button
        create.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (notAdded)
                {
                    notAdded = false;
                    createPlayer(name.getText(), characterJob.getSelectedItem().toString(), characterSex.getSelectedItem().toString());
                    createFrame.dispose();
                    create.setEnabled(false);
                }

            }
        });
    }

    // adds data to combo box
    public static void fillBox()
    {
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
    }

    // creates a new character with the defined attributes
    public static void createPlayer(String name, String job, String sex)
    {
        Player player = new Player(name, job, sex);

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
