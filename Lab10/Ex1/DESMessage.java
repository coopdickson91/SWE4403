public class DESMessage implements Message{
   @Override
   public void send() {
       System.out.println("Encrypting message using DES");
       System.out.println("Sending the encrypted message...");
   }
}