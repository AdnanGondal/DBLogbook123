package MainPage.Frames;

import javax.swing.*;
import java.awt.*;

public class HelpFrame extends JFrame {
    //codes the frame that gives the user some info about how to use the code.
    //Also will give info on the latest features that work.
    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Help");
    // Adapted from: https://stackoverflow.com/questions/10478420/jlabel-doesnt-show-a-long-paragraph

    //Below HTML is generated via: https://wordtohtml.net/
    private String test = "<html>" + "<p>Welcome to the Diabetic Logbook App.</p>\n" +
            "<p>Please read the help below.</p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>\n" +
            "<p><strong>Adding Entries:</strong></p>\n" +
            "<p>You have the option to choose between three different methods for entering an input.&nbsp;</p>\n" +
            "<p><em>Simple:</em> Just Enter the Blood Glucose Level and Time.</p>\n" +
            "<p><em>Comprehensive:</em> You have the option to add either Blood Glucose Level, Exercise, Food or Medication.&nbsp;</p>\n" +
            "<p><em>Intensive:</em> You have the option to further group the above into type of Exercise, Medication and Meal.</p>\n" +
            "<p>\n" +
            "  <br>\n" +
            "</p>\n" +
            "<p><strong>View Entries</strong></p>\n" +
            "<p>Please type a date, or select one via the calendar feature of this app.&nbsp;</p>\n" +
            "<p>And then press the 'View Entries' button to view all the entries for that date.&nbsp;</p>\n" +
            "<p>This feature is currently limited to ..&nbsp;</p>"+"</html>";

    private JLabel label = new JLabel(test);
    //End of Reference

    public HelpFrame(){
        setSize(400,400);
        setBackground(new Color(156, 234, 228));
        setTitle("Help"); //title of the frame

        panel.setLayout(null);

        title.setFont(new Font("Arial", Font.BOLD,  30));
        title.setSize(300, 30);
        title.setLocation(5, 2);
        panel.add(title);

        label.setFont(new Font("Arial", Font.PLAIN,  12));
        label.setSize(400, 300);
        label.setLocation(5, 0);
        panel.add(label);

        getContentPane().add(panel).setBackground(new Color(156, 234, 228));
    }
}
