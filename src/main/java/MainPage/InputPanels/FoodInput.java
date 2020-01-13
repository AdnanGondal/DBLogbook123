package MainPage.InputPanels;

import MainPage.InputTools.TimeSelector;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

//Class that codes for user Food Input Panel.
public class FoodInput extends JPanel {

    protected JLabel timelabel = new JLabel("Food time:");
    protected TimeSelector ts = new TimeSelector();
    protected JLabel namelabel = new JLabel("Food Name: ");
    protected JFormattedTextField namefield = new JFormattedTextField();
    protected JLabel carblabel = new JLabel("Carbohydrates(g): ");
    protected JFormattedTextField carbfield = new JFormattedTextField();


    public FoodInput(){
        setLayout(new GridLayout(3,1));
        setBackground(new Color(160,255, 150));
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
        //set all text fields to original values and time selector to the current time.
        ts.reset();
        namefield.setText("e.g. Apple");
        carbfield.setText("");
    }
}
