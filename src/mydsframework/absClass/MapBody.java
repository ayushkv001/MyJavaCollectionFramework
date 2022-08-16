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

    //working on algorithm
    public void addAtFront(K key,T value){

    }
    public void addAtLast(K key,T value){

    }
    public T get(K key){
        return null;
    }
    public T set(K key,T value){
        return null;
    }
    public T deleteAtFront(){
        return null;
    }
    public T deleteAtBack(){
        return null;
    }
}
