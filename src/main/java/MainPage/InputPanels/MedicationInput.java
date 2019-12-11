package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MedicationInput extends JPanel {
    JLabel timelabel = new JLabel("Medication Time: ");
    TimeSelector ts = new TimeSelector();
    JLabel typelabel = new JLabel("Medicine Type: ");
    JFormattedTextField typetext = new JFormattedTextField();
    JLabel dosagelabel = new JLabel("Dosage: ");
    JFormattedTextField dosagetext = new JFormattedTextField();

    public MedicationInput(){
        setLayout(new GridLayout(3,1));
        typetext.setValue("e.g. Insulin Injection");
        dosagetext.setValue("Dosage ");
        add(timelabel);
        add(ts);
        add(typelabel);
        add(typetext);
        add(dosagelabel);
        add(dosagetext);

    }

    public String getuiType(){
        return (String) typetext.getValue();
    }

    public String getuiDosage(){
        return (String) dosagetext.getValue();
    }

    public Date getTime(){
        return ts.getUserTime();
    }
    public void reset(){
        ts.reset();
        typetext.setText("");
        dosagetext.setText("");
    }

}
