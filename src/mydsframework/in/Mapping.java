package mydsframework.in;

public interface Mapping<K,T> extends DSFramework {
    void add(K key,T value);
    T get(K key);
    T set(K key,T value);
    T remove(K key);

}
