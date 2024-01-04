import java.lang.reflect.Array;

public class Stack<T> {
    private int size;
    private int capacity;
    private T[] data;

    public Stack() {
        size = 0;
        capacity = 10;
        data = (T[]) Array.newInstance(Object.class, capacity);
    }

    public Stack(Class<T> t) {
        size = 0;
        capacity = 10;
        data = (T[]) Array.newInstance(t, capacity);
    }

    public Stack(Class<T> t, int capacity) {
        size = 0;
        this.capacity = capacity;
        data = (T[]) Array.newInstance(t, capacity);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T t) {
        if (!isFull()) {
            data[size++] = t;
        } else {
            System.out.println("Stack is full !!!");
        }
    }

    public void pop(T t) {
        if (!isEmpty()) {
            data[size-1] = null;
            size--;
        } else {
            System.out.println("Stack is empty !!!");
        }
    }
}
