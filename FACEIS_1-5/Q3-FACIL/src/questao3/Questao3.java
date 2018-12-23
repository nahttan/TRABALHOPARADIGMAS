/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;


public class Questao3 {


    public static void main(String[] args) {
    quadrado q= new quadrado();
    circulo c= new circulo();
    retangulo r= new retangulo();
    triangulo t= new triangulo();
    
        System.out.println("AREA QUADRADO " +q.area(1));
        System.out.println("AREA CIRCULO"+c.area(3));
        System.out.println("AREA RETANGULO"+r.area(3,4));
        System.out.println("AREA TRIANGULO"+t.area(3,5));
    }
    
}
