package bestpractices.deleteobjects;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public  Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }
    /**
    * убедиться в том, что в стеке есть мусто, хотя бы еще для
     * одного элемента, каждый раз когда нужно увеличить массив,
     * просто удваивать его емкость
    * */

    public void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size  + 1);
    }
}
