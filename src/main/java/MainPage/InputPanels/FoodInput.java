package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;

public class FoodInput extends JPanel {
    JLabel timelabel = new JLabel("Food time:");
    TimeSelector ts = new TimeSelector();
    JLabel namelabel = new JLabel("Food Name: ");
    JFormattedTextField namefield = new JFormattedTextField();
    JLabel carblabel = new JLabel("Carbohydrates Amount(grams): ");
    JFormattedTextField carbfield = new JFormattedTextField();


    public FoodInput(){
        setLayout(new GridLayout(3,1));
        add(timelabel);
        add(ts);
        add(namelabel);
        add(namefield);
        add(carblabel);
        add(carbfield);
    }
}
