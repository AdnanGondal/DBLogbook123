package Entries;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class BloodGlucoseLevel extends Activity  {
    private Date date = Calendar.getInstance().getTime(); //Date stores the date and the time.
    private double level = 0;

    public BloodGlucoseLevel(){ }

    public void setLevel(double l){
        level = l;
    }
    public double getLevel(){
        return level;
    }


    public void setTime(Date d){
        date = d;
    }
    public Date getTime(){return date;}

}
