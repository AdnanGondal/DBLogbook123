package MainPage.InputPanels;

import javax.swing.*;
import java.awt.*;

public class IntensiveExerciseInput extends ExerciseInput {
    //Class codes for exercise input for Intensive Method.
    private JLabel typetext = new JLabel("Exercise Type: ");
    //The options for the selection of type of exercise.
    private String[] typelist = {"Aerobic", "Strength","Flexibility","Balance"};
    private JComboBox<String> typeinput = new JComboBox<>(typelist);

    public IntensiveExerciseInput(){
        setLayout(new GridLayout(4,1));
        removeAll();
        typeinput.setSelectedIndex(0);
        nameinput.setValue( "e.g. Running");
        add(typetext);
        add(typeinput);
        add(nametext);
        add(nameinput);
        add(starttext);
        add(tstart);
        add(endtext);
        add(tend);
    }

    public String getuiExType(){return (String) typeinput.getSelectedItem();}
}
