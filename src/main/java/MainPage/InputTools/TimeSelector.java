package MainPage.InputTools;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSelector extends JPanel {
    Date time = new Date();
    JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
    //Adapted from https://stackoverflow.com/questions/654342/is-there-any-good-and-free-date-and-time-picker-available-for-java-swing
    public TimeSelector()


    {   setLayout(new GridLayout(1,1));
        JLabel label = new JLabel("Please Select the Time");

        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setValue(new Date()); // will only show the current time
        timeSpinner.setSize(40,10);
        //add(label);
        add(timeSpinner);
        timeSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                time = (Date) timeSpinner.getValue();
            }
        });


    }

    public void reset(){
        timeSpinner.setValue(new Date());
    }

    public Date getUserTime(){
       return time;
    }


}
