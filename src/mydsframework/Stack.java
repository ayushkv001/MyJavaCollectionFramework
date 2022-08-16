package mydsframework;


import mydsframework.absClass.SLL;

public class Stack<T> extends SLL<T>
{
    Stack()
    {
        head = new NODE();
    }
    void push(T x)
    {
        this.add(x);
    }
    T pop()
    {
        return this.deleteAtBack();
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

