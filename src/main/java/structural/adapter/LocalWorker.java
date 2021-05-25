package structural.adapter;

public class LocalWorker implements Runnable{

    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("LocalWorker working on topic-1");
        }
    }
}