/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Scanner;

1public class Questao2 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     int IdadeMax=0;
     int Idade;
     int Cor_cabelo;        
     int Cor_olho;          
     int Sexo;              
     int i,especifico=0;
     float porct=0;

     for(int cont=0;cont!=2;cont++){
     System.out.print("sexo: \n 1-Masculino \n 2-Feminino \n");   
     Sexo = teclado.nextInt();


     System.out.print("Cor dos olhos \n 1-Azul \n 2-Castanhos \n 3-Verdes \n ");   
     Cor_olho=teclado.nextInt();

     System.out.print("Cor dos cabelos: \n 1-Preto \n 2-Castanhos \n 3-Loiros \n");
     Cor_cabelo=teclado.nextInt();

     System.out.print("Idade: ");
     Idade=teclado.nextInt();
     if(Idade>IdadeMax){
         IdadeMax = Idade;
     }
     if((Sexo==1)&&(Idade>=18 && Idade <= 35)&&(Cor_olho==3)&&(Cor_cabelo==3)){
        especifico +=especifico; 
     }
     porct = (especifico/2)*100;
     System.out.print("_______________________________________________________ \n");
     }
     System.out.println("A maior idade do grupo é "+IdadeMax);
     System.out.println("Porcentagem com as caracteristicas especificas"+porct);
}
}


