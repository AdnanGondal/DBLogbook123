package MainPage;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class GlucoseInput extends JPanel {
    JLabel timelabel = new JLabel("Please Enter the time of the reading.");
    TimeSelector ts = new TimeSelector();
    JLabel text = new JLabel("Please enter your blood glucose level: ");
    JFormattedTextField uinput = new JFormattedTextField();


    public GlucoseInput(){

        setLayout(new GridLayout(4,1));
        uinput.setValue(new Double(0.00));
        add(timelabel);
        add(ts);
        add(text);
        add(uinput);

    }
    public double getuiGlucose(){return (double) uinput.getValue();}
    public Date getTime(){return ts.getUserTime();}
    public void emptyfield(){
        uinput.setText("");
    }
}
