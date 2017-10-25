/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khadidja
 */
public class TP1_IGL {

   
    public static void main(String[] args) {
        
        int [] v1={4,1,2,3};
        int [] v2={0,7,-1,2};
        
        VectorHelper vect1=new VectorHelper(v1);
        VectorHelper vect2=new VectorHelper(v2);
         
        /****** Afficher le vecteur **************/
        
        System.out.println(" **** La fonction affiche ****");
        vect1.Affich();
        
        /******* trier les éléments du vecteur ****/
        
        System.out.println(" **** La fonction Trie ****");
        vect1.Trie();
        vect1.Affich();
        
        /****** inverser les éléments du vecteur ****/
      
        System.out.println(" **** La fonction inverser ****");
        vect1.inverser();
        vect1.Affich();
        
        /********* affiher le min et le max ******/
        
        System.out.println("**** La fonction MinMax *** ");
        vect1.MaxMin();
       
        /******** Somme de deux vecteurs *******/
        
        System.out.println("***** la fonction somme2Vect*****");
        vect1.Affich();
        vect2.Affich();
        try {
            VectorHelper.Somme2Vect(vect1.getVect(), vect2.getVect(), vect1.getL(), vect2.getL());
            vect1.Affich();
        } catch (diffrenceInLengthException ex) {
            Logger.getLogger(TP1_IGL.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        /********* multiplier les éléments du vecteurs par un entier n *****/
        
        System.out.println("***** la fonction Vctor_produit*****");
        vect1.Vector_produit(2);
        vect1.Affich();
        
        
    }
    
}
