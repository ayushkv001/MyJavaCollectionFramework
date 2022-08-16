package mydsframework;

import mydsframework.absClass.SLL;

public class Queue<T> extends SLL<T> {
    Queue(){head = new NODE();}
    void enqueue(T x) { this.add(x);}
    T dequeue()
    {
        return this.deleteAtFront();
    }
    T peek()
    {
        return this.get(0);
    }
    T peek(int d)
    {
        return this.get(d);
    }
}
