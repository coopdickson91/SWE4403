import java.util.*;

public class Logger {

    private String fileName;
    private static Logger instance;
    private static Map<String, Logger> logMap = new HashMap<String, Logger>();

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    public static synchronized Logger getInstance(String fileName){

        if(!(logMap.containsKey(fileName))){

            instance = new Logger(fileName);
            logMap.put(fileName, instance);
        }

        return logMap.get(fileName);
    }

    public void write(String message) {
        System.out.println("User made a " + message + " from " + fileName);
    }

    
}