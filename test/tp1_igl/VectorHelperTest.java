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
       
        VectorHelper instance = new VectorHelper(Vect);
        instance.inverser();
        
        int []  expResult={3,2,1};
        assertArrayEquals(expResult,instance.getVect());
           
    }

 

   

    /**
     * Test of MaxMin method, of class VectorHelper.
     **/
    @Test
    public void testMaxMin() {
        System.out.println("MaxMin");
        int[] Vect = {-10,2,5,9,20};
        VectorHelper instance = new VectorHelper(Vect);
        instance.MaxMin();
         int ExpResultmin=-10;
        assertEquals(ExpResultmin,instance.getMin());
        int ExpResultmax=20;
        assertEquals(ExpResultmax,instance.getMax());
    }

  
  

    /**
     * Test of Somme2Vect method, of class VectorHelper.
     */
     /* @Test(expected = diffrenceInLengthException.class)
    public void testSomme2Vect()throws diffrenceInLengthException {
        System.out.println("Somme2Vect");
        int[] V1 = {1,2,3};
        int[] V2 = {-1,4};
        
       VectorHelper instance1 = new VectorHelper(V1);
       VectorHelper instance2 = new VectorHelper(V2);
  
        VectorHelper.Somme2Vect(instance1.getVect(),instance2.getVect(), instance1.getL(), instance2.getL());
        int ExpResult []={0,6,9};
        assertArrayEquals(ExpResult,V1);
    }*/
    
    
      @Test()
    public void testSomme2Vect()throws diffrenceInLengthException {
        System.out.println("Somme2Vect");
        int[] V1 = {1,2,3};
        int[] V2 = {-1,4,6};
        
       VectorHelper instance1 = new VectorHelper(V1);
       VectorHelper instance2 = new VectorHelper(V2);
  
        VectorHelper.Somme2Vect(instance1.getVect(),instance2.getVect(), instance1.getL(), instance2.getL());
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
        VectorHelper instance = new VectorHelper(V);
        instance.Trie();
        int [] ExpResult ={-1,7,8,44,47,47};
         assertArrayEquals(ExpResult,instance.getVect());
    }

    /**
     * Test of Vector_produit method, of class VectorHelper.
     */
    @Test
    public void testVector_produit() {
        System.out.println("Vector_produit");
        int[] v = {1,2,3,4,5,6};
        int n= 2;
        VectorHelper instance = new VectorHelper(v);
        instance.Vector_produit(n);
        
        int ExpResult []={2,4,6,8,10,12};
        assertArrayEquals(ExpResult,instance.getVect());
        
    }   
    
}
