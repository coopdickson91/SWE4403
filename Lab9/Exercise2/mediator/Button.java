
public class Button extends UIControl {
    private boolean isEnabled;
    private SignUpDialogBox mediator;

    public Button(SignUpDialogBox mediator){
        this.mediator = mediator;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }


}
