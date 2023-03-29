public abstract class VideoOperation {
    public VideoEditor editor;
    private String backup;

    VideoOperation(VideoEditor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.toString();
    }

    public void undo() {
        editor.setText(backup);
    }

    public abstract boolean execute();
}