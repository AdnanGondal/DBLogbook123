package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ExerciseInput extends JPanel {
    JLabel nametext = new JLabel("Exercise Name: ");
    JFormattedTextField nameinput = new JFormattedTextField();
    JLabel starttext = new JLabel("Exercise Start Time: ");
    TimeSelector tstart = new TimeSelector();
    JLabel endtext = new JLabel("Exercise End Time: ");
    TimeSelector tend = new TimeSelector();

    public ExerciseInput(){
        setLayout(new GridLayout(3,1));
        nameinput.setValue( "e.g. Running");

        add(nametext);
        add(nameinput);
        add(starttext);
        add(tstart);
        add(endtext);
        add(tend);
    }

    public Date getStartTime(){return tstart.getUserTime();}
    public Date getEndTime(){return tend.getUserTime(); }
    public String getuiExName(){return (String) nameinput.getValue();}
    public void reset(){
        nameinput.setText("e.g. Running");
        tstart.reset();
        tend.reset();
    }


}
