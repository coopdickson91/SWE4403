public class AESMessage implements Message{
   @Override
   public void send() {
       System.out.println("Encrypting message using AES");
       System.out.println("Sending the encrypted message...");
   }
}