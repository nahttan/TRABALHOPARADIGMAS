package classesprincipais;

import java.util.Scanner;

public class ProjetoFinal {

    public static void main(String[] args) {
     
         Scanner t = new Scanner(System.in);
         Menu m = new Menu();
         int opcao = 0;
         Cliente g = new Cliente();
         Cliente h = new Cliente();
         g.setNome("Aline");
         g.setSenha(121211);
         g.setCpf("1000112");
         g.setSexo("F");
         g.setIdade(19);
          h.setNome("Selma");
         h.setSenha(34753);
         h.setCpf("1023232");
         h.setSexo("F");
         h.setIdade(45);
    
         Celula lis = new Celula(5);
         lis.novoCliente(g);
         lis.novoCliente(h);
         lis.busca("Aline");
         lis.excluir("Aline");
          lis.exibirLista();
         
         
         
            /*do{   
           m.menu();
            opcao = t.nextInt();
            
              switch(opcao)
              {
                  case 1:
                          break;
                          case 2:
                                  
                                  break;
                                  case 3:
                                      break;
                                          case 4 :
                                              break;
                                                  case 5:
                                                      break;
                                                          case 6:
                                                              break;
                                                                  case 7:
                                                                      break;
                                                                  case 8:
                                                                      break;
                                                                  case 9 :
                                                                       break;
                                                                  case 10:
                                                                      break;
                                                                  case 11:
                                                                        break;
              
              
              }
               }while(opcao!=12);
         */
   
    }
    
}
