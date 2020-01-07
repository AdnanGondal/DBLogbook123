package MainPage;

import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ViewEntriesFrame extends JFrame {
    JPanel Panel = new JPanel();
    private JLabel intro;
    private String SelectedDate;
    private JLabel result;


    public ViewEntriesFrame(String d){
        setSize(400,400);
        SelectedDate = d;
        intro = new JLabel("The Selected Date: "+ SelectedDate);
        intro.setFont(new Font("Arial", Font.PLAIN, 15));
        intro.setSize(300, 30);
        intro.setLocation(100, 20);



        //BELOW IS E.G. FOR CURRENT DATE TO CHECK IF CODE WORKS
        Method method = new SimpleMethod();
        ((SimpleMethod) method).getBGL().setDate(Calendar.getInstance().getTime());
        //ENTER CODE TO SEARCH THROUGH DATABASE AND MATCH THE METHOD(S) WITH THE SELECTED DATE

        //Use a for Loop to go through all the methods that have the selected date, and print them out as a JLabel???
        if (SelectedDate != method.getDate()) {
            result = new JLabel("No Entries for this date.");
            result.setFont(new Font("Arial", Font.PLAIN, 15));
            result.setSize(300, 30);
            result.setLocation(100, 40);
        }




        add(intro);
        add(result);
        getContentPane().add(Panel);

    }


}