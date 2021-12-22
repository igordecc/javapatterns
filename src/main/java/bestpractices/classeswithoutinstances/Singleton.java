package bestpractices.classeswithoutinstances;

public class Singleton {

    private Singleton () {
        System.out.println("init singleton");
    }
    public static final Singleton INSTANCE = new Singleton();

//    public static Singleton getInstance()  {
//        return INSTANCE;
//    }

    public static void print(){
        System.out.println("CHECK");
    }

}
