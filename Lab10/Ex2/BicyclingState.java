public class BicyclingState implements State {

   public Object getETA(Context context) {
      System.out.println("Calculating ETA (bicycling)");
      context.setState(this);	
      return 2;
   }
}