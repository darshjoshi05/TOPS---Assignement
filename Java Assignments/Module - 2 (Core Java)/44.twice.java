// W.A.J.P to start the same Thread twice by calling start () method twice.

class fortyFour {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}