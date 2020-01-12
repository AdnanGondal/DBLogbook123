package MainPage.Frames;

import MainPage.InputPanels.GlucoseInput;
import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;
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
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class SimpleFrame extends JFrame {
    //The Class codes the Frame for the Simple Method
    protected Date date=new Date();
    protected Date time;
    protected JCheckBox gicheck = new JCheckBox("Add Glucose?");
    protected JPanel Panel = new JPanel();
    protected JButton enter = new JButton("Enter");
    protected GlucoseInput gi = new GlucoseInput();



    public SimpleFrame(){
        setTitle("New Simple Input");
        setSize(300,300);

        Panel.setLayout(new GridLayout(2,1));
        Panel.add(gi);
        Panel.add(enter);
        EnterButtonPressed();
        getContentPane().add(Panel).setBackground(new Color(156, 234, 228));

    }

    private void EnterButtonPressed() {
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                //What happens when entered button is pressed.
                time = gi.getTime();

                Method sm = new SimpleMethod(); //See Method and SimpleMethod class.
                ((SimpleMethod) sm).setBgl(time,gi.getuiGlucose());

                //Next Three Lines: For demonstration Only: Print to console when enter button is pressed
                //to check everything gets stored in the class and is ready for the database .
                System.out.println("BGL: " +((SimpleMethod) sm).getBGL().getLevel());
                System.out.println("Date: " + ((SimpleMethod) sm).getDate());
                System.out.println("Time: "+((SimpleMethod) sm).getBGL().getTime());

                //ADD CODE FOR SENDING TO DATABASE HERE


                gi.reset();
                setVisible(false);

                Gson gson = new Gson();
                String jsonString = gson.toJson(sm);
                System.out.println(jsonString);

                //sending to servlet
                byte[] body = jsonString.getBytes(StandardCharsets.UTF_8);
                URL myURL = null;
                try {
                    myURL = new URL("https://calculator4.herokuapp.com/logs");
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
                HttpURLConnection conn = null;
                //URL myURL = new URL("http://localhost:8080/untitled/patients"); HttpURLConnection conn = null;
                try {
                    conn = (HttpURLConnection) myURL.openConnection();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                // Set up the header
                try {
                    conn.setRequestMethod("POST");
                } catch (ProtocolException ex) {
                    ex.printStackTrace();
                }
                conn.setRequestProperty("Accept", "application/json"); conn.setRequestProperty("charset", "utf-8"); conn.setRequestProperty("Content-Length", Integer.toString(body.length)); conn.setDoOutput(true);
                // Write the body of the request

                try (OutputStream outputStream = conn.getOutputStream())
                {
                    outputStream.write(body, 0, body.length);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                BufferedReader bufferedReader=null;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                }
                catch(Exception f){
                    System.out.print(f.getMessage());
                }

                String inputLine = null;
                // Read the body of the response
                try {
                    inputLine = bufferedReader.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println(inputLine);
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            }

        });
    }

    public GlucoseInput getGlucoseInput(){return gi;};

}
