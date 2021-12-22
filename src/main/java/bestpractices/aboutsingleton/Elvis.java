package bestpractices.aboutsingleton;

// как тестировать такой singleton класс?

// есть два выхода

// вариант 1
// - конструктор будет final
//public class Elvis {
//
//    public static final Elvis INSTANCE = new Elvis();  // !
//    private Elvis() {}
//    public void leaveTheBuilding() {}
//
//}

// вариант 2
// создать статический метод генерации

//public class Elvis {
//    private static final ELvis INSTANCE = new Elvis(); // !
//    private Elvis() {}
//    public static Elvis getInstance(){return INSTANCE;} //!
//    public void leaveTheBuilding() {}
//}

// вариант 3

//public class Elvis {
//    private Elvis(){}
//    private static Elvis INSTANCE;
//    // не потокобезовасно
//    public static Elvis getInstance(){
//        if (INSTANCE == null) {
//            INSTANCE = new Elvis();
//        }
//        return INSTANCE;
//    }
//}

// Единственное что клиент сможет сделать в таком случае:
// запустить частный конструктор с помощью метода AccessibleObject.setAccessible

// don't work in 11 java:

//import java.lang.reflect.AccessibleObject;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Modifier;
//
//public class Elvis implements ElvisInterface {
//
//    public static final ElvisInterface INSTANCE = new Elvis();  // !
//    private Elvis() {}
//    public void leaveTheBuilding() {}
//
//    public static void main(String[] args) {
//        Elvis[] some = new Elvis[0];
//
//        Constructor some = new Constructor(Elvis.class, null, null, Modifier.PRIVATE, 0, "", null, null);
//        AccessibleObject.setAccessible(some, true);
//
//
//        Elvis.INSTANCE = Elvis2.INSTANCE;
//        System.out.println(Elvis.INSTANCE);
//
//        // TODO: PAGE 24
//        // TODO: how to check
//
//
//    }
//    class Elvis2 extends Elvis {
//        public void threshMethod(){
//            System.out.println("1111111111");
//        }
//    }
//}






