import MainPage.MainPageUIControl;
import RegistrationPage.PersonalDetailsPanel;
//import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//This class codes for the registration page frame.
public class RegistrationFrame extends JFrame {

    private JPanel registrationPanel= new JPanel();
    private PersonalDetailsPanel pds = new PersonalDetailsPanel(); // see PersonalDetailsPanel class
    private JButton submitBut = new JButton("Sumbit");
    JFrame mainframe = new JFrame("Diabetic Logbook");
    MainPageUIControl mainPageUIControl = new MainPageUIControl(); //See MainPageUIControl class.


    public RegistrationFrame(){

        setSize(500, 575);
        setTitle("Registration Page");
        SetUpPanel();
        SetUpMainFrame();

        submitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubmitButPressed();
                }
            });
    }

    private void SubmitButPressed() {
        //What happens when the submit button is pressed.
        setVisible(false);
        mainframe.setVisible(true);

        try {
            pds.setRegistrationDetails();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Code below is to test that the object of RegistrationDetails has the user input registration details.
        //Instead of the code below printing to the console it will be sent to the server/
        System.out.println("Username: " + pds.getRegistrationDetails().getUserName());
        System.out.println("Password: " + pds.getRegistrationDetails().getPassword());
        System.out.println("Name: " + pds.getRegistrationDetails().getName());
        System.out.println("Email: " + pds.getRegistrationDetails().getEmail());
        System.out.println("Phone Number: " + pds.getRegistrationDetails().getPhone());
        System.out.println("Type of Diabetes: " + pds.getRegistrationDetails().getTypeofDiabetes());
        System.out.println("Insulin Administered By: " + pds.getRegistrationDetails().getInsulinAdmin());
        System.out.println("Doctor Name: " + pds.getRegistrationDetails().getDoctorname());
        System.out.println("Doctor Email: " + pds.getRegistrationDetails().getDoctorEmail());
        System.out.println("Phone Number: " + pds.getRegistrationDetails().getDoctorphone());

        //END of test.
    }

    private void SetUpMainFrame() {
        //Setting Up MainFrame (The Main Diabetic Logbook Frame)
        mainframe.setSize(500, 800);
        mainframe.setVisible(false);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.getContentPane().add(mainPageUIControl.getMainPanel()).setBackground(new Color(156, 234, 228));
    }

    private void SetUpPanel() {
        //Setting up Panels on the registration page frame.
        registrationPanel.setLayout(null);
        pds.setSize(500,500);
        pds.setLocation(0,0);
        pds.setBackground(new Color(156, 234, 228));//160 255 150
        submitBut.setSize(500,50);
        submitBut.setLocation(0,500);
        registrationPanel.add(pds);
        registrationPanel.add(submitBut);
        getContentPane().add(registrationPanel).setBackground(new Color(156, 234, 228));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}