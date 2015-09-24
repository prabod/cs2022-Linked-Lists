/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2022Labs;

/**
 *
 * @author prabod
 * @param <E>
 */
public class CS2022LinkedList<E> {

    private Node<E> head;
    private int length;
    
    CS2022LinkedList(){
        init_list();
    }

    private void init_list() {
        length = 0;
        setHead(new Node<>(null));
        
    }

    public boolean is_empty() {
        return length == 0;
    }

    public Node<E> search(E element) {
        Node<E> listHead = getHead();
        Node<E> listCurrent = listHead;
        E listCurrentElement = listCurrent.getElement();
        
        while(listCurrentElement != element){
            
            listCurrent = listCurrent.getNext();
            
            if (listCurrent!= null){
                listCurrentElement = listCurrent.getElement();
            }
            else{
                
                break;
            }
        }
        
        return listCurrent != null ? listCurrent : null;
    }

    public E delete(E element) {
        Node<E> listPrev = getHead();
        Node<E> listCurrent = listPrev;
        E listCurrentElement = listCurrent.getElement();
        
        while(listCurrentElement != element){
            listPrev = listCurrent;
            listCurrent = listCurrent.getNext();
            
            if (listCurrent!= null){
                listCurrentElement = listCurrent.getElement();
            }
            else{
                
                break;
            }
        }
        boolean delete;
        if(listCurrentElement == element){
            listPrev.setNext(listCurrent.getNext());
            delete = true;
        }
        else delete = false;
        decrementLength();
        return delete ? element : null;
    }

    public E deleteNodeAt(int i) {
        int index = 1;
        Node<E> listPrev = getHead();
        Node<E> listCurrent = listPrev;
        if (i > getLength()) return null;
        while(index != i){
            listPrev = listCurrent;
            listCurrent = listCurrent.getNext();
            index++;
        }
        listPrev.setNext(listCurrent.getNext());
        decrementLength();
        return listCurrent.getElement();
    }

    public boolean insert(E element) {
        Node<E> tempNode = new Node<>(element);
        Node<E> listCurrent = getHead();
        
        while(listCurrent.getNext() != null){
            listCurrent = listCurrent.getNext();
        }
        if(listCurrent.getElement()!= null){
            listCurrent.setNext(tempNode);
            }
        else setHead(tempNode);
        incrementLength();
        return true;
    }

    public boolean insertAt(E element, int i) {
        Node<E> tempNode = new Node<>(element);
        Node<E> listCurrent = getHead();
        
        if (i > getLength() + 1) return false;
        int index = 1;
        
        while(index != i-1 && index < i){
            listCurrent = listCurrent.getNext();
            index++;
        }
        
        if (i == 1){
            tempNode.setNext(getHead());
            setHead(tempNode);
        }
        else{
            if(listCurrent.getNext() != null) tempNode.setNext(listCurrent.getNext());
            listCurrent.setNext(tempNode);
        }
        incrementLength();
        return true;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getHead() {
        return head;
    }

    public void incrementLength() {
        this.length++;
    }

    public void decrementLength() {
        this.length--;
    }

    public int getLength() {
        return length;
    }

}
