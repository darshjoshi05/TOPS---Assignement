// W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.

class fortyThree {

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread 2 is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}