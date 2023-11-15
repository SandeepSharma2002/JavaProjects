public class AnotherThread extends Thread {
    
    public void run(){
          for (int i = 20; i >= 0; i--) {
            
            System.out.println("Another Thread");
          }
    }
}
