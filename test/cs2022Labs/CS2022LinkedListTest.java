/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2022Labs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prabod
 */
public class CS2022LinkedListTest {
    
    public CS2022LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of is_empty method, of class CS2022LinkedList.
     */
    @Test
    public void testIs_empty() {
        System.out.println("is_empty");
        CS2022LinkedList instance = new CS2022LinkedList();
        boolean expResult = false;
        boolean result = instance.is_empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class CS2022LinkedList.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object element = null;
        CS2022LinkedList instance = new CS2022LinkedList();
        Node expResult = null;
        Node result = instance.search(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CS2022LinkedList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object element = null;
        CS2022LinkedList instance = new CS2022LinkedList();
        Object expResult = null;
        Object result = instance.delete(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNodeAt method, of class CS2022LinkedList.
     */
    @Test
    public void testDeleteNodeAt() {
        System.out.println("deleteNodeAt");
        int i = 0;
        CS2022LinkedList instance = new CS2022LinkedList();
        Object expResult = null;
        Object result = instance.deleteNodeAt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CS2022LinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object element = null;
        CS2022LinkedList instance = new CS2022LinkedList();
        boolean expResult = false;
        boolean result = instance.insert(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAt method, of class CS2022LinkedList.
     */
    @Test
    public void testInsertAt() {
        System.out.println("insertAt");
        Object element = null;
        int i = 0;
        CS2022LinkedList instance = new CS2022LinkedList();
        boolean expResult = false;
        boolean result = instance.insertAt(element, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHead method, of class CS2022LinkedList.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        CS2022LinkedList instance = new CS2022LinkedList();
        instance.setHead(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHead method, of class CS2022LinkedList.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        CS2022LinkedList instance = new CS2022LinkedList();
        Node expResult = null;
        Node result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementLength method, of class CS2022LinkedList.
     */
    @Test
    public void testIncrementLength() {
        System.out.println("incrementLength");
        CS2022LinkedList instance = new CS2022LinkedList();
        instance.incrementLength();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementLength method, of class CS2022LinkedList.
     */
    @Test
    public void testDecrementLength() {
        System.out.println("decrementLength");
        CS2022LinkedList instance = new CS2022LinkedList();
        instance.decrementLength();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class CS2022LinkedList.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        CS2022LinkedList instance = new CS2022LinkedList();
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
