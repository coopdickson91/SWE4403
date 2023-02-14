
import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List getList(){
        return components;
    }

    public void printList(){
        for(int i = 0; i < components.size();i++){
            System.out.println(components.get(i).toString() + "");
        }
    }

}
