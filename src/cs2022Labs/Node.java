/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2022Labs;

/**
 *
 * @author prabod
 */
public class Node <E>{
	
	private E  element;
	private Node<E> next;
	
        public Node(E element){
            setElement(element);
            setNext(null);
        }
        
        public Node(E element,Node<E> next){
            setElement(element);
            setNext(next);
        }
        
	public void setElement(E element) {
		this.element = element;
	}
	public E getElement() {
		return element;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public Node<E> getNext() {
		return next;
	}
}
