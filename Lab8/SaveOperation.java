public SaveOperation extends VideoOperation{
    public VideoEditor editor;
    private String backup;
    public String newText;

    public SaveOperation(VideoEditor ve, String newText) {
        super(ve);
        this.newText = newText;
    }

    @Override
    public boolean execute() {
        super.setText(newText);
        return true;
    }
}