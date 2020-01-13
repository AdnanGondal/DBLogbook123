package MainPage.InputTools;


import MainPage.Frames.ViewEntriesFrame;
import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

//The Class that codes for the user being able to select a date by either entering it or selecting via Calender.
//Adapted From https://stackoverflow.com/questions/11736878/display-calendar-to-pick-a-date-in-java
public class CalenderDisplay extends JPanel {


    private JPanel panel = new JPanel();
    private JXDatePicker picker = new JXDatePicker();
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private JButton viewEntries = new JButton("View Entries");
    private JLabel selectDate = new JLabel("Please Select a Date: ");


    public  CalenderDisplay() {
            setLayout(new GridLayout(1,1));

            panel.setBackground(new Color(156, 234, 228));
            picker.setDate(Calendar.getInstance().getTime());
            picker.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
            panel.add(selectDate);
            panel.add(picker);
            panel.add(viewEntries);
            add(panel);

            ViewEntriesPressed();
            DateChanged();
    }

    private void DateChanged() {
        picker.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    picker.setDate(picker.getDate());
                }

            });
    }

    private void ViewEntriesPressed() {
        //Code for what happens when 'View Entries' Button is pressed.
        viewEntries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewEntriesFrame vef = new ViewEntriesFrame(df.format(picker.getDate()));
                vef.setVisible(true);
                vef.CheckSelectedDate();
               // System.out.println(df.format(picker.getDate()));
            }
        });
    }


}