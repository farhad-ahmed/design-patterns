package structural.adapter;

public class RemoteWorkerAdapter implements  Runnable{

    @Override
    public void run() {
        RemoteWorker remoteWorker = new RemoteWorker();
        remoteWorker.run();
    }
}