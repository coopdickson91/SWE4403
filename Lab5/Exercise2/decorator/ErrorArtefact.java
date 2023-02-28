public class ErrorArtefact extends ArtefactDecorator{

    private boolean status = false;

    public ErrorArtefact(Artefact artefact){
        super(artefact);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String render(){

        String error = status ? "[Error]" : "";
        return String.format("%s %s", super.name, error);
    }

}