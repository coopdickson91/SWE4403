
import java.util.Date;

public abstract class Scheduler {
    
    // private Calendar calendar;
    public abstract Calendar createCalendar();

    public void schedule(Event event) {
        var today = new Date();
        Calendar calendar = createCalendar();
        calendar.addEvent(event, today);
        
    }
}

