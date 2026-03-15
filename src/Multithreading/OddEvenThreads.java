package Multithreading;

class NumberPrinter {
    private int number = 1;
    private int limit;

    NumberPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {
        while(number <= limit) {
            try {
                if(number % 2 == 0) {
                    wait();
                }
            }catch (InterruptedException exception) {

            }
            if(number <= limit) {
                System.out.println(Thread.currentThread().getName() + " : " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= limit) {
            if(number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException exception) {
                    // catch exp
                }
            }
            if(number <= limit) {
                System.out.println(Thread.currentThread().getName() + " : " + number);
                number++;
                notify();
            }
        }
    }
}

public class OddEvenThreads {

    public static void main(String args[]) {
        NumberPrinter numberPrinter = new NumberPrinter(10);
        Thread t1 = new Thread(() -> {
            numberPrinter.printOdd();
        },"Odd Thread");

        Thread t2 = new Thread(() -> {
            numberPrinter.printEven();
        }, "Even Thread");

        t1.start();
        t2.start();
    }
}
