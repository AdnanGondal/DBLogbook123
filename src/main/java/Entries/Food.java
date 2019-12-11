package Entries;

import java.util.Date;

public class Food extends Activity{
    private Date date;
    private Date time;
    private String name;
    private Double carbAmmount;

    public Food(){}

    public void setTime(Date t){
        time = t;
    }
    public String getTime(){return tf.format(time) ;}

    public void setName(String n){
        name = n;
    }
    public String getName(){return name;}


    public void setCarbAmmount(Double c) {
        carbAmmount = c;
    }
    public Double getCarbAmmount(){return carbAmmount;}
}
