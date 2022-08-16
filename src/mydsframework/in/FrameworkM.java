package mydsframework.in;

public interface FrameworkM<T> extends DSFramework {
    void add(T x);
    void addAtFront(T x);
    void addAtLast(T x);
    T get(int d);
    T set(T x,int d);
    T deleteAtFront();
    T deleteAtBack();
}
