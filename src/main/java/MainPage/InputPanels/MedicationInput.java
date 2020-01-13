package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
//Class that codes for Medication Input Panel.
public class MedicationInput extends JPanel {

    protected JLabel timelabel = new JLabel("Medication Time: ");
    protected TimeSelector ts = new TimeSelector();
    protected JLabel namelabel = new JLabel("Medication Name: ");
    protected JFormattedTextField nametext = new JFormattedTextField();
    protected JLabel dosagelabel = new JLabel("Dosage: ");
    protected JFormattedTextField dosagetext = new JFormattedTextField();

    public MedicationInput(){
        setLayout(new GridLayout(3,1));
        setBackground(new Color(160,255, 150));
        nametext.setValue("e.g. Metformin");
        dosagetext.setValue("Dosage ");
        add(timelabel);
        add(ts);
        add(namelabel);
        add(nametext);
        add(dosagelabel);
        add(dosagetext);

    }

    public String getuiName(){
        return (String) nametext.getValue();
    }

    public String getuiDosage(){
        return (String) dosagetext.getValue();
    }

    public Date getTime(){
        return ts.getUserTime();
    }
    public void reset(){
        ts.reset();
        nametext.setText("e.g. Metformin");
        dosagetext.setText("");
    }

}
