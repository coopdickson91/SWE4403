public class Demo{
    public static void main(String[] args){
        SignUpDialogBox signup = new SignUpDialogBox();

        Button sign = new Button(signup);
        TextBox name = new TextBox(signup);
        TextBox pass = new TextBox(signup);
        CheckBox terms = new CheckBox(signup);

        signup.createSignup(sign);
        signup.createUsername(name);
        signup.createPassword(pass);
        signup.createTerms(terms);

        System.out.println("Sign Up box is " + signup.enableBox());

        name.setContent("cooper");
        pass.setContent("1234");
        terms.setChecked(true);

        System.out.println("Sign Up box is " + signup.enableBox());
    }
}