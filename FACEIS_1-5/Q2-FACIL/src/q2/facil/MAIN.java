

package q2.facil;
import java.util.Scanner;

public class MAIN  {
    
    public static void main(String[] args) {
        int controle,idad;
        String nome;
        Scanner input = new Scanner(System.in);
        Q2FACIL temp = new Q2FACIL();
        System.out.println("(qualquer numero inteiro)-Adicionar\n2-Sair");
        controle=input.nextInt();
        input.nextLine();
        
        while(controle!=2){
            
            System.out.println("Digitar nome");
            temp.nom=input.nextLine();
            System.out.println("Digitar idade");
            temp.idade=input.nextInt();
            temp.pai= new Q2FACIL();
            System.out.println("Digitar nome pai");
            input.nextLine();
            temp.pai.nom=input.nextLine();
            temp.mae= new Q2FACIL();
            System.out.println("Digitar nome mae");
            temp.mae.nom=input.nextLine();
            
            System.out.println("(qualquer numero inteiro)-Adicionar\n2-Sair");
            
            controle=input.nextInt();
            input.nextLine();
        }
        
    }
    
}
