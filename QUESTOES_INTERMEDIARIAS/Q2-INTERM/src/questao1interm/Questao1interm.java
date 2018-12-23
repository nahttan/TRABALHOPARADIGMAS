
package questao1interm;

import java.util.Scanner;

public class Questao1interm {

    
    public static void main(String[] args) {
       int dama[][]= new int [8][8];
       int opre[][]=new int[8][8];
       int q=0,w=0,p=0,y=0;
       Scanner t = new Scanner(System.in);
       while(q<8){
           while(w<8){
               
               System.out.println("\"\\n\\tProgr(d)ama\\n\\tPara peças pretas digite -1 ,para brancas 1 e se a casa estiver vazia 0\\n");
               p=t.nextInt();
              while(p!=0 && p!= 1 && p!= -1) {
                  System.out.println("Só são aceitas entradas 1,0 ou -1\\nReinsira a posicao %dx%d\\n\"+q+1+w+1");
                   p=t.nextInt();
           }
     opre[q][w]=0;
     dama[q][w]=p;
               
    w++;    
    }
     w=0;
     q++;
           
    
}
q=0;
w=0;
  while(q<8)
      {
         while(w<8)
         {
            if(dama[q][w]==-1)
            {
               while(p<2)
               {
                  switch(p)
                  {
                     case 0:
                     if(dama[q-1][w-1]==0 && q-1>=0 && w-1>=0)
                             System.out.println("\nA peça preta(%dx%d) pode ser movida para %dx%d"+q+1+w+1+q+w);
                     else
                     y++;

                     break;
   
                     case 1:
                     if(dama[q-1][w+1]==0 && q-1>=0 && w+1>=0 && w+1<8)
                             System.out.println("\nA peça preta(%dx%d) pode ser movida para %dx%d"+q+1+w+1+q+w+2);
                     else
                     y++;

                     break;
                  }
               p++;
               }
            
               if(y==2)
               {
                  opre[q][w]=7;
                   System.out.println("\nFlag chin(%dx%d)"+q+1+w+1);
               }
            p=-1;
            y=0;
            }
         w++;
         }
      w=0;
      q++;
      }

      q=0;
      w=0;
      p=0;
      y=0;

      while(q<8)
      {
         while(w<8)
         {
            if(dama[q][w]==-1)
            {
               while(p<2)
               {
                  switch(p)
                  {
                     case 0:
                     if(dama[q-1][w-1]==1 && q-1>=0 && w-1>=0)
                     {
                        if(dama[q-2][w-2]==0 && q-2>=0 && w-2>=0)
                             System.out.println("\nA peça preta(%dx%d) pode comer a peça branca(%dx%d)"+q+1+w+1+q+w);
                        else
                        {
                            System.out.println("\nFlag y#%d(%dx%d)"+y+q+1+w+1);
                           y++;
                        }
                     }
                     else
                     {
                        if(dama[q-1][w-1]==-1 || q-1<0 || w-1<0)
                        y++;
                     }

                     break;
   
                     case 1:
                     if(dama[q-1][w+1]==1 && q-1>=0 && w+1>=0)
                     {
                        if(dama[q-2][w+2]==0 && q-2>=0 && w+2>=0 && w+2 <8)
                             System.out.println("\nA peça preta(%dx%d) pode comer a peça branca(%dx%d)"+q+1+w+1+q+w+2);
                        else
                        {
                            System.out.println("\nFlag y#%d(%dx%d)"+y+q+1+w+1);
                           y++;
                        }
                     }
                     else
                     {
                        if(dama[q-1][w+1]==-1 || q-1<0)
                        y++;
                     }

                     break;
                  }
               p++;
               }

            if(y==2 && opre[q][w]==7)
            {
                System.out.println("\nA peça preta(%dx%d) não pode se mover"+q+1 +w+1);
               y=0;
            }

            y=0;
            p=-1;
            }
         w++;
         }
      w=0;
      q++;
      }

        System.out.println("\n");

       
       
       
    }
}