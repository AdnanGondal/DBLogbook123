package Entries;

import java.io.Serializable;
import java.util.Date;

public class BloodGlucoseLevel implements Serializable {
    private Date date = new Date(); //Date stores the date and the time.
    private double level = 0;
    public BloodGlucoseLevel(){
    }

    public void setLevel(double l){
        level = l;
    }
    public double getLevel(){
        return level;
    }


    public void setDate(Date d){
        date = d;
    }
    public Date getDate(){return date;}

}
