import MainPage.MainPageUIControl;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String args[]) {
        System.out.println("HelloWorld");

        Boolean RegistrationComplete = Boolean.FALSE;

        JFrame registrationframe = new JFrame("Registration Frame");
        registrationframe.setSize(500,1000);
        registrationframe.setVisible(true);
        registrationframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        RegistrationPageUIControl registrationPageUIControl = new RegistrationPageUIControl();
        registrationframe.getContentPane().add(registrationPageUIControl.getMainPanel());



        if (RegistrationComplete == Boolean.FALSE) {
            JFrame mainframe = new JFrame("Diabetic Logbook"); // Create a new JFrame
            mainframe.setSize(1000, 500);
            mainframe.setVisible(true);
            mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            MainPageUIControl drawingUIController = new MainPageUIControl();
            mainframe.getContentPane().add(drawingUIController.getMainPanel());
        }
    }
}


