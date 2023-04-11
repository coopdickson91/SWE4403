public class Demo {
   public static void main(String[] args) {

    Object result;

      Context context = new Context();

      DrivingState driving = new DrivingState();
      result = driving.getETA(context);
      System.out.println(result);

      BicyclingState bicycling = new BicyclingState();
      result = bicycling.getETA(context);
      System.out.println(result);

      TransitState transit = new TransitState();
      result = transit.getETA(context);
      System.out.println(result);

      WalkingState walking = new WalkingState();
      result = walking.getETA(context);
      System.out.println(result);
   }
}