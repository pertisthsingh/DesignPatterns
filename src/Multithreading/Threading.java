package Multithreading;

public class Threading {

    private boolean flag = false;

    public synchronized boolean getFlag() {
        return this.flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
    public Threading() {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setFlag(true);
            System.out.println("writer thread changed the value");
        });

        Thread readerThread = new Thread(() -> {
            while(!getFlag()) {

            }
            System.out.println("reader thread read the changes");
        });

        writerThread.start();
        readerThread.start();
    }
}
