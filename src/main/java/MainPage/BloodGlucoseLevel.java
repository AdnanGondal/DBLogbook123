package MainPage;

import java.io.Serializable;
import java.util.Date;

public class BloodGlucoseLevel implements Serializable {
    private Date date = new Date();
    private double level = 0;
    BloodGlucoseLevel(){

    }

    public double getLevel(){
        return level;
    }

    public void setLevel(double l){
        level = l;
    }
    public void setDate(Date d){
        date = d;
    }

}
