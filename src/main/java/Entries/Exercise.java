package Entries;

import java.util.Date;

public class Exercise {
    private Date StartTime;
    private Date EndTime;
    private String Type;
    private String Name;

    public Exercise(){}

    public void setStartTime(Date start){ StartTime = start;}
    public Date getStartTime(){return StartTime;}

    public void setEndTime(Date end){EndTime = end;}
    public Date getEndTime(){return EndTime;}

    public void setType(String type){Type = type;}
    public String getType(){return Type;}

}
