package structural.adapter;

/**
Assuming this is a third party class that we can't modify
There is no way to implement Runnable Interface
 **/
public class RemoteWorker {
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Remote Worker working on topic-2");
        }
    }
}