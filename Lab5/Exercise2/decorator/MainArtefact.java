public class MainArtefact extends ArtefactDecorator{

    private boolean status = false;

    public MainArtefact(Artefact artefact){
        super(artefact);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String render(){

        String main = status ? "[Main]" : "";
        return String.format("%s %s", super.name, main);
    }

}