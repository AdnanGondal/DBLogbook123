package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MedicationInput extends JPanel {
    private JLabel timelabel = new JLabel("Medication Time: ");
    private TimeSelector ts = new TimeSelector();
    private JLabel namelabel = new JLabel("Medicine Name: ");
    private JFormattedTextField typetext = new JFormattedTextField();
    private JLabel dosagelabel = new JLabel("Dosage: ");
    private JFormattedTextField dosagetext = new JFormattedTextField();

    public MedicationInput(){
        setLayout(new GridLayout(3,1));
        typetext.setValue("e.g. Insulin Injection");
        dosagetext.setValue("Dosage ");
        add(timelabel);
        add(ts);
        add(namelabel);
        add(typetext);
        add(dosagelabel);
        add(dosagetext);

    }

    public String getuiName(){
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
