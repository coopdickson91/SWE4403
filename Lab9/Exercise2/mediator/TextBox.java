public class TextBox extends UIControl {
    private String content;
    private SignUpDialogBox mediator;

    public TextBox(SignUpDialogBox mediator){
        this.mediator = mediator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFilled(){
        if(content == null){
            return false;

        }
        else{
            return true;
        }
    }
}
