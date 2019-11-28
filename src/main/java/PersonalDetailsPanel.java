import javax.swing.*;
import java.awt.*;

public class PersonalDetailsPanel extends JPanel {
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    public PersonalDetailsPanel()
    { //Adapted from: https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/

        setLayout(null);

         title = new JLabel("Registration Form");
         title.setFont(new Font("Arial", Font.PLAIN, 30));
         title.setSize(300, 30);
         title.setLocation(100, 20);
         add(title);

        title = new JLabel("Personal Details: ");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(300, 30);
        title.setLocation(100, 50);
        add(title);

         name = new JLabel("Name");
         name.setFont(new Font("Arial", Font.PLAIN, 20));
         name.setSize(100, 20);
         name.setLocation(100, 80);
         add(name);

         tname = new JTextField();
         tname.setFont(new Font("Arial", Font.PLAIN, 15));
         tname.setSize(150, 20);
         tname.setLocation(200, 80);
         add(tname);

         mno = new JLabel("Email");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(150, 20);
        mno.setLocation(100, 100);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 100);
        add(tmno);


    }
}
