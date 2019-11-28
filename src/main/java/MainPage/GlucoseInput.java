package MainPage;

import javax.swing.*;
import java.awt.*;

public class GlucoseInput extends JPanel {
    JLabel text = new JLabel("Please enter your blood glucose level: ");
    JFormattedTextField uinput = new JFormattedTextField();
    public GlucoseInput(){

        setLayout(new GridLayout(2,1));
        uinput.setValue(new Double(0.00));
        add(text);
        add(uinput);

    }
    public double gettext(){return (double) uinput.getValue();}
    public void emptytext(){
        uinput.setText("");
    }
}
