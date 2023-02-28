public class ArtefactDecorator implements Artefact{

    private Artefact artefact;

    public ArtefactDecorator(Artefact artefact){
        this.artefact = artefact;
    }

    // public void setStatus(boolean status){
    //     this.artefact.setStatus(status);
    // }

    public String render(){
        return artefact.render();
    }
}