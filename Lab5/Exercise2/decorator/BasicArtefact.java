public class BasicArtefact implements Artefact{

    private String name;
    // private boolean status = false;

    public BasicArtefact(String name){
        this.name = name;
    }

    // public void setStatus(boolean status){
    //     this.status = status;
    // }

    public String render(){
        return name;
    }

}