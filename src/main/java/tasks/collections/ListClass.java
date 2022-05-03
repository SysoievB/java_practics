package tasks.collections;

public interface ListClass<T> {

    void add(T element);

    void add(int index, T element);

    T get(int index);

    void remove(int index);

    T set(int index, T element);

    void print();

    int size();
}
