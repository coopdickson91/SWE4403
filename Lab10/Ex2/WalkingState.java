public class WalkingState implements State {

   public Object getETA(Context context) {
      System.out.println("Calculating ETA (walking)");
      context.setState(this);
      return 4;	
   }
}