package MainPage.Methods;

import Entries.BloodGlucoseLevel;
import MainPage.Methods.Method;

import java.util.Date;

public class SimpleMethod extends Method {


    protected BloodGlucoseLevel bgl = new BloodGlucoseLevel();
    protected boolean bglEntered;

    public SimpleMethod(){

    }


    public String getDate() {
        return bgl.getDate();
    }


    public void setBgl(Date time, double level){
        //bgl.setDate(date);
        bgl.setTime(time);
        bgl.setLevel(level);
        bglEntered = true;


    }
    public BloodGlucoseLevel getBGL(){
        return bgl;
    };

}

