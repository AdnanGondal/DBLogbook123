package MainPage;

import MainPage.InputPanels.IntensiveExerciseInput;
import MainPage.Methods.CompMethod;
import MainPage.Methods.IntensiveMethod;
import MainPage.Methods.Method;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntensiveFrame extends CompFrame {
    private JPanel CheckPanel = new JPanel();
    private IntensiveExerciseInput iei = new IntensiveExerciseInput();
    private JCheckBox ieiCheck = new JCheckBox("Add Exercise?");
    private JButton enteri = new JButton("Enter");


    public IntensiveFrame(){
        setTitle("New Intensive Input");
        setSize(300,1000);
        Panel.removeAll();
        Panel.setLayout(new GridLayout(7,1));
        //gicheck.setLocation(100,50);


        IntensiveExerciseInputCheck();
        CheckPanel.setBackground(new Color(160,255, 150));
        CheckPanel.add(gicheck);
        CheckPanel.add(ieiCheck);
        CheckPanel.add(fiCheck);
        CheckPanel.add(miCheck);
        Panel.add(CheckPanel);
        Panel.add(gi);
        Panel.add(iei);
        Panel.add(fi);
        Panel.add(mi);
        Panel.add(enteri);

        enteri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Method im = new IntensiveMethod();
                if (gicheck.isSelected()==true) {
                    ((IntensiveMethod) im).setBgl(gi.getTime(),gi.getuiGlucose());
                    //Next Lines are just to test only:
                    System.out.println("GI has been entered");
                    System.out.println("GI Date: "+((CompMethod) im).getBGL().getDate());
                    System.out.println("GI Time: "+((CompMethod) im).getBGL().getTime());
                    System.out.println("Glucose Level: "+((CompMethod) im).getBGL().getLevel());
                    //Add database code

                }
                if (ieiCheck.isSelected()==true) {
                    ((IntensiveMethod) im).setIntensiveExercise(iei.getuiExType(),iei.getuiExName(),iei.getStartTime(),iei.getEndTime());
                    //Next Lines are just to test only:
                    System.out.println("INTENSIVE Exercise has been entered");
                    System.out.println("Exercise Date: "+((IntensiveMethod) im).getExercise().getDate());
                    System.out.println("Exercise Start Time: "+((IntensiveMethod) im).getExercise().getStartTime());
                    System.out.println("Exercise End Time: "+((IntensiveMethod) im).getExercise().getEndTime());
                    System.out.println("Exercise Name: "+((IntensiveMethod) im).getExercise().getName());
                }




                setVisible(false);
                gi.reset();
                gi.setVisible(true);
                gicheck.setSelected(true);
                iei.reset();
                iei.setVisible(false);
                ieiCheck.setSelected(false);
                mi.reset();
                mi.setVisible(false);
                miCheck.setSelected(false);
                fi.reset();
                fi.setVisible(false);
                fiCheck.setSelected(false);
            }
        });

    }

    private void IntensiveExerciseInputCheck() {
        iei.setVisible(false);
        ieiCheck.setSelected(false);
        ieiCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ieiCheck.isSelected()==true) {iei.setVisible(true);}
                if (ieiCheck.isSelected()==false) {iei.setVisible(false);}
            }
        });
    }
}
