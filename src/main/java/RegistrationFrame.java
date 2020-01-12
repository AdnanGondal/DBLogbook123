import MainPage.MainPageUIControl;
import RegistrationPage.PersonalDetailsPanel;
//import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistrationFrame extends JFrame {

    private JPanel registrationPanel= new JPanel();
    private PersonalDetailsPanel pds = new PersonalDetailsPanel(); // see PersonalDetailsPanel class
    private JButton submitBut = new JButton("Sumbit");
    JFrame mainframe = new JFrame();
    MainPageUIControl mainPageUIControl = new MainPageUIControl();


    public RegistrationFrame(){

        setSize(500, 575);
        //setVisible(true);
        setName("Registration Page");
        registrationPanel.setLayout(null);

        //Setting up Panels on the registration page frame.
        pds.setSize(500,500);
        pds.setLocation(0,0);
        pds.setBackground(new Color(160,255, 150));
        submitBut.setSize(500,50);
        submitBut.setLocation(0,500);
        registrationPanel.add(pds);
        registrationPanel.add(submitBut);
        getContentPane().add(registrationPanel).setBackground(new Color(156, 234, 228));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Setting Up MainFrame
        mainframe.setSize(500, 800);
        mainframe.setVisible(false);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.getContentPane().add(mainPageUIControl.getMainPanel()).setBackground(new Color(156, 234, 228));

        submitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

                //END of testing the class.

                //ADD CODE FOR SENDING TO DATABASE HERE.

            }

        });
    }
}