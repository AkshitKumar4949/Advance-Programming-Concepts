package generic;

public interface Container<T> {
    void add(T value);
    T get();
}
