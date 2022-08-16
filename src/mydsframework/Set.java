package mydsframework;

import mydsframework.absClass.SLL;

//No repeated elements

public class Set<T> extends SLL<T> {
    Set()
    {
        head = new NODE();
    }

    @Override
    public void add(T x)
    {
        NODE e = new NODE(x);
        NODE hea;
        boolean notAdd = false;
        hea= this.head;
        while(hea.next!=null) {
            if(hea.data == x){
                notAdd = true;
            }
            hea = hea.next;
        }
        if(notAdd==false )
        hea.next=e;
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
