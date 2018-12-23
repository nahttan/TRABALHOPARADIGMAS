
package questao5interm;

import java.util.Scanner;


public class Questao5interm {

   
    public static void main(String[] args) {
       
        Scanner t= new Scanner(System.in);
 

      int i,j,k,n,m;
       int A[][]= new int[20][20];
       int I[]= new int [20];
       int custo;
      System.out.println("Entre com o numero de cidades n:\n");
      n=t.nextInt();
      while(n<0)
      {
                System.out.println("valor incorreto\n");
                System.out.println("digite outro valor\n");
               n=t.nextInt();
                 }
        System.out.println("Entre com a matriz de custos:\n");
      for(i=0;i<n;i=i+1)
      { for(j=0;j<n;j=j+1)
        {     
            A[i][j]=t.nextInt();
      
            System.out.println("Entre com o numero de itinerarios m e com o comprimento dos itinerarios k:\n");
      m=t.nextInt();
      k=t.nextInt();
      while(m<0)
      {
               System.out.println("valor incorreto\n");
                System.out.println("digite outro valor\n");
                 m=t.nextInt();
                 k=t.nextInt();
                 }
        
        for(j=0;j<k;j=j+1)
        {
                           I[j]= t.nextInt();                     
        custo=0;       
        
        for(i=0;i<(k-1);i=i+1)
         {
                               custo=custo+A[I[i]][I[i+1]];}
            System.out.println("O custo deste itinerario eh:R$%d\n"+custo);
         
         }
        
        }   
        
        
        
        
        
        
        
        
        
    }
    

