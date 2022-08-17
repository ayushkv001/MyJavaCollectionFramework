package mydsframework.absClass;

import mydsframework.in.Mapping;
import mydsframework.node.MapNode;

public abstract class MapBody<K,T> extends MapNode<K,T> implements Mapping<K,T> {
    public void add(K k,T v)
    {
        NODE e = new NODE(k,v);
        NODE hea;
        boolean shouldAdd = true;
        hea= this.head;
        while(hea.next!=null) {
            if (hea.key == k) {
                shouldAdd = false;
                break;
            }
            hea = hea.next;
        }
        if(shouldAdd)
            hea.next=e;
    }

    public void addAtFront(K key,T value){

    }
    public void addAtLast(K key,T value){

    }
    public T get(K key){
        NODE temp = this.head.next;
        T x=null;
        while(temp.next!=null )
        {
            if(temp.key==key){
                x = temp.value;
                break;
            }
            temp = temp.next;
        }
        if(x!=null)
            return x;

        return null;
    }
    public T set(K key,T value){
        NODE temp = this.head.next;
        T x=null;
        while(temp.next!=null )
        {
            if(temp.key==key){
                x = temp.value;
                temp.value=value;
                break;
            }
            temp = temp.next;
        }
        if(x!=null)
            return x;
        this.add(key, value);
        return value;
    }
    public T deleteAtFront(){
        return null;
    }
    public T deleteAtBack(){
        return null;
    }
    public T remove(K key){
        NODE e = this.head;
        T x = null;
        while(e.next!=null)
        {
            if(e.next.key==key)
            {
                x = e.next.value;
                e.next=e.next.next;
                break;
            }
            e=e.next;
        }
        return x;
    }
}
