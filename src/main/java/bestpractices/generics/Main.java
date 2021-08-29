package bestpractices.generics;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        int SIZE = 10;
        
        final Collection stamps = Arrays.asList(new Stamp[SIZE]);
        stamps.forEach(System.out::println);


        final Collection<Stamp> stamps2 = Arrays.asList(new Stamp[SIZE]);
        stamps2.forEach(System.out::println);
    }



    public class Stamp{}

    public class Coin {}

}
