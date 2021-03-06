package MainPage.Frames;

import MainPage.InputPanels.ExerciseInput;
import MainPage.InputPanels.FoodInput;
import MainPage.InputPanels.MedicationInput;
import MainPage.Methods.CompMethod;
import MainPage.Methods.Method;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Codes for User Comprehensive input.

public class CompFrame extends SimpleFrame {

    protected ExerciseInput ei = new ExerciseInput();
    protected FoodInput fi = new FoodInput();
    protected MedicationInput mi = new MedicationInput();
    protected JCheckBox eiCheck = new JCheckBox("Add Exercise?");
    protected JCheckBox fiCheck = new JCheckBox("Add Food?");
    protected JCheckBox miCheck = new JCheckBox("Add Medication?");
    protected JButton enterc = new JButton("Enter");


    public CompFrame()
    {
        setTitle("New Comprehensive Input");
        setSize(300,800);
        Panel.removeAll();
        Panel.setLayout(new GridLayout(9,1));

        //Below Codes the action of the Checkboxes.
        GlucoseInputCheck();
        ExerciseInputCheck();
        FoodInputCheck();
        MedicationInputCheck();


        Panel.add(gicheck);
        Panel.add(gi);
        Panel.add(eiCheck);
        Panel.add(ei);
        Panel.add(fiCheck);
        Panel.add(fi);
        Panel.add(miCheck);
        Panel.add(mi);
        Panel.add(enterc);
        EntercButtonpressed();
        getContentPane().add(Panel);

    }

    private void EntercButtonpressed() {
        //What happens when enter button is pressed.
        enterc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Method cm = new CompMethod();
                //If each of the check boxes is ticked...:
                if (gicheck.isSelected()==true) {
                    ((CompMethod) cm).setBgl(gi.getTime(),gi.getuiGlucose());
                    //Next Lines are just to test only:
                    System.out.println("GI has been entered");
                    System.out.println("GI Date: "+((CompMethod) cm).getDate());
                    System.out.println("GI Time: "+((CompMethod) cm).getBGL().getTime());
                    System.out.println("Glucose Level: "+((CompMethod) cm).getBGL().getLevel());
                    //Add database code

                }
                if (eiCheck.isSelected()==true) {
                    ((CompMethod) cm).setExercise(ei.getuiExName(),ei.getStartTime(),ei.getEndTime());
                    //Next Lines are just to test only:
                    System.out.println("Exercise has been entered");
                    System.out.println("Exercise Date: "+((CompMethod) cm).getDate());
                    System.out.println("Exercise Start Time: "+((CompMethod) cm).getExercise().getStartTime());
                    System.out.println("Exercise End Time: "+((CompMethod) cm).getExercise().getEndTime());
                    System.out.println("Exercise Name: "+((CompMethod) cm).getExercise().getName());
                    //Add database code
                }
                if (fiCheck.isSelected()==true) {
                    ((CompMethod) cm).setFood(fi.getuiFoodName(),fi.getuiCarbAmmount(),fi.getTime());
                    //Next Lines are just to test only:
                    System.out.println("Food has been entered");
                    System.out.println("Food Date: "+ ((CompMethod) cm).getDate());
                    System.out.println("Food Time: "+ ((CompMethod) cm).getFood().getTime());
                    System.out.println("Food Name: " + ((CompMethod) cm).getFood().getName());
                    System.out.println("Carbohydrates (g): "+ ((CompMethod) cm).getFood().getCarbAmmount());


                }

                if (miCheck.isSelected()==true) {
                    ((CompMethod) cm).setMedication(mi.getuiName(),mi.getuiDosage(),mi.getTime());
                    //Next Lines are just to test only.
                    System.out.println("Medication has been entered");
                    System.out.println("Med Date: "+ ((CompMethod) cm).getDate());
                    System.out.println("Med Time: "+ ((CompMethod) cm).getMed().getTime());
                    System.out.println("Med Name: " + ((CompMethod) cm).getMed().getName());
                    System.out.println("Med Dosage: "+((CompMethod) cm).getMed().getDosage());

                }
                //Reset all input fields to original and close all the frames.
                resetAll();
                setVisible(false);
            }
        });
    }


    public void resetAll() {
        //set all the input fields to how they were originally.
        gi.reset();
        gi.setVisible(true);
        gicheck.setSelected(true);
        ei.reset();
        ei.setVisible(false);
        eiCheck.setSelected(false);
        mi.reset();
        mi.setVisible(false);
        miCheck.setSelected(false);
        fi.reset();
        fi.setVisible(false);
        fiCheck.setSelected(false);
    }

//Checkbox actions:
    private void MedicationInputCheck() {
        mi.setVisible(false);
        miCheck.setSelected(false);
        miCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (miCheck.isSelected()==true) {mi.setVisible(true);}
                if (miCheck.isSelected()==false) { mi.setVisible(false);}

            }
        });
    }

    private void FoodInputCheck() {
        fi.setVisible(false);
        fiCheck.setSelected(false);
        fiCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fiCheck.isSelected()==true) {fi.setVisible(true);}
                if (fiCheck.isSelected()==false) {fi.setVisible(false);}
            }
        });
    }

    private void ExerciseInputCheck() {
        ei.setVisible(false);
        eiCheck.setSelected(false);
        eiCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (eiCheck.isSelected()==true) {ei.setVisible(true);}
                if (eiCheck.isSelected()==false) {ei.setVisible(false);}

        }

        });
    }

    private void GlucoseInputCheck() {
        gicheck.setSelected(true);
        gicheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gicheck.isSelected()==true) {gi.setVisible(true); }
                if (gicheck.isSelected()==false) {gi.setVisible(false);}
            }
        });
    }

}
