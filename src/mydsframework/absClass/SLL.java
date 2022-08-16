package mydsframework.absClass;

import mydsframework.in.FrameworkM;
import mydsframework.node.NodeS;

public abstract class SLL<T> extends NodeS<T> implements FrameworkM<T>
{
    public void addLoop(T x)
    {
        NODE e = new NODE(x);
        NODE hea;
        hea= this.head;
        while(hea.next!=null)
            hea=hea.next;
        hea.next=e;
        hea.next.next=this.head;
    }
    public void add(T x)
    {
        NODE e = new NODE(x);
        NODE hea;
        hea= this.head;
        while(hea.next!=null)
            hea=hea.next;
        hea.next=e;
    }

    public void addAtLast(T x)
    {
        NODE e = new NODE(x);
        NODE hea;
        hea= this.head;
        while(hea.next!=null)
            hea=hea.next;
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
    /*public void delete(T x)
    {
        NODE e = this.head;
        NODE p = null;
        while(e!=null)
        {
            if(e.data==x)

            {
                p.next=e.next;
            }
            p=e;
            e=e.next;
        }
    }*/
    public void delete(T x)
    {
        NODE e = this.head;
        while(e.next!=null)
        {
            if(e.next.data==x)

            {
                e.next=e.next.next;
                break;
            }
            e=e.next;
        }
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
    public int detectLoop()
    {
        int d=0;
        NODE temp = this.head;
        while(temp.next!=null && temp.next!=temp)
        {
            NODE pr = this.head;
            while(pr!=temp)
            {
                if(temp.next==pr)
                {
                    System.out.println("Loop from "+temp.data+" to "+pr.data);
                    return d;
                }
                pr = pr.next;
            }
            temp=temp.next;
            d++;
        }
        d=0;
        temp = this.head;
        while(temp.next!=null)
        {
            if(temp.next == temp)
            {
                System.out.println("Selfloop at "+temp.data);
                return d;
            }
            temp=temp.next;
        }
        return -1;
    }
    public void deleteLoop(int x)
    {
        NODE temp = this.head;
        if(x==0)
            temp.next=null;
        else
        {
            for(int i=0;i<x;i++)
                temp=temp.next;
            temp.next=null;
        }
    }
    /*
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(this+" : This Garbage Collected ");
    }
    */
}
