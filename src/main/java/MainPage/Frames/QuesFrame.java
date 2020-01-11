package MainPage.Frames;

import MainPage.InputPanels.GlucoseInput;
import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Hashtable;

public class QuesFrame extends JFrame {
    //The Class codes the Frame for the Questionnaire.
    protected Date date=new Date();
    protected Date time;
    //protected JCheckBox gicheck = new JCheckBox("Add Glucose?");
    protected JPanel Panel = new JPanel();
    //protected JButton enter = new JButton("Enter");
    protected JButton enter = new JButton("Submit");
    //protected GlucoseInput gi = new GlucoseInput();
    protected JCheckBox TSCheck = new JCheckBox("Are you taking the reading now?");

    private JLabel title;
    private JLabel mno;
    //private JTextField tmno;
    private JSlider jj;

    public QuesFrame(){
        setTitle("Questionnaire");
        setSize(450,725);

        //Panel.setLayout(new GridLayout(12,5));
       // Panel.add(gi);

        title = new JLabel("Symptoms record:");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 35);
        title.setLocation(100, 20);
        add(title);




        mno = new JLabel("1.Frequent urination:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 85);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 110);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 110);
        add(mno);

        //tmno = new JTextField();
        //tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        //tmno.setSize(300, 25);
        //tmno.setLocation(450, 85);
       // add(tmno);

        mno = new JLabel("2.Excessive thirst:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 140);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 165);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 165);
        add(mno);

        mno = new JLabel("3.Unexplained weight loss:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 195);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 220);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 220);
        add(mno);

        mno = new JLabel("4.Extreme hunger:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 250);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 275);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 275);
        add(mno);

        mno = new JLabel("5.Sudden vision changes:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 305);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 330);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 330);
        add(mno);

        mno = new JLabel("6.Tingling or numbness in hands or feet:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(400, 25);
        mno.setLocation(60, 360);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 385);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 385);
        add(mno);

        mno = new JLabel("7.Feeling very tired much of the time: ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(400, 25);
        mno.setLocation(60, 415);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 440);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 440);
        add(mno);

        mno = new JLabel("8.Very dry skin: ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 470);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 495);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 495);
        add(mno);

        mno = new JLabel("9.Sores that are slow to heal: ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 525);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 550);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 550);
        add(mno);

        mno = new JLabel("10.More infections than usual: ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(60, 580);
        add(mno);

        jj = new JSlider();
        jj.setMajorTickSpacing(10);
        jj.setPaintTicks(true);
// Set the label to be drawn
        jj.setFont(new Font("Arial", Font.PLAIN, 15));
        jj.setSize(300, 25);
        jj.setLocation(60, 605);
        add(jj);
        mno = new JLabel("never                                                                                                always");
        mno.setFont(new Font("Arial", Font.PLAIN, 10));
        mno.setSize(400, 25);
        mno.setLocation(40, 605);
        add(mno);


        //Protected JButton okButton = new JButton("Submit");
        enter.setFont(new Font("Arial", 0, 15));
        enter.setSize(100, 20);
        enter.setLocation(250, 650);
        this.add(enter);


        EnterButtonPressed();
        getContentPane().add(Panel).setBackground(new Color(156, 234, 228));




    }

    private void EnterButtonPressed() {
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);

            }

        });
    }

    //public GlucoseInput getGlucoseInput(){return gi;};

}