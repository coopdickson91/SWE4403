
import java.util.Date;

public class GeorgianSchedule extends Scheduler{

    public Calendar createCalendar(){
        Calendar georgianCal = new GeorgianCalendar();
        return georgianCal;
    }

}