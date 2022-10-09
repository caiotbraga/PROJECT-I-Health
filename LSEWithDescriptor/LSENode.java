package LSEWithDescriptor;

public class LSENode<T> {
    private T info;
    private LSENode<T> next;   
    public LSENode (T value) {
        this.info = value;
    }
    public void setInfo (T value) {
        this.info = value;
    }
    public T getInfo() {
        return this.info;
    }
    public void setNext(LSENode<T> newNext) {
        this.next = newNext;
    }
    public LSENode<T> getNext () {
        return this.next;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof LSENode) {
            LSENode other = (LSENode) obj;
            return this.info.equals(other.info);
        }
        return false;
    }
    
}
