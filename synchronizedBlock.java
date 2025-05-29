public class MainClass {
    public static void main(String[] args) {
        Table sharedTable = new Table();
        
        Mythread1 t1 = new Mythread1(sharedTable);
        Mythread2 t2 = new Mythread2(sharedTable);
        
        t1.start();
        t2.start();
    }
}


class Table {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println( "Thread I " + (n * i));
                } catch (Exception e) {
                    System.out.println("Exception");
                }
            }
        }
    }
}

class Mythread1 extends Thread {
    Table t;

    Mythread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Mythread2 extends Thread {
    Table t;

    Mythread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
