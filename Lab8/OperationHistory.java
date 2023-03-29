import java.util.*;

public class OperationHistory {
    private Stack<VideoEditor> history = new Stack<>();

    public void push(VideoEditor ve) {
        history.push(ve);
    }

    public VideoEditor pop() {
        return history.pop();
    }

    public execute(VideoOperation vo){
        if(vo.execute){
            push(vo);
        }
    }
}