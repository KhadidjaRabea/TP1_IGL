/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_igl;

/**
 *
 * @author Khadidja
 */


public class VectorHelper {
    
   private int []Vect;
   private int min;
   private int max;
   private int l;

   
    
    /**
     *
     * @param vect un vecteur d'entiers 
     * @param l la taille de la veteur  
     */
     VectorHelper (int vect []){
       
        Vect=vect;
        this.l=Vect.length;
    }

    /**
     *
     * @return retourne un pointeur vers Vect
     */
    public int[] getVect() {
        return Vect;
    }

    /**
     *
     * @return le minimum dans Vect
     */
    public int getMin() {
        return min;
    }

    /**
     *
     * @return le maximum du Vect
     */
    public int getMax() {
        return max;
    }

    /**
     *
     * @return la taille du Vect
     */
    public int getL() {
        return l;
    }
  
    /**
     * calculer le min et le max du vect 
     * exemple : Vect ={1,2,3,47,7}
     * min=1; max=47
     */
    public void MaxMin ( ){
      
         max=Vect[0];
         min=Vect[0];
       
       for( int i: Vect)
       {
           if (i> max) max=i;
           if (i<min) min=i;
       }
       System.out.println("\n");
       System.out.println("Max= "+max+", Min="+min+" \n");
   }
   
    /**
     * inverser les éléments du Vect
     * exemple: vect={4,8,7,46,93,3,1}
     *          resultat : vect={1,3,93,46,7,8,4}
     */
    public void inverser()
   {
       int inf,sup,x;
       inf=0; sup=l-1;
       
       while(inf<=sup)
       {
           x=Vect[sup];
           Vect[sup]=Vect[inf];
           Vect[inf]=x;
           
           inf++; sup--;
       }
     
   }
   
    /**
     *
     * @param V1 un vecteur d'entiers
     * @param V2 un vecteur d'entiers 
     * @param l1 la taille du V1
     * @param l2 la taille du V2
     * @throws diffrenceInLengthException
     * exemple : V1={1,2,-1,7} V2={0,5,6,4}
     *           l1=l2= 4
     *           resultat: V1={1,7,5,11} V2={0,5,6,4}
     */
    public  static void Somme2Vect( int V1[],int V2[],int l1,int l2 ) throws diffrenceInLengthException{
       
       if(l1!=l2)
           throw new diffrenceInLengthException(" ERROR! les deux vecteurs n'ont pas la meme longueur");
       else 
       {
           for ( int i=0;i<l1;i++)
           {
               V1[i]+=V2[i];
           }
       }
           
   }
   
    /**
     * trier les éléments du Vect
     * exemple : vect={7,8,-1,-2,6,7,3}
     *           resultat: vect{-2,-1,3,6,7,7,8}
     */
    public void Trie( )
   {       boolean verif=true;
           int m=l;
   while (verif || m>2)
   {
        verif =false;
        for (int i=0;i<m-1;i++)
            {if (Vect[i]>Vect[i+1] || Vect[i]== Vect[i+1])
                {
                 int sauve =Vect[i];
                 Vect[i]=Vect[i+1] ;
                 Vect[i+1]=sauve;
                 verif=true;
                
           
           }
   }
        m=m-1;
    }
   }
   
    /**
     * multiplier les éléments du Vect par n
     * @param n un entier 
     * exemple: Vect={1,5,8,9} n=2
     *          Resultat : Vect={2,10,16,18}
     */
    public void Vector_produit( int n)
   { int j=0;
    for (int i:Vect)
    {
        Vect[j]=n*i; j++;
    }
   
   } 
    
}
