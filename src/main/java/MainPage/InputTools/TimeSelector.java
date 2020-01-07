package MainPage.InputTools;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSelector extends JPanel {
    //This class codes the tool that allows the user to input a time. Objects of this class are repeated throughout the code.
    private Date time = new Date();
    private JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
    private JLabel label = new JLabel("Please Select the Time");
    //Adapted from https://stackoverflow.com/questions/654342/is-there-any-good-and-free-date-and-time-picker-available-for-java-swing

    public TimeSelector() {
        setLayout(new GridLayout(1,1));
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setValue(new Date()); // will only show the current time
        timeSpinner.setSize(40,10);
        //add(label);
        add(timeSpinner);
        TimeChanged();

    }

    private void TimeChanged() {
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
