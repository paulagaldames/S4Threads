import java.lang.Thread;


public class Main {
    public static void main(String[] args) {
        Thread avion1 = new Thread(new Avion1());
        Thread avion2 = new Thread(new Avion2());
        Thread avion3 = new Thread(new Avion3());

        avion1.start();
        avion2.start();
        avion3.start();
    }
}

class Avion1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Avión 1: Despegando...");

    }
}

class Avion2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Avión 2: Aterrizando...");

    }
}

class Avion3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Avion 3: Despegando...");
    }
}

