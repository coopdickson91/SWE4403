import java.util.ArrayList;
import java.util.List;

public class Team implements Resource{
  private List<Resource> resources = new ArrayList<>();
  private String name;

  public Team(String name){
    this.name = name;
  }

  public void add(Resource resource) {
    resources.add(resource);
  }

  public void getResources() {
    System.out.println("Deploying the team " + name);
    for (var r : resources) {
      r.deploy();
    }
  }
  

  public void deploy(){
    System.out.println("Deploying the team " + name);
    for (var r : resources) {
      r.deploy();
    }
  }
  
}
