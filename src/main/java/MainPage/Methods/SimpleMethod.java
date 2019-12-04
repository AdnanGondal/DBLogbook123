package MainPage.Methods;

import Entries.BloodGlucoseLevel;
import MainPage.Methods.Method;

import java.util.Date;

public class SimpleMethod extends Method {


    protected BloodGlucoseLevel bgl = new BloodGlucoseLevel();

    public SimpleMethod(Date Time,double level){
        bgl.setTime(Time);
        bgl.setLevel(level);
    }

    public BloodGlucoseLevel getSimpleMethod(){
        return bgl;
    };



}
