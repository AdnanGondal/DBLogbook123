package MainPage.Frames;

import javax.swing.*;
import java.awt.*;
//codes the frame that gives the user some info about how to use the code.
//Also will give info on the latest features that work.
public class HelpFrame extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Help");
    // Adapted from: https://stackoverflow.com/questions/10478420/jlabel-doesnt-show-a-long-paragraph

    //Below HTML is generated via: https://wordtohtml.net/
    private String test = "<html>" + "<p>Welcome to the Diabetic Logbook App.&nbsp;</p>\n" +
            "<p>Please read the help below.</p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>\n" +
            "<p><strong>Adding Entries</strong></p>\n" +
            "<p>You have the option to choose between three different methods of adding an entry for today's date:</p>\n" +
            "<p><em>Simple:&nbsp;</em>Enter the Blood Glucose Level and time.&nbsp;</p>\n" +
            "<p><em>Comprehensive:&nbsp;</em>You have the option to enter either the Blood Glucose Level, Exercise, Food or Medication.</p>\n" +
            "<p><em>Intensive</em>: You have the option to further group the above into type of Exercise, Meal and Medication.&nbsp;</p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>\n" +
            "<p><strong>View Entries</strong></p>\n" +
            "<p>Please type a date or select one via the calendar feature of the app.&nbsp;</p>\n" +
            "<p>A future version of this app will allow you to be able to see the entries for this date.&nbsp;</p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>\n" +
            "<p><strong>Other Features</strong></p>\n" +
            "<p>The Questionnaire function can allow you to record any unusual symptoms you may be facing.&nbsp;</p>\n" +
            "<p>The Settings Feature in a future version of the app will allow the user to modify their registration details as well as previous logbook entries. </p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>" +"</html>";

    private JLabel label = new JLabel(test);
    //End of Reference

    public HelpFrame(){
        setSize(400,500);
        setBackground(new Color(156, 234, 228));
        setTitle("Help"); //title of the frame

        panel.setLayout(null);

        title.setFont(new Font("Arial", Font.BOLD,  30));
        title.setSize(300, 40);
        title.setLocation(5, 2);
        panel.add(title);

        label.setFont(new Font("Arial", Font.PLAIN,  14));
        label.setSize(400, 450);
        label.setLocation(5, 45);
        panel.add(label);

        getContentPane().add(panel).setBackground(new Color(156, 234, 228));
    }
}
