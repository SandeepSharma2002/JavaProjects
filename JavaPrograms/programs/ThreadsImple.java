public class ThreadsImple implements Runnable {

        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("I m child Thread.");
                // try {
                    // Thread.sleep(1000);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
            }
        }

    public static void main(String[] args) {

        ThreadsImple d= new ThreadsImple();
        Thread t = new Thread(d);
        AnotherThread th = new AnotherThread();
        th.start();
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main thread");
        }

        
    }
}
