package li.koly.EffectiveJava.favorGenericType;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackUseObject {
    private static final int DEFAULT_INITIAL_SIZE = 16;
    private Object[] elements;
    private int size = 0;

    public StackUseObject() {
        this.elements = new Object[DEFAULT_INITIAL_SIZE];
    }

    public void push(Object o){
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
