package mydsframework.node;

public class MapNode<K,T> {
    public NODE head;
    public class NODE{
        public K key;
        public T value;
        public NODE next;
        public NODE(){
            this.key=null;
            this.value=null;
            next=null;
        }
        public NODE(K key,T value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }
}
