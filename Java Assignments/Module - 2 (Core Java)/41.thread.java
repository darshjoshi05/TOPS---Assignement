// W.A.J. P to create one thread by implementing Runnable interface in Class.

class fortyOne {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

}