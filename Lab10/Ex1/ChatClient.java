public class ChatClient {
   private Message message;

   public ChatClient(Message message){
      this.message = message;
   }

   public void executemessage(){
      message.send();
   }
}