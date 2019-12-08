package MainPage;

import javax.swing.*;
import java.awt.*;

public class MedicationInput extends JPanel {
    JLabel timelabel = new JLabel("Medication Time: ");
    TimeSelector ts = new TimeSelector();
    JLabel typelabel = new JLabel("Medicine Type: ");
    JFormattedTextField typetext = new JFormattedTextField();
    JLabel dosagelabel = new JLabel("Dosage: ");
    JFormattedTextField dosagetext = new JFormattedTextField();

    public MedicationInput(){
        setLayout(new GridLayout(3,1));
        add(timelabel);
        add(ts);
        add(typelabel);
        add(typetext);
        add(dosagelabel);
        add(dosagetext);

    }
}
