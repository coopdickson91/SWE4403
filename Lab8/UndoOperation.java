public class UndoOperation extends VideoOperation {

    public UndoOperation(VideoEditor ve) {
        super(ve);
    }

    @Override
    public boolean execute() {
        ve.undo();
        return false;
    }
}