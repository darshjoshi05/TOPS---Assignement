// W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon () method of Thread class and check whether the thread is set daemon or not by using is Daemon () method.

class fortyFive {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        if (t1.isDaemon()) {
            System.out.println("Thread is daemon");
            t1.start();
        } else {
            System.out.println("Thread is not daemon");
        }

        MyThread t2 = new MyThread();
        t2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}