package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class FoodInput extends JPanel {
    JLabel timelabel = new JLabel("Food time:");
    TimeSelector ts = new TimeSelector();
    JLabel namelabel = new JLabel("Food Name: ");
    JFormattedTextField namefield = new JFormattedTextField();
    JLabel carblabel = new JLabel("Carbohydrates(g): ");
    JFormattedTextField carbfield = new JFormattedTextField();


    public FoodInput(){
        setLayout(new GridLayout(3,1));
        namefield.setValue("e.g. Apple");
        carbfield.setValue(new Double(0.00));
        add(timelabel);
        add(ts);
        add(namelabel);
        add(namefield);
        add(carblabel);
        add(carbfield);

    }

    public Date getTime(){
        return ts.getUserTime();
    }
    public String getuiFoodName(){
        return (String) namefield.getValue();
    }
    public double getuiCarbAmmount(){return (double) carbfield.getValue();}

    public void reset(){
        ts.reset();
        namefield.setText("");
        carbfield.setText("");
    }
}
