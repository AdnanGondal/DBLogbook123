package MainPage.Methods;

import Entries.BloodGlucoseLevel;
import MainPage.Methods.Method;

import java.util.Date;

//The Class that will store a simple method logbook entry.
public class SimpleMethod extends Method {

    //includes object of BloodGlucoseLevel
    protected BloodGlucoseLevel bgl = new BloodGlucoseLevel();


    public SimpleMethod(){

    }


    public void setBgl(Date time, double level){
        //Call this function when relevant button is pressed.
        bgl.setTime(time);
        bgl.setLevel(level);

    }
    public BloodGlucoseLevel getBGL(){
        return bgl;
    };

}

