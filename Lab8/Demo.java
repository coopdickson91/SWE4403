public class Demo{

    public static void main(String[] args) {

        VideoEditor editor = new VideoEditor();

        editor.executeOperation(new SaveOperation(editor, "take1"));

        editor.toString();
        editor.executeOperation(new SaveOperation(editor, "take2"));

        editor.toString();
        editor.executeOperation(new UndoOperation(ve));

        editor.toString();



        // SaveOperation save = new SaveOperation(v1, "Take1")

        // v1.toString();

        

        // v1.setText("Take2");

        // v1.toString();

        // history.push(v1);

        // undoOp.execute();

        // v1.toString();

    }
    
}