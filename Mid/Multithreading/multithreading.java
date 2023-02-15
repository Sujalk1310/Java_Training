import java.lang.Thread;

class MultiDemo implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().threadId()+" "+Thread.currentThread().getName());
    }
}

public class multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread t = new Thread(new MultiDemo());
            t.start();
        }
    }
}
 