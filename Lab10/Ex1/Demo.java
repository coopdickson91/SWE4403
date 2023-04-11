public class Demo {
   public static void main(String[] args) {

      ChatClient client = new ChatClient(new AESMessage());		
      client.executemessage();

      client = new ChatClient(new DESMessage());		
      client.executemessage();
   }
}
