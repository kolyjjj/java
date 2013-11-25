package li.koly.EffectiveJava.favorGenericType;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {
    private static final int DEFAULT_SIZE = 16;
    private E[] elements;
    private int size = 0;

    public GenericStack() {
        elements = new E[DEFAULT_SIZE];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args){
        System.out.println("hello world");
    }

}
