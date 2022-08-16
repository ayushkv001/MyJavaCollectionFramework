package mydsframework.node;


//For both direction traversing
public class NodeD<T>{
    public NODE head;
    public class NODE{
        public NODE next;
        public T data;
        public NODE prev;
        public NODE(){
            next=null;
            data=null;
            prev=null;
        }
        public NODE(T x){
            next =null;
            data=x;
            prev=null;
        }
    }
}
