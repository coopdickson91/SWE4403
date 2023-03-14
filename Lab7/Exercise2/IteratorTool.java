import java.util.*;

public class IteratorTool{

    interface Iterator{
        public boolean hasNext();
        public int next();
    }

    interface Container{
        public Iterator getIterator();
    }

    class NumberIterator implements Iterator {
        ArrayList<Integer> list;

        int index = 0;

        public NumberIterator (ArrayList<Integer> list){
            this.list = list;
        }

        public int next(){
            int i =  list.get(index);
            index += 1;
            return i;
        }
    
        public boolean hasNext(){
            if (index >= list.size() || list.get(index) == null){
                return false;
            }
            else{
                return true; 
            }
        }

        public int getMax(){
            int max = Integer.MIN_VALUE;
            
            for(int i: list){
                if(i>max){
                    max = i;
                }
            }
            return max;
        }

        public int getMin(){
            int min = Integer.MAX_VALUE;
            
            for(int i: list){
                if(i<min){
                    min = i;
                }
            }
            return min;
        }


        
    }

    class NumberCollection implements Container{
        private ArrayList<Integer> list = new ArrayList<>();

        public void add(int i) {
            list.add(i);
        }

        public NumberIterator getIterator() {
            return new NumberIterator(list);
        }


    }

    public void start() {
        NumberCollection nc = new NumberCollection();

        nc.add(1);
        nc.add(3);
        nc.add(5);
        nc.add(4);
        nc.add(2);
        nc.add(0);

        NumberIterator iter = nc.getIterator();

        System.out.println("Iterating List");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Smallest List Value");
        System.out.println(iter.getMin());

        System.out.println("Largest List Value");
        System.out.println(iter.getMax());
    }


    public static void main(String args[]){
        IteratorTool tool = new IteratorTool();
        tool.start();

    }

}