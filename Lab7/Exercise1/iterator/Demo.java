public class Demo{

    public static void main(String args[]){
        ProductCollection pc = new ProductCollection();

        Product p1 = new Product(1, "p1");
        Product p2 = new Product(2, "p2");
        Product p3 = new Product(3, "p3");
        Product p4 = new Product(4, "p4");

        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);

        Iterator iter = pc.getIterator();

        while(iter.hasNext()){
            System.out.println(iter.next().toString());
        }

    }
}