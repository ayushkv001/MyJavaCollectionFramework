package mydsframework.absClass;

import mydsframework.in.FrameworkM;
import mydsframework.node.NodeD;

public abstract class DLL<T> extends NodeD<T> implements FrameworkM<T> {
    public void add(T x)
    {
        NODE e = new NODE(x);
        NODE hea,q;
        hea= this.head;
        while(hea.next!=null)
            hea=hea.next;
        if(hea!=this.head){
            e.prev=hea;}
        hea.next=e;
    }
    public void addAtLast(T x)
    {
        NODE e = new NODE(x);
        NODE hea;
        hea= this.head;
        while(hea.next!=null)
            hea=hea.next;
        if(hea!=this.head){
            e.prev=hea;}
        hea.next=e;
    }
    public void addAtFront(T x)
    {
        NODE e = new NODE(x);
        e.next=this.head.next;
        this.head.next = e;
    }
    public void print()
    {
        NODE temp = this.head.next;
        while(temp!=null)
        {
            System.out.print(temp.data );
            if(temp.next!=null)
                System.out.print(" : ");
            temp=temp.next;
        }
        System.out.println();
    }
    public T get(int d)
    {
        NODE temp = this.head.next;
        int i=0;
        while(temp.next!=null && i<d)
        {
            temp = temp.next;
            i++;
        }
        if(i<d)
        {
            System.out.println(d + " Error : @OutOfBound ");
            return null;
        }
        T j = temp.data;
        return j;
    }
    public T set(T x,int d)
    {
        NODE temp = this.head.next;
        int i=0;
        while(temp.next!=null && i<d)
        {
            temp = temp.next;
            i++;
        }
        if(i<d)
        {
            System.out.println(d + " Error : @OutOfBound ");
        }
        T y = temp.data;
        temp.data = x;
        return y;
    }
    public T deleteAtFront()
    {
        NODE prev = this.head;
        this.head = prev.next;
        T d = prev.data;
        prev.data=null;
        System.gc();
        prev=null;
        return d;
    }
    public T deleteAtBack()
    {
        NODE temp = this.head,prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        T d = temp.data;
        temp.data=null;
        prev.next=null;
        System.gc();
        return d;
    }
}
