
public class CheckBox extends UIControl {
    private boolean isChecked;
    private SignUpDialogBox mediator;


    public CheckBox(SignUpDialogBox mediator){
        this.mediator = mediator;
    }


    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

}
