public class Company {

    int n;
    boolean f = false; 
    synchronized public void Produce_item(int n) throws InterruptedException{
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Item Produced" + this.n);
        f = true;
        notify();

    }

   synchronized public void Consume_item() throws InterruptedException{
       if (!f) {
            wait();
        }
        System.out.println("Item Consumed" + this.n);
        f = false;
        notify();

    }
}
