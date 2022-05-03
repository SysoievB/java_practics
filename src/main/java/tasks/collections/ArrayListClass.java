package tasks.collections;

public class ArrayListClass<T> implements ListClass<T> {

    private int capacity;
    private int index;
    private Object[] array;

    public ArrayListClass() {
        this.capacity = 10;
        array = new Object[capacity];
    }

    public ArrayListClass(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    @Override
    public void add(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                break;
            }
        }
    }

    @Override
    public void add(int index, T element) {
        for (int i = 0; i < this.array.length; i++) {
            if (index == i) {
                array[i] = element;
            }
        }
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < this.array.length; i++) {
            if (index == i) return (T) array[i];
        }
        return null;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < this.array.length; i++) {
            if (index == i) {
                array[i] = null;
            }
        }
    }

    @Override
    public T set(int index, T element) {
        for (int i = 0; i < this.array.length; i++) {
            if (index == i) {
                array[i] = element;
            }
        }
        return element;
    }

    @Override
    public void print() {
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }
}
