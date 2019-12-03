package MainPage;

import Entries.BloodGlucoseLevel;

import java.util.Date;

public class SimpleMethod {
    private String Time;
    BloodGlucoseLevel bgl = new BloodGlucoseLevel();

    public SimpleMethod(Date date,double level){
        bgl.setDate(date);
        bgl.setLevel(level);
    }


}
