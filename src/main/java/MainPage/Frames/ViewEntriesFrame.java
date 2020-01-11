package MainPage.Frames;

import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ViewEntriesFrame extends JFrame {
    JPanel panel = new JPanel();
    private JLabel intro;
    private String SelectedDate;
    private JLabel result;


    public ViewEntriesFrame(String d){
        setSize(400,400);
        setTitle("View Entries");
        panel.setLayout(null);

        SelectedDate = d;
        intro = new JLabel("The Selected Date: "+ SelectedDate);
        intro.setFont(new Font("Arial", Font.PLAIN, 20));
        intro.setSize(300, 30);
        intro.setLocation(5, 5);



        //BELOW IS E.G. FOR CURRENT DATE TO CHECK IF CODE WORKS
        Method method = new SimpleMethod();

        //ENTER CODE TO SEARCH THROUGH DATABASE AND MATCH THE METHOD(S) WITH THE SELECTED DATE...Add them to an array
        //here and iterate through the array to display all the information.

        //Use a for Loop to go through all the methods that have the selected date, and print them out as a JLabel???



        //Below: What to do if there is no entries for the selected date. (Incomplete)
        if (SelectedDate != ((SimpleMethod) method).getDate()) {
            result = new JLabel("No Entries for this date.");
            result.setFont(new Font("Arial", Font.PLAIN, 20));
            result.setSize(300, 30);
            result.setLocation(5, 40);
        }

        if (SelectedDate== ((SimpleMethod) method).getDate()){
            result = new JLabel("There are entries for this date.");
            result.setFont(new Font("Arial", Font.PLAIN, 20));
            result.setSize(300, 30);
            result.setLocation(5, 40);
        }


        panel.add(intro);
        panel.add(result);
        getContentPane().add(panel).setBackground(new Color(156, 234, 228));

    }


}