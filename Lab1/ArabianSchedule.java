
import java.util.Date;

public class ArabianSchedule extends Scheduler{
    
    public Calendar createCalendar(){
        Calendar arabianCal= new ArabianCalendar();
        return arabianCal;
        
    }
}