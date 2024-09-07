// W.A.J. P to create one thread by extending Thread class in another Class.

class fortyTwo {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}