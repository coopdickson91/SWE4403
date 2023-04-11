public class TransitState implements State {

   public Object getETA(Context context) {
      System.out.println("Calculating ETA (transit)");
      context.setState(this);	
      return 3;
   }
}