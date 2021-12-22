package thread.java;

public class Basics extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.start();
        while (obj.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
