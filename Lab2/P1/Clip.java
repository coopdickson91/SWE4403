
public class Clip implements Component{


    @Override
    public Component clone(){
        return new Clip();
    }

    public String toString(){
        return "Clip";
    }
}
