
public class Demo {
    public static void show() {
        // var scheduler = new Scheduler();
        // scheduler.schedule(new Event());

        

        Scheduler aSchedule = new ArabianSchedule();
        Scheduler gSchedule = new GeorgianSchedule();

        gSchedule.schedule(new Event());
        aSchedule.schedule(new Event());
    }

    public static void main(String[] args) {
       show();
    }
}
