/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.Scanner;
public class Lista {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;  
        nome = null;
        int i,HED,HEN,ND,FAL,VAL = 0;
        float SAL,DE = 0,REF = 0,HOEX = 0,SALFAM = 0,SALBRUTO = 0,INAMPS = 0,FALTAS = 0,IMPOSTO = 0;
       for( i = 0; i < 2; i++){
                System.out.println("DIGITE SEU NOME:");
                nome = ler.next(/*nome*/);
                System.out.println("DIGITE SEU SALARIO:");
                SAL=ler.nextFloat();
                System.out.println("DIGITE SUAS HORAS EXTRAS DIURNAS:");
                HED=ler.nextInt();
                System.out.println("DIGITE SUAS HORAS EXTRAR NOTURNAS:");
                HEN=ler.nextInt();
                System.out.println("DIGITE SEU NUMERO DE DEPENDENTES:");
                ND=ler.nextInt();
                System.out.println("DIGITE SUAS FALTAS EM HORAS:");
                FAL=ler.nextInt();
                System.out.println("DIGITE SEUS DESCONTOS EVENTUAIS:");
                DE=ler.nextInt();
                System.out.println("DIGITE SEUS GASTOS FEITOS COM REFEICOES:");
                REF=ler.nextInt();
                System.out.println("DIGITE A QUANTIDADE DE VALES RETIRADOS POR MES:");
                VAL=ler.nextInt();
                HOEX=(float) (((HED * SAL) / 160) + ((HEN * 1.2 * SAL) / 160));
                SALFAM=(float) (ND*0.05*937);
                SALBRUTO=SAL+HOEX+SALFAM;
                INAMPS=(float) (0.08*SAL);
                FALTAS=(FAL*SAL)/160;
                IMPOSTO=(float) (0.08*SALBRUTO);
       }
       for(i=0;i<2;i++){
           System.out.println("NOME:"+nome);
           System.out.println("HORAS EXTRAS:"+HOEX);
           System.out.println("SALARIO FAMILIA:"+SALFAM);
           System.out.println("SALARIO BRUTO:"+SALBRUTO);
           System.out.println("DESCONTOS EFETUADOS:");
           System.out.println("INAMPS:"+INAMPS);
           System.out.println("FALTAS:"+FALTAS);
           System.out.println("GASTOS COM REFEICOES:"+REF);
           System.out.println("VALES RETIRADOS POR MES:"+VAL);
           System.out.println("DESCONTOS EVENTUAIS:"+DE);
           System.out.println("IMPOSTO DE RENDA:"+IMPOSTO);
       }     
        }
    }
    

