public class demo{

    public static void main(String args[]){

        //PART 1
        // Logger l1 = new Logger("bank1");
        // Logger l2 = new Logger("bank1");
        // Logger l3 = new Logger("bank2");

        // boolean result1 = (l1 != l2);
        // boolean result2 = l1 != l3;
        // System.out.println("write to same file: " + result1);
        // System.out.println("write to different file: " + result2);

        // // //PART 2
        // Logger l1 = Logger.getInstance("bank");
        // Logger l2 = Logger.getInstance("bank");
        // Logger l3 = Logger.getInstance("bank1");

        // boolean result1 = (l1 == l3);
        // System.out.println("Write to different files: " + result1);

        // boolean result2 = (l1 == l2);
        // System.out.println("write to same file: " + result2);


        // l1.write("Withdrawal");
        // l1.write("Deposit");
        // l2.write("Transfer");
        // l2.write("Deposit");

        //PART 3

        Thread t1 = new Thread(new RunnableProcess("bank", "deposit"));
        Thread t2 = new Thread(new RunnableProcess("vault", "withdraw"));

        t1.start();
        t2.start();


    }
}