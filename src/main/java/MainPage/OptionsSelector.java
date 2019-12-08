package MainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsSelector extends JPanel {


    public OptionsSelector(){
        JPanel control = new JPanel();
        control.setLayout(new GridLayout(5,1));
        JLabel info = new JLabel("Select the method you wish to add an entry with for today: ");
        JButton SimpleBut = new JButton("Simple Method");
        JButton CompBut = new JButton("Comprehensive Method");
        JButton IntensiveBut = new JButton("Intensive Method");
        control.add(info);
        control.add(SimpleBut);
        SimpleFrame sf = new SimpleFrame();
        CompFrame cf = new CompFrame();
        control.add(CompBut);
        control.add(IntensiveBut);
        add(control);
        SimpleBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            sf.setVisible(true);

            }
        });
        CompBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cf.setVisible(true);
            }
        });


    }

}
