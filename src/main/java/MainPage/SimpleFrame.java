package MainPage;

import MainPage.GlucoseInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

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
                BloodGlucoseLevel bgl = new BloodGlucoseLevel();
                bgl.setLevel(gi.gettext());
                bgl.setDate(Calendar.getInstance().getTime());
                System.out.println(bgl.getLevel());
                //Add code FOR SENDING TO SERVER.
                gi.emptytext();
                setVisible(false);
            }
        });
        getContentPane().add(SimplePanel);



    }


}
