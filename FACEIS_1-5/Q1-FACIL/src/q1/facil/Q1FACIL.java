/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1.facil;

import java.util.Scanner;

public class Q1FACIL {

    public static void main(String[] args) {
       int maior_idade=0,cont=0,cont_total=0;
       double percen;
       Scanner input = new Scanner(System.in);
       CART temp = new CART();
       do{
        System.out.println("Digitar nome");
        temp.nome= input.nextLine();
        System.out.println("Digitar cor cabelo");
        temp.cor_cabelo=input.nextLine();
        System.out.println("Digitar cor olhos");
        temp.cor_olhos=input.nextLine();
        System.out.println("Digitar sexo");
        temp.sexo=input.nextLine();
        System.out.println("Digitar idade");
        temp.idade=input.nextInt();
        input.nextLine();
            if(temp.idade>maior_idade){
            maior_idade=temp.idade;
            }
            if(temp.sexo.equalsIgnoreCase("feminino") && temp.cor_cabelo.equalsIgnoreCase("loiros") && (temp.idade>17 && temp.idade<36) ){
            cont++;
            }
            if(temp.idade>0){
                cont_total++;
            }
       }while(temp.idade>0);
       
       percen=((double)cont/(double)cont_total)*100;
        System.out.println("Maior idade"+maior_idade);
        System.out.println("Percentagem que atenndem as especificacoes "+percen);
       
    }
    
}