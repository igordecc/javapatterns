package thread.java;

public class TryFinally {
    public static void main (String[] args) {
        System.out.println(TryFinally.method());
    }

    static int method() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
