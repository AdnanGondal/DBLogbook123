package MainPage.InputPanels;

import javax.swing.*;
import java.awt.*;

//Class that codes for Food Input Panel for Intensive Method (ie Food Diary).
public class IntensiveFoodInput extends FoodInput {

    private JLabel typelabel = new JLabel("Meal Type:");
    //The type of meals the user can enter:
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
