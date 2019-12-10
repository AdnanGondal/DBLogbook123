package MainPage;

import MainPage.InputPanels.ExerciseInput;
import MainPage.InputPanels.FoodInput;
import MainPage.InputPanels.MedicationInput;
import MainPage.Methods.CompMethod;
import MainPage.Methods.Method;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompFrame extends SimpleFrame {
    ExerciseInput ei = new ExerciseInput();
    FoodInput fi = new FoodInput();
    MedicationInput mi = new MedicationInput();
    JCheckBox eiCheck = new JCheckBox("Add Exercise?");
    JCheckBox fiCheck = new JCheckBox("Add Food?");
    JCheckBox miCheck = new JCheckBox("Add Medication?");
    JButton enterc = new JButton("Enter");


    public CompFrame()
    {
        setSize(300,800);
        Panel.removeAll();
        Panel.setLayout(new GridLayout(9,1));

        //Below Codes the action of the Check boxes.
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
        enterc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Method cm = new CompMethod();
                if (gicheck.isSelected()==true) {
                    ((CompMethod) cm).setBgl(gi.getTime(),gi.getuiGlucose());
                    //Next 3 Lines are just to check only:
                    System.out.println("GI has been entered");
                    System.out.println("GI Date: "+((CompMethod) cm).getBGL().getDate());
                    System.out.println("GI Time: "+((CompMethod) cm).getBGL().getTime());
                    System.out.println("Glucose Level: "+((CompMethod) cm).getBGL().getLevel());

                }
                if (eiCheck.isSelected()==true) {
                    ((CompMethod) cm).setExercise(ei.getuiExName(),ei.getStartTime(),ei.getEndTime());
                    System.out.println("Exercise has been entered");
                    System.out.println("Exercise Date: "+((CompMethod) cm).getExercise().getDate());
                    System.out.println("Exercise Start Time: "+((CompMethod) cm).getExercise().getStartTime());
                    System.out.println("Exercise End Time: "+((CompMethod) cm).getExercise().getEndTime());
                    System.out.println("Exercise Name: "+((CompMethod) cm).getExercise().getType());
                }

                gi.emptyfield();
                setVisible(false);
            }
        });
    }


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
