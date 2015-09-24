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
public class TestClass {
   public static void main(String[] args){
       CS2022LinkedList<Integer> myList = new CS2022LinkedList<>();
       
       myList.insert(90);
       myList.insert(123);
       myList.insertAt(12,1);
       System.out.println(myList.deleteNodeAt(2));
   }
}
