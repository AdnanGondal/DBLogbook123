package MainPage.Methods;

import Entries.Exercise;
import MainPage.InputPanels.IntensiveExerciseInput;

import java.util.Date;

public class IntensiveMethod extends CompMethod {
    public IntensiveMethod(){

    }
    public void setIntensiveExercise(String type,String name, Date startTime, Date endTime){
        exercise.setType(type);
        exercise.setName(name);
        exercise.setStartTime(startTime);
        exercise.setEndTime(endTime);
    }

    public Exercise getIntensiveExercise(){
        return exercise;
    }

}
