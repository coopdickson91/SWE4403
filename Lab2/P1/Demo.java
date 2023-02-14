
public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        Text text = new Text("Hello");
        timeline.add(text);

        Audio audio = new Audio();
        Clip clip = new Clip();

        ContextMenu menu = new ContextMenu(timeline);
        menu.duplicate(text);
        menu.duplicate(audio);
        menu.duplicate(clip);

        timeline.printList();
        // TODO Add more objects to the timeline


    }
}
