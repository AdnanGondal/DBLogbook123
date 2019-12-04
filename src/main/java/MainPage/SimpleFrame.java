package MainPage;

import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFrame extends JFrame {

    public SimpleFrame(){
        JPanel SimplePanel = new JPanel();
        JButton enter = new JButton("Enter");
        SimplePanel.setLayout(new GridLayout(2,1));
        setSize(300,300);
        GlucoseInput gi = new GlucoseInput();
        SimplePanel.add(gi);
        SimplePanel.add(enter);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                Method SM = new SimpleMethod( date, gi.gettext());
                System.out.println(((SimpleMethod) SM).getSimpleMethod().getLevel());

                //Above we get in the form of Date. To change this to string:
                DateFormat df = new SimpleDateFormat("hh:mm, dd/mm/yyyy");
                System.out.println("Time and Date: "+ df.format(((SimpleMethod) SM).getSimpleMethod().getTime()));

                //Add code FOR SENDING TO SERVER. (SEND SM- WHICH INCLUDES THE SIMPLE METHOD ENTRY FOR TODAY AND PUTS IT ON THE SERVER)
                gi.emptytext();
                setVisible(false);
            }
        });
        getContentPane().add(SimplePanel);



    }


}
