package LSEWithDescriptor;

public class LSEWithDescrip<T> {
    private LSENode<T> first;
    private LSENode<T> last;
    private int quantity;
    
    public boolean isEmpty(){
        if (this.first == null && this.last == null && this.quantity == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmptyNodes() {
        if (this.quantity == 0 && this.last == null && this.first == null) {
            return true;
        }
        return false;
    }

    public LSENode<T> improvedSearch(T content) {
        LSENode<T> aux;
        if (isEmptyNodes()) {
            return null;
        } else {
            aux = this.first;
            for (int i = 1; i <= this.quantity; i++) {
                if (aux.getInfo().equals(content)) {
                    return aux;
                }
                aux = aux.getNext();
            }
            return null;
        }
    }
    
    public void removeFirst() {
        LSENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }       
        else {
            aux = this.first;
            this.first = aux.getNext();
            this.quantity--;
            if (this.quantity == 0) {
                this.last = null;
            }
        }
        
    }

    public void remove (T value) { 
        LSENode<T> aux, previous, current;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else if (this.quantity == 1) {
            if (value.equals(this.first)) {
                this.first = null;
                this.last = null;
                this.quantity = 0;
            }
            else {
                System.out.println("value não pertence a lista");
            }
        }
        else { // lista com mais de um nó
             if (value.equals(this.first)) { // remoção do first
                 this.first = this.first.getNext();
                 this.quantity--;
             }
             else if (value.equals(this.last)) { // remoção do último
                 aux = this.first;
                 while (aux.getNext() != this.last) {
                     aux = aux.getNext();
                 }
                 aux.setNext(null);
                 this.last = aux;
                 this.quantity--;
             }
             else { // remoção no "meio da lista"
                 previous = null;
                 current = this.first;
                 while (current != null) {
                     if (value.equals(current)){ // achou , remove
                        previous.setNext(current.getNext());
                        this.quantity--;
                        break;
                     }
                     else {
                         previous = current;
                         current = current.getNext();
                     }
                 }
             }       
        }
    }

    public void insert(T content) {
        LSENode<T> current;
        LSENode result = this.improvedSearch(content);
        LSENode<T> n = new LSENode(content);

        if (result != null) {
            System.out.println("OBJETO JÁ CADASTRADO!");
        } else if (this.isEmptyNodes()) {
            this.first = n;
            this.last = n;
            this.quantity++;
        } else { // insercao no final da lista

            this.last.setNext(n);
            this.last = n;
            this.quantity++;
        }
    }
    
    public void insertAtTheBeginning (T value) {
        LSENode<T> newNode = new LSENode(value);
        if (this.isEmpty() == true) {
            this.first = newNode;
            this.last = newNode;
            this.quantity++;
        }
        else {
            newNode.setNext(this.first);
            this.first = newNode;
            this.quantity++;
        }
    }
    
    public void showAll () {
        LSENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            aux = this.first;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }       
    }   
    
}
