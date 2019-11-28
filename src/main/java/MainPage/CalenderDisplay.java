package MainPage;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.*;


public class CalenderDisplay extends JPanel {


    private JXDatePicker picker = new JXDatePicker();

    public  CalenderDisplay() {
            JButton ViewEntries = new JButton("View Entries");
            JLabel selectDate = new JLabel("Please Select a Date: ");
            JPanel panel = new JPanel();
            picker.setDate(Calendar.getInstance().getTime());
            picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
            panel.add(picker);
            add(selectDate);
            add(picker);
            add(ViewEntries);
            ViewEntries.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Code for what to do when 'view entries' button is pressed.
                }
            });


    }




}