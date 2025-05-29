public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());

        t1.start();
        t2.start();
        t3.start();
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread I " + i);
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread J " + j);
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread K " + k);
        }
    }
}
