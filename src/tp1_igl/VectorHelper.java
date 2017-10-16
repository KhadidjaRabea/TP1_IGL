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
    
    
       
    
   public void AffichVecteur(int vect[])
    {   System.out.print("|");
        for (int i: vect)
        {
            System.out.print(i+"|");
        }
    }
   
 
   public int length(int Vect[])
   {   int l=0; 
    for (int i: Vect)
   { 
       l++;
   } 
      return l;
   }  
   
 
   public void MaxMin (int Vect[]){
      
       int max=Vect[0];
       int min=Vect[0];
       
       for( int i: Vect)
       {
           if (i> max) max=i;
           if (i<min) min=i;
       }
       System.out.println("\n");
       System.out.println("Max= "+max+", Min="+min+" \n");
   }
   

   public void inverser(int Vect [],int l)
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
   
   
    public void Somme2Vect(int V1[], int V2[], int l1,int l2) throws diffrenceInLengthException{
       
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
   
      public void Trie_Bulle( int V[],int l)
   {       boolean verif=true;
           int m=l;
   while (verif || m>2)
   {
        verif =false;
        for (int i=0;i<m-1;i++)
            {if (V[i]>V[i+1])
                {
                 int sauve =V[i];
                 V[i]=V[i+1] ;
                 V[i+1]=sauve;
                 verif=true;
                 }
            m=m-1;
           }
   }
    }
   
   
    public void Vector_produit(int v[], int l)
   { int j=0;
    for (int i:v)
    {
        v[j]=l*i; j++;
    }
   
   }

    
}
