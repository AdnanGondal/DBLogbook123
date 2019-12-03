package MainPage;

import Entries.Exercise;
import Entries.Medication;
import MainPage.SimpleMethod;

import java.util.Date;

public class CompMethod extends SimpleMethod {
    Exercise exercise = new Exercise();
    Medication medication = new Medication();

    public CompMethod(Date date,double level, Date exStart, Date exEnd, String ExType){
        super(date,level);
        exercise.setStartTime(exStart);
        exercise.setEndTime(exEnd);
        exercise.setType(ExType);

    }


}
