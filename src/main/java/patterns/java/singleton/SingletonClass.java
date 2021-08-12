package patterns.java.singleton;

class SingletonClass {
    private static SingletonClass obj=new SingletonClass();//Early, instance will be created at load time
    private SingletonClass(){}

    public static SingletonClass getA(){
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
