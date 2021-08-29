package bestpractices.classeswithoutinstances;

// Класс утилит, не имеющий экземпляров
public class Utils {
    private Utils() {
        throw new AssertionError("Should not instantiate class");
    }

    public static int Add(int x, int y){
        return x+y;
    }
}
