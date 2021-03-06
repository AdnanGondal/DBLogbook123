package MainPage.Frames;
import MainPage.Frames.CompFrame;
import MainPage.InputPanels.IntensiveExerciseInput;
import MainPage.InputPanels.IntensiveFoodInput;
import MainPage.InputPanels.IntensiveMedicationInput;
import MainPage.Methods.CompMethod;
import MainPage.Methods.IntensiveMethod;
import MainPage.Methods.Method;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Class codes for the user Intensive method input.
public class IntensiveFrame extends CompFrame {

    private JPanel CheckPanel = new JPanel();
    private IntensiveExerciseInput iei = new IntensiveExerciseInput();
    private IntensiveMedicationInput imi = new IntensiveMedicationInput();
    private IntensiveFoodInput ifi = new IntensiveFoodInput();
    private JCheckBox ieiCheck = new JCheckBox("Add Exercise?");
    private JCheckBox imiCheck = new JCheckBox("Add Medication?");
    private JCheckBox ifiCheck = new JCheckBox("Add Food?");
    private JButton enteri = new JButton("Enter");


    public IntensiveFrame(){
        setTitle("New Intensive Input");
        setSize(300,1000);
        Panel.removeAll();
        Panel.setLayout(new GridLayout(6,1));

        //Functions below code for action of checkboxes.
        IntensiveExerciseInputCheck();
        IntensiveMedicationInputCheck();
        IntensiveFoodInputCheck();

        CheckPanel.setBackground(new Color(160,255, 150));
        CheckPanel.add(gicheck);
        CheckPanel.add(ieiCheck);
        CheckPanel.add(ifiCheck);
        CheckPanel.add(imiCheck);
        Panel.add(CheckPanel);
        Panel.add(gi);
        Panel.add(iei);
        Panel.add(ifi);
        Panel.add(imi);
        Panel.add(enteri);
        EnteriButPressed();

    }

    private void EnteriButPressed() {
        //What happens when the enter button is pressed.
        enteri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Method im = new IntensiveMethod();
                if (gicheck.isSelected()==true) {
                    ((IntensiveMethod) im).setBgl(gi.getTime(),gi.getuiGlucose());
                    //Next Lines are just to test only:
                    System.out.println("GI has been entered");
                    System.out.println("GI Date: "+((IntensiveMethod) im).getDate());
                    System.out.println("GI Time: "+((IntensiveMethod) im).getBGL().getTime());
                    System.out.println("Glucose Level: "+((IntensiveMethod) im).getBGL().getLevel());
                    //Add database code

                }
                if (ieiCheck.isSelected()==true) {
                    ((IntensiveMethod) im).setIntensiveExercise(iei.getuiExType(),iei.getuiExName(),iei.getStartTime(),iei.getEndTime());
                    //Next Lines are just to test only:
                    System.out.println("INTENSIVE Exercise has been entered");
                    System.out.println("Exercise Date: "+((IntensiveMethod) im).getDate());
                    System.out.println("Exercise Start Time: "+((IntensiveMethod) im).getExercise().getStartTime());
                    System.out.println("Exercise End Time: "+((IntensiveMethod) im).getExercise().getEndTime());
                    System.out.println("Exercise Name: "+((IntensiveMethod) im).getExercise().getName());
                    System.out.println("Exercise Type: "+((IntensiveMethod) im).getExercise().getType());
                    //Add database code.
                }

                if (ifiCheck.isSelected()==true) {
                    ((IntensiveMethod) im).setIntensiveFood(ifi.getuiMealType(),ifi.getuiFoodName(),ifi.getTime(),ifi.getuiCarbAmmount());
                    System.out.println("INTENSIVE Food has been entered");
                    System.out.println("Food Date: "+((IntensiveMethod) im).getDate());
                    System.out.println("Food Time: "+((IntensiveMethod) im).getFood().getTime());
                    System.out.println("Food Name: "+((IntensiveMethod) im).getFood().getName());
                    System.out.println("Food Type: "+((IntensiveMethod) im).getFood().getMealType());
                    System.out.println("Carb Amount: "+((IntensiveMethod) im).getFood().getCarbAmmount());
                    //Add database code.
                }

                if (imiCheck.isSelected()==true){
                    ((IntensiveMethod) im).setIntensiveMed(imi.getuiMedType(),imi.getuiName(),imi.getTime(),imi.getuiDosage());
                    System.out.println("INTENSIVE Med has been entered");
                    System.out.println("Med Date: "+((IntensiveMethod) im).getDate());
                    System.out.println("Med Time: "+((IntensiveMethod) im).getMed().getTime());
                    System.out.println("Med Name: "+((IntensiveMethod) im).getMed().getName());
                    System.out.println("Med Type: "+((IntensiveMethod) im).getMed().gettype());
                    System.out.println("Med Dosage: "+((IntensiveMethod) im).getMed().getDosage());


                    //Add database code
                }
                setVisible(false);
                ResetAllIntensive();


            }
        });
    }

    public void ResetAllIntensive() {
        //Reset Frame:

        gi.reset();
        gi.setVisible(true);
        gicheck.setSelected(true);
        iei.reset();
        iei.setVisible(false);
        ieiCheck.setSelected(false);
        imi.reset();
        imi.setVisible(false);
        imiCheck.setSelected(false);
        ifi.reset();
        ifi.setVisible(false);
        ifiCheck.setSelected(false);
    }

    private void IntensiveFoodInputCheck() {
        ifi.setVisible(false);
        ifiCheck.setSelected(false);
        ifiCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ifiCheck.isSelected()==true) {ifi.setVisible(true);}
                if (ifiCheck.isSelected()==false) {ifi.setVisible(false);}
            }
        });
    }

    private void IntensiveMedicationInputCheck() {
        imi.setVisible(false);
        imiCheck.setSelected(false);
        imiCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imiCheck.isSelected()==true) {imi.setVisible(true);}
                if (imiCheck.isSelected()==false) {imi.setVisible(false);}
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
