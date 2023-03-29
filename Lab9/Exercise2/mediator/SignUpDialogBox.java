public class SignUpDialogBox{
    private Button signup;
    private CheckBox terms;
    private TextBox username;
    private TextBox password;

    // public SignUpDialogBox(Button signup, CheckBox terms, TextBox username, TextBox password){
    //     this.signup = signup;
    //     this.terms = terms;
    //     this.username = username;
    //     this.password = password;
    // }

    public void createSignup(Button signup){
        this.signup = signup;
    }

    public void createTerms(CheckBox terms){
        this.terms = terms;
    }

    public void createUsername(TextBox username){
        this.username = username;
    }

    public void createPassword(TextBox password){
        this.password = password;
    }

    public boolean enableBox(){
        if(username.isFilled() && password.isFilled() && terms.isChecked()){
            signup.setEnabled(true);
            return true;
        }
        else{
            return false;
        }
    }

}