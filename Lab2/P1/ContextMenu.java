
public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {

        Component newComp = component.clone();
        timeline.add(newComp);
        
    }

}
