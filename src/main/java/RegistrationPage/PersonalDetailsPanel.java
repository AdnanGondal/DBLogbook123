package RegistrationPage;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

//This class codes for the JPanel that includes all the user registration page input fields.
public class PersonalDetailsPanel extends JPanel {
    //All the labels on the page.
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

    //All the user inputs: includes text fields and combo boxes.
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


    private RegistrationDetails registrationDetails = new RegistrationDetails(); //See RegistrationDetails class.



    public PersonalDetailsPanel()
    { //Adapted from: https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/

        setLayout(null);
        InitComponents();

    }

    private void InitComponents() {
        //Setup the Panel.
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 30));
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

    //Function below: To run when submit button is pressed and store everything in an object of the RegistrationDetails class.
    public void setRegistrationDetails() throws IOException {

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

        Gson gson = new Gson();
        String jsonString = gson.toJson(registrationDetails);
        System.out.println(jsonString);

        //sending to servlet
        byte[] body = jsonString.getBytes(StandardCharsets.UTF_8);
        URL myURL = new URL("https://calculator4.herokuapp.com/patients"); HttpURLConnection conn = null;
        //URL myURL = new URL("http://localhost:8080/untitled/patients"); HttpURLConnection conn = null;
        conn = (HttpURLConnection) myURL.openConnection();
        // Set up the header
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Accept", "application/json"); conn.setRequestProperty("charset", "utf-8"); conn.setRequestProperty("Content-Length", Integer.toString(body.length)); conn.setDoOutput(true);
        // Write the body of the request

        try (OutputStream outputStream = conn.getOutputStream())
        {
            outputStream.write(body, 0, body.length);
        }
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }

        String inputLine;
        // Read the body of the response
        while ((inputLine = bufferedReader.readLine()) != null)
        {
            System.out.println(inputLine);
        }
        bufferedReader.close();

    }



}
