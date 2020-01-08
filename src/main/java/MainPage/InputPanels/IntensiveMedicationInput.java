package MainPage.InputPanels;


import javax.swing.*;
import java.awt.*;

public class IntensiveMedicationInput extends MedicationInput {
    private JLabel typelabel = new JLabel("Medication Type:");
    private String[] typelist = {"Tablets", "Insulin"};
    private JComboBox<String> typeinput = new JComboBox<>(typelist);

    public IntensiveMedicationInput(){
    removeAll();
    setLayout(new GridLayout(4,1));
    typeinput.setSelectedIndex(0);
    nametext.setValue("e.g. Metformin");
    dosagetext.setValue("Dosage ");
    add(typelabel);
    add(typeinput);
    add(timelabel);
    add(ts);
    add(namelabel);
    add(nametext);
    add(dosagelabel);
    add(dosagetext);

    }
    public String getuiMedType(){return (String) typeinput.getSelectedItem();}
}
