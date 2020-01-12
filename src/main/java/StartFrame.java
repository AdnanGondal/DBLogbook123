import MainPage.MainPageUIControl;
import RegistrationPage.PersonalDetailsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;




//This Class codes for the first frame the user will see.


public class StartFrame extends JFrame {


    private JFrame mainframe = new JFrame("Diabetic Logbook");
    private MainPageUIControl mainPageUIControl = new MainPageUIControl(); //See MainPageUIControl class
    private JButton  loginBut = new JButton("Login");
    //private JButton OkButton = new JButton("Ok");
    private JButton registerBut = new JButton("Register");
    private JCheckBox jCheckBox1 = new JCheckBox("Show Password");
    private JLabel welcomelabel = new JLabel("Welcome to the Diabetic Logbook App");
    private JLabel usernamelabel = new JLabel("Username: ");
    private JLabel passwordlabel = new JLabel("Password: ");
    private JLabel jLabel_Message = new JLabel();
    private JPanel jPanel1 = new JPanel();
    //private JPanel jPanel_Message = new JPanel();
    private JPasswordField jPasswordField_Password = new JPasswordField();
    private JTextField jTextField_Username = new JTextField();
    private RegistrationFrame registrationFrame = new RegistrationFrame();

    public StartFrame() { //Constructor for Registration Page.
        setSize(550,250);
        setTitle("Login");
        initComponents();

        registrationFrame.setVisible(false);
        //Setting up main frame: The main diabetic Logbook Frame.
        mainframe.setSize(500, 800);
        mainframe.setVisible(false);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.getContentPane().add(mainPageUIControl.getMainPanel()).setBackground(new Color(156, 234, 228));

    }

    private void initComponents() {
        jPanel1.setBackground(new Color(156, 234, 228));
        jPanel1.setLayout(null);

        welcomelabel.setLocation(75,10);
        welcomelabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomelabel.setSize(400,30);
        jPanel1.add(welcomelabel);


        usernamelabel.setLocation(10,50);
        usernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernamelabel.setSize(200,20);
        jPanel1.add(usernamelabel);

        jTextField_Username.setLocation(200,50);
        jTextField_Username.setSize(200,20);
        jPanel1.add(jTextField_Username);

        passwordlabel.setLocation(10,80);
        passwordlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordlabel.setSize(200,20);
        jPanel1.add(passwordlabel);

        jPasswordField_Password.setLocation(200,80);
        jPasswordField_Password.setSize(200,20);
        jPanel1.add(jPasswordField_Password);

        jCheckBox1.setLocation(400,80);
        jCheckBox1.setSize(200,20);
        jPanel1.add(jCheckBox1);
        jCheckBox1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               jCheckBox1ActionPerformed(e);
           }
        });

       loginBut.setLocation(200,110);
       loginBut.setSize(200,30);
       jPanel1.add(loginBut);
       loginBut.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               jButton_LoginActionPerformed(e);
           }
        });

       registerBut.setLocation(200,140);
       registerBut.setSize(200,30);
       jPanel1.add(registerBut);
       registerBut.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
               registrationFrame.setVisible(true);
           }
        });


       add(jPanel1);

    }
/*
    // Set Timer
    Timer timer1 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(jPanel_Message.getHeight() != 105){
                jPanel_Message.setBounds(0,0,StartFrame.this.getSize().width,jPanel_Message.getHeight() + 5);
                if(jPanel_Message.getHeight() == 105){
                    timer1.stop();
                }
            }
        }
    });

    Timer timer2 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(jPanel_Message.getHeight() != 0){
                jPanel_Message.setBounds(0,0,StartFrame.this.getSize().width,jPanel_Message.getHeight() - 5);
                if(jPanel_Message.getHeight() == 0){
                    timer2.stop();
                }
            }
        }
    });
*/
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {

        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "rubenweitzman", "");
            ps = connection.prepareStatement("SELECT username, password FROM users WHERE username = ? AND password = ?");
            ps.setString(1, jTextField_Username.getText());
            ps.setString(2, String.valueOf(jPasswordField_Password.getPassword()));
            ResultSet result = ps.executeQuery();
            if(result.next()){
                jLabel_Message.setText("Login Successfully");
                jLabel_Message.setForeground(Color.GREEN);
                //timer1.start();
                //If Login Is Correct
                mainframe.setVisible(true);
                setVisible(false);
            }
            else{
                jLabel_Message.setText("Invalid Username Or Password");
                jLabel_Message.setForeground(Color.RED);
                //timer1.start();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /* private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) {
        timer2.start();
    }*/

    // Show And Hide Password Using Checkbox
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        if(jCheckBox1.isSelected()){
            jPasswordField_Password.setEchoChar((char)0);
        }else{
            jPasswordField_Password.setEchoChar('*');
        }
    }

    /*public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        }); */
    }



