package RegistrationPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This class codes for the JPanel that includes all the user registration page inputs.
public class PersonalDetailsPanel extends JPanel {
    private Container c;
    private JLabel title;
    private JLabel personaldetailstitle;
    private JLabel namelabel;
    private JLabel emaillabel;
    private JLabel phonelabel;
    private JLabel typeLabel;
    private JLabel iadminlabel;
    private JLabel doctordetailstitle;
    private JLabel doctornamelabel;
    private JLabel doctoremaillabel;
    private JLabel doctorphonelabel;
    private JLabel accountdetailstitle;
    private JLabel usernamelabel;
    private JLabel passwordlabel;

    private JTextField tname;
    private JTextField temail;
    private JTextField tphone;
    private String diabetestypes[] = {"1", "2"};
    private JComboBox<String> typeinput;
    private JComboBox<String> admininput;
    private String admintype[] = {"Pen", "Injection", "Pump"};
    private JTextField tdoctorname;
    private JTextField tdoctoremail;
    private JTextField tdoctorphone;
    private JTextField tusername;
    private JTextField tpassword;

    private RegistrationDetails registrationDetails = new RegistrationDetails();






    public PersonalDetailsPanel()
    { //Adapted from: https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/

        setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(100, 10);
        add(title);

        personaldetailstitle = new JLabel("Personal Details: ");
        personaldetailstitle.setFont(new Font("Arial", Font.PLAIN, 20));
        personaldetailstitle.setSize(300, 30);
        personaldetailstitle.setLocation(100, 50);
        add(personaldetailstitle);

        namelabel = new JLabel("Name");
        namelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        namelabel.setSize(100, 20);
        namelabel.setLocation(100, 80);
        add(namelabel);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(200, 80);
        add(tname);

        emaillabel = new JLabel("Email");
        emaillabel.setFont(new Font("Arial", Font.PLAIN, 20));
        emaillabel.setSize(150, 20);
        emaillabel.setLocation(100, 100);
        add(emaillabel);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(150, 20);
        temail.setLocation(200, 100);
        add(temail);

        phonelabel= new JLabel("Phone: ");
        phonelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        phonelabel.setSize(150, 20);
        phonelabel.setLocation(100, 120);
        add(phonelabel);

        tphone = new JTextField();
        tphone.setFont(new Font("Arial", Font.PLAIN, 15));
        tphone.setSize(150, 20);
        tphone.setLocation(200, 120);
        add(tphone);

        typeLabel = new JLabel("Type of diabetes");
        typeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        typeLabel.setSize(150, 20);
        typeLabel.setLocation(100, 140);
        add(typeLabel);

        //solve s = new solve();

        typeinput = new JComboBox<>(diabetestypes);
        typeinput.setSelectedIndex(0);
        typeinput.setFont(new Font("Arial", Font.PLAIN, 15));
        typeinput.setSize(100, 20);
        typeinput.setLocation(250, 140);
        add(typeinput);


        iadminlabel = new JLabel("Insulin Admin:");
        iadminlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        iadminlabel.setSize(250, 20);
        iadminlabel.setLocation(100, 160);
        add(iadminlabel);


        admininput = new JComboBox<>(admintype);
        admininput.setSelectedIndex(0);
        admininput.setFont(new Font("Arial", Font.PLAIN, 15));
        admininput.setSize(100, 20);
        admininput.setLocation(250, 160);
        add(admininput);


        doctordetailstitle = new JLabel("Doctor Details: ");
        doctordetailstitle.setFont(new Font("Arial", Font.PLAIN, 20));
        doctordetailstitle.setSize(250, 30);
        doctordetailstitle.setLocation(100, 200);
        add(doctordetailstitle);

        doctornamelabel = new JLabel("Name");
        doctornamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        doctornamelabel.setSize(150, 20);
        doctornamelabel.setLocation(100, 230);
        add(doctornamelabel);

        tdoctorname = new JTextField();
        tdoctorname.setFont(new Font("Arial", Font.PLAIN, 15));
        tdoctorname.setSize(150, 20);
        tdoctorname.setLocation(200, 230);
        add(tdoctorname);

        doctoremaillabel = new JLabel("Email");
        doctoremaillabel.setFont(new Font("Arial", Font.PLAIN, 20));
        doctoremaillabel.setSize(150, 20);
        doctoremaillabel.setLocation(100, 250);
        add(doctoremaillabel);

        tdoctoremail = new JTextField();
        tdoctoremail.setFont(new Font("Arial", Font.PLAIN, 15));
        tdoctoremail.setSize(150, 20);
        tdoctoremail.setLocation(200, 250);
        add(tdoctoremail);

        doctorphonelabel = new JLabel("Phone");
        doctorphonelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        doctorphonelabel.setSize(200, 20);
        doctorphonelabel.setLocation(100, 270);
        add(doctorphonelabel);

        tdoctorphone = new JTextField();
        tdoctorphone.setFont(new Font("Arial", Font.PLAIN, 15));
        tdoctorphone.setSize(150, 20);
        tdoctorphone.setLocation(200, 270);
        add(tdoctorphone);

        accountdetailstitle = new JLabel("Account Details");
        accountdetailstitle.setFont(new Font("Arial", Font.PLAIN, 20));
        accountdetailstitle.setSize(300, 30);
        accountdetailstitle.setLocation(100, 290);
        add(accountdetailstitle);

        usernamelabel = new JLabel("User Name: ");
        usernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernamelabel.setSize(200,20);
        usernamelabel.setLocation(100,320);
        add(usernamelabel);

        tusername = new JTextField();
        tusername.setFont(new Font("Arial", Font.PLAIN, 20));
        tusername.setSize(150,20);
        tusername.setLocation(200,320);
        add(tusername);

        passwordlabel = new JLabel("Password: ");
        passwordlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordlabel.setSize(200,20);
        passwordlabel.setLocation(100,340);
        add(passwordlabel);

        tpassword = new JTextField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 20));
        tpassword.setSize(150,20);
        tpassword.setLocation(200,340);
        add(tpassword);


    }

    public RegistrationDetails getRegistrationDetails(){
        return registrationDetails;
    }

    //Purpose of function below: To run when submit button is pressed and store everything in the RegistrationDetails class.
    public void setRegistrationDetails(){
        registrationDetails.setName(tname.getText());
        registrationDetails.setEmail(temail.getText());
        registrationDetails.setPhone(tphone.getText());
        registrationDetails.setTypeofDiabetes((String) typeinput.getSelectedItem());
        registrationDetails.setInsulinAdmin((String) admininput.getSelectedItem());
        registrationDetails.setDoctorname(tdoctorname.getText());
        registrationDetails.setDoctoremail(tdoctoremail.getText());
        registrationDetails.setDoctorphone(tdoctorphone.getText());
        registrationDetails.setUserName(tusername.getText());
        registrationDetails.setPassword(tpassword.getText());

    }




}
