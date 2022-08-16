package mydsframework.node;

//for single direction traversing
public class NodeS<T>{
    public NODE head;
    public class NODE{
        public NODE next;
        public T data;
        public NODE(){
            next=null;
            data=null;
        }
        public NODE(T x){
            next =null;
            data=x;
        }
    }
}