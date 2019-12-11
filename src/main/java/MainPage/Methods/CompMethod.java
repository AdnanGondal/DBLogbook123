package MainPage.Methods;

import Entries.Exercise;
import Entries.Food;
import Entries.Medication;

import java.util.Date;

public class CompMethod extends SimpleMethod {
    protected Exercise exercise = new Exercise();
    protected Food food = new Food();
    protected Medication med = new Medication();


    public CompMethod() {
    }

    public void setExercise(String type,Date startTime, Date endTime) {
        exercise.setType(type);
        exercise.setStartTime(startTime);
        exercise.setEndTime(endTime);
    }
    public Exercise getExercise(){return exercise;};

    public void setFood(String name, double carbAmmmount, Date time ){
        food.setName(name);
        food.setCarbAmmount(carbAmmmount);
        food.setTime(time);

    }
    public Food getFood(){
        return food;
    }

    public void setMedication(String type, String dosage, Date time) {
        med.setType(type);
        med.setDosage(dosage);
        med.setTime(time);
    }

    public Medication getMed(){
        return med;
    }

}
