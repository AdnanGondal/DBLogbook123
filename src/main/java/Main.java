import MainPage.MainPageUIControl;
import RegistrationPage.RegistrationPageUIControl;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String args[]) {
        System.out.println("HelloWorld");


        Boolean RegistrationComplete = true; //NOTE: MUST BE SET TO FALSE INTIALLY!
        //To ensure that the registration page becomes invisible once the registration is complete.

        if (RegistrationComplete == false) {
            //The Code for the Registration Page Frame. (See RegistrationPage Package)
            JFrame registrationframe = new JFrame("Registration Frame");
            registrationframe.setSize(500, 1000);
            registrationframe.setVisible(true);
            registrationframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            RegistrationPageUIControl registrationPageUIControl = new RegistrationPageUIControl();
            registrationframe.getContentPane().add(registrationPageUIControl.getMainPanel());
        }


        if (RegistrationComplete == true) {
            //The Code for the Main Page Frame. (See MainPage Package)
            JFrame mainframe = new JFrame("Diabetic Logbook"); // Create a new JFrame
            mainframe.setSize(500, 800);
            mainframe.setVisible(true);
            mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            MainPageUIControl UIController = new MainPageUIControl();
            mainframe.getContentPane().add(UIController.getMainPanel()).setBackground(new Color(156, 234, 228));
        }
    }
}


