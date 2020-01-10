package MainPage.InputPanels;

import javax.swing.*;
import java.awt.*;

public class IntensiveFoodInput extends FoodInput {
    //Class that codes for Food Input for Intensive Method (ie Food Diary).
    private JLabel typelabel = new JLabel("Meal Type:");
    private String[] typelist = {"Snack", "Breakfast","Lunch","Dinner"};
    private JComboBox<String> typeinput = new JComboBox<>(typelist);
    public IntensiveFoodInput(){
        removeAll();
        setLayout(new GridLayout(4,1));
        typeinput.setSelectedIndex(0);
        namefield.setValue("e.g. Apple");
        carbfield.setValue(new Double(0.00));

        add(typelabel);
        add(typeinput);
        add(timelabel);
        add(ts);
        add(namelabel);
        add(namefield);
        add(carblabel);
        add(carbfield);


    }

    public String getuiMealType(){return (String) typeinput.getSelectedItem();}
}
