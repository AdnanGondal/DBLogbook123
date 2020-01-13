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
    private JPanel panel = new JPanel();
    private JLabel intro;
    private String SelectedDate;
    private JLabel result;
    private Method method = new SimpleMethod();


    public ViewEntriesFrame(String d){
        setSize(400,400);
        setTitle("View Entries");
        panel.setLayout(null);


        SelectedDate = d;
        intro = new JLabel("The Selected Date: "+ SelectedDate);
        intro.setFont(new Font("Arial", Font.PLAIN, 20));
        intro.setSize(300, 30);
        intro.setLocation(5, 5);
        System.out.println(d);



        panel.add(intro);
        //panel.add(result);
        getContentPane().add(panel).setBackground(new Color(156, 234, 228));



    }


    public void CheckSelectedDate(){
        //just for testing only:
        //HERE ENTER CODE TO SEARCH THROUGH DATABASE INSTEAD.
        if (method.getDate()== SelectedDate){
            result = new JLabel("This is today's date");
            result.setFont(new Font("Arial", Font.PLAIN, 20));
            result.setSize(300, 30);
            result.setLocation(5, 40);
            panel.add(result);
        }
        if (method.getDate() != SelectedDate) {
            result = new JLabel("No Entries for this date.");
            result.setFont(new Font("Arial", Font.PLAIN, 20));
            result.setSize(300, 30);
            result.setLocation(5, 40);
            //System.out.println(method.getDate());
            panel.add(result);

        }

    }

}