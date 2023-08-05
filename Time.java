/*
 Sub class of Time_Main_Class.java
 */
package Java_Problems;

/**
 *
 * @author tph
 */
public class Time {
    private long hour;
    private long minute;
    private long second;
    public Time(long hour,long minute,long second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public Time()
    {
        long totalS=System.currentTimeMillis()/1000;
        second=(int)(totalS%60);
        long totalM=totalS/60;
        minute=totalM%60;
        long totalH=totalM/60;
        hour=totalH%24;
    }
    Time(long sec)
    {
        long totalSeconds=sec;
        second=(int)(totalSeconds%60);
        long totalMinutes=totalSeconds/60;
        minute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        hour=totalHours%24;
    }
    public long getHour()
    {
        return hour;
    }
    public long getMinute()
    {
        return minute;
    }
    public long getSecond()
    {
        return second;
    }
    public void setTime(long elapseTime)
    {
        second=(int)(elapseTime%60);
        long minutes=elapseTime/60;
        minute=minutes%60;
        long hours=minutes/60;
        hour=hours%24;
    }
}
