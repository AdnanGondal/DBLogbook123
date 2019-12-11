package Entries;

import java.util.Date;

public class Medication extends Activity {
    private Date time;
    private String dosage;
    private String type;

    public Medication(){

    }
    public void setDosage(String l){
        dosage = l;
    }
    public String getDosage(){
        return dosage;
    }

    public void setType(String t) {type = t;}
    public String gettype(){return type;}


    public void setTime(Date t){ time = t; }
    public String getTime(){return tf.format(time) ;}
}
