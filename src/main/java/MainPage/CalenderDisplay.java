package MainPage;


import Entries.Food;
import Entries.Insulin;
import MainPage.ViewEntriesFrame;
import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;


public class CalenderDisplay extends JPanel {
    //The Class that codes for the user being able to select a date and then they may view entries for this date.
    private JPanel panel = new JPanel();
    private JXDatePicker picker = new JXDatePicker();
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private JButton viewEntries = new JButton("View Entries");
    private JLabel selectDate = new JLabel("Please Select a Date: ");

    public  CalenderDisplay() {
            setLayout(new GridLayout(1,1));

            panel.setBackground(new Color(160,255, 150));
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
               // System.out.println(df.format(picker.getDate()));
            }
        });
    }


}