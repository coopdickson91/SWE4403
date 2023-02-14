import java.util.Random;
public class RunnableProcess implements Runnable {
    private String fileName;
    private String type;
    private int time;
    private Random rand = new Random();

    public RunnableProcess(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
        this.time = rand.nextInt(999);
    }

    public void run() {
        try {
                Logger log = Logger.getInstance(fileName);
                Thread.sleep(this.time);
                log.write(type);
            }

            catch(Exception ex) {
                ex.printStackTrace();
        }
    }
}
