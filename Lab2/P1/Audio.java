
public class Audio implements Component{


    @Override 
    public Component clone(){
        return new Audio();
    }

    public String toString(){
        return "Audio";
    }
}
