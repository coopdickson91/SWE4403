public class DrivingState implements State {

   public Object getETA(Context context) {
      System.out.println("Calculating ETA (driving)");
      context.setState(this);	
      return 1;
   }
}