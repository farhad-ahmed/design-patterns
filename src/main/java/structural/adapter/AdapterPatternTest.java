package structural.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LocalWorker(), "thread-1");

        Thread t2 = new Thread(new LocalWorker2(), "thread-2");

        /**There is no way to run RemoteWorker class as we can't modify the class (implementing the Runnable Interface).
         * We use adapter pattern to wrap the RemoteWorker class and using implementing Runnable Interface that is allowing
         * to run the class in thread**/

        Thread t3 = new Thread(new RemoteWorkerAdapter(), "thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
