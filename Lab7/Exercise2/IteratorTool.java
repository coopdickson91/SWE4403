import java.util.*;

public class IteratorTool{

    public static void main(String[] args){


        //Increasing order
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(2, 4, 6, 5, 3, 1));

        // Increasing order
        Collections.sort(list);

        Iterator<Integer> itr = list.iterator();
 
        while (itr.hasNext()) {
            int i = itr.next();

            System.out.println(i); 
        }

        //Decreasing Order
        Collections.sort(list, Collections.reverseOrder());

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            int i = iter.next();

            System.out.println(i); 
        }

    }
}