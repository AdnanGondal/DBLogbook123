package MainPage;

import MainPage.InputPanels.GlucoseInput;
import MainPage.Methods.Method;
import MainPage.Methods.SimpleMethod;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class QuesFrame extends JFrame {
    //The Class codes the Frame for the Simple Method
    protected Date date=new Date();
    protected Date time;
    //protected JCheckBox gicheck = new JCheckBox("Add Glucose?");
    protected JPanel Panel = new JPanel();
    //protected JButton enter = new JButton("Enter");
    protected JButton enter = new JButton("Submit");
    protected GlucoseInput gi = new GlucoseInput();
    protected JCheckBox TSCheck = new JCheckBox("Are you taking the reading now?");

    private JLabel title;
    private JLabel mno;
    private JTextField tmno;


    public QuesFrame(){
        setTitle("Questionnaire");
        setSize(800,400);

        //Panel.setLayout(new GridLayout(12,5));
       // Panel.add(gi);

        title = new JLabel("Questionnaire");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 35);
        title.setLocation(100, 20);
        add(title);

        title = new JLabel("Symptoms record: ");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setSize(300, 30);
        title.setLocation(100, 55);
        add(title);

        mno = new JLabel("Frequent urination");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 85);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 85);
        add(tmno);

        mno = new JLabel("Excessive thirst");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 110);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 110);
        add(tmno);

        mno = new JLabel("Unexplained weight loss");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 135);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 135);
        add(tmno);

        mno = new JLabel("Extreme hunger");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 160);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 160);
        add(tmno);

        mno = new JLabel("Sudden vision changes");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 185);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 185);
        add(tmno);

        mno = new JLabel("Tingling or numbness in hands or feet ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(400, 25);
        mno.setLocation(100, 210);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 210);
        add(tmno);

        mno = new JLabel("Feeling very tired much of the time ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(400, 25);
        mno.setLocation(100, 235);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 235);
        add(tmno);

        mno = new JLabel("Very dry skin ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 260);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 260);
        add(tmno);

        mno = new JLabel("Sores that are slow to heal ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 285);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 285);
        add(tmno);

        mno = new JLabel("More infections than usual ");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(300, 25);
        mno.setLocation(100, 310);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(300, 25);
        tmno.setLocation(450, 310);
        add(tmno);


        //Protected JButton okButton = new JButton("Submit");
        enter.setFont(new Font("Arial", 0, 15));
        enter.setSize(100, 20);
        enter.setLocation(450, 350);
        this.add(enter);


        EnterButtonPressed();
        getContentPane().add(Panel).setBackground(new Color(156, 234, 228));

    }

    private void EnterButtonPressed() {
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = gi.getTime();
                Method sm = new SimpleMethod();
                ((SimpleMethod) sm).setBgl(time,gi.getuiGlucose());

                //Next Three Lines: For demonstration Only.
                System.out.println("BGL: " +((SimpleMethod) sm).getBGL().getLevel());
                System.out.println("Date: " + ((SimpleMethod) sm).getBGL().getDate());
                System.out.println("Time: "+((SimpleMethod) sm).getBGL().getTime());

                //Add code FOR SENDING TO SERVER. (SEND SM- WHICH INCLUDES THE SIMPLE METHOD ENTRY FOR TODAY AND PUTS IT ON THE SERVER)
                TSCheck.setSelected(true);
                gi.reset();
                setVisible(false);

            }

        });
    }

    public GlucoseInput getGlucoseInput(){return gi;};

}