public class Demo {
  public static void show() {
    var subTeam1 = new Team("Sub1");
    subTeam1.add(new Truck());
    subTeam1.add(new HumanResource());
    subTeam1.add(new HumanResource());

    var subTeam2 = new Team("Sub2");
    subTeam2.add(new Truck());
    subTeam2.add(new HumanResource());
    subTeam2.add(new HumanResource());

    var team = new Team("Main Team");
    team.add(subTeam1);
    team.add(subTeam2);

    team.getResources();
  }

  public static void main(String[] args){
    show();
  }
}
