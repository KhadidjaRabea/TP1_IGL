/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khadidja
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
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

   
    @Test
    public void testInverser() {
        System.out.println("inverser");
        int[] Vect = {1,2,3};
        int l = 3;
        VectorHelper instance = new VectorHelper();
        instance.inverser(Vect, l);
        
        int []  expResult={3,2,1};
        assertArrayEquals(expResult,Vect);
           
    }

 

    /**
     * Test of length method, of class VectorHelper.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        int[] Vect = {1,2,3,4,5};
        VectorHelper instance = new VectorHelper();
        int expResult = 5;
        int result = instance.length(Vect);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of MaxMin method, of class VectorHelper.
     
    @Test
    public void testMaxMin() {
        System.out.println("MaxMin");
        int[] Vect = null;
        VectorHelper instance = new VectorHelper();
        instance.MaxMin(Vect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of Somme2Vect method, of class VectorHelper.
     */
    @Test
    public void testSomme2Vect() throws Exception {
        System.out.println("Somme2Vect");
        int[] V1 = {1,2,3};
        int[] V2 = {-1,4,6};
        int l1 = 3;
        int l2 = 3;
        VectorHelper instance = new VectorHelper();
        instance.Somme2Vect(V1, V2, l1, l2);
        int ExpResult []={0,6,9};
        assertArrayEquals(ExpResult,V1);
    }

    /**
     * Test of Trie_Bulle method, of class VectorHelper.
     */
    @Test
    public void testTrie_Bulle() {
        System.out.println("Trie_Bulle");
        int[] V = {7,8,44,47,47,-1};
        int l = 6;
        VectorHelper instance = new VectorHelper();
        instance.Trie_Bulle(V, l);
        int [] ExpResult ={-1,7,8,44,47,47};
         assertArrayEquals(ExpResult,V);
    }

    /**
     * Test of Vector_produit method, of class VectorHelper.
     */
    @Test
    public void testVector_produit() {
        System.out.println("Vector_produit");
        int[] v = {1,2,3,4,5,6};
        int l = 2;
        VectorHelper instance = new VectorHelper();
        instance.Vector_produit(v, l);
        
        int ExpResult []={2,4,6,8,10,12};
        assertArrayEquals(ExpResult,v);
        
    }   
    
}
