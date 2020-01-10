import MainPage.MainPageUIControl;
import RegistrationPage.PersonalDetailsPanel;
import RegistrationPage.RegistrationPageUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFrame extends JFrame {
    private JPanel registrationPanel= new JPanel();
    private PersonalDetailsPanel pds = new PersonalDetailsPanel();
    private JButton submitBut = new JButton("Sumbit");
    private MainPageUIControl mainPageUIControl = new MainPageUIControl();
    private JFrame mainframe = new JFrame("Diabetic Logbook");



    public RegistrationFrame(){

        setSize(500, 800);
        setVisible(true);
       registrationPanel.setLayout(null);

        pds.setSize(500,500);
        pds.setLocation(0,0);
        submitBut.setSize(100,100);
        submitBut.setLocation(200,500);
        registrationPanel.add(pds);
        registrationPanel.add(submitBut);
        getContentPane().add(registrationPanel).setBackground(new Color(156, 234, 228));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        mainframe.setSize(500, 800);
        mainframe.setVisible(false);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.getContentPane().add(mainPageUIControl.getMainPanel()).setBackground(new Color(156, 234, 228));

        submitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //What happens when submit button on registration frame is pressed.
                setVisible(false);
                mainframe.setVisible(true);

                pds.setRegistrationDetails();
                //JUST FOR TESTING IF REGISTRATION DETAILS GET STORED IN CLASS/CAN PRINT TO CONSOLE:
                //Instead of the code below printing to the console it will be sent to the server/


                System.out.println("Username: " + pds.getRegistrationDetails().getUserName());
                System.out.println("Password: " + pds.getRegistrationDetails().getName());
                System.out.println("Name: " + pds.getRegistrationDetails().getName());
                System.out.println("Email: " + pds.getRegistrationDetails().getEmail());
                System.out.println("Phone Number: " + pds.getRegistrationDetails().getPhone());
                System.out.println("Type of Diabetes: "+ pds.getRegistrationDetails().getTypeofDiabetes());
                System.out.println("Insulin Administered By: " + pds.getRegistrationDetails().getInsulinAdmin());
                System.out.println("Doctor Name: " + pds.getRegistrationDetails().getDoctorname());
                System.out.println("Doctor Email: " + pds.getRegistrationDetails().getDoctorEmail());
                System.out.println("Phone Number: " + pds.getRegistrationDetails().getDoctorphone());

                //END of testing the class.
            }
        });
    }
}
