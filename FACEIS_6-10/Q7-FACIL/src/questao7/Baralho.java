package questao7;
public class Baralho {
      //Carta c[];

    public Baralho(int n) {
          String nome[]={"´ÁS","DOIS","TRES","QUATRO","CINCO","SEIS","SETE","OITO","NOVE","DEZ","REI","VALETE","DAMA","CORINGA"};
          String naipe[]={"OURO","PAUS","COPAS","ESPADA"};
          Carta[] deck  = new Carta[52];
          for(int i=0;i<deck.length;i++)
          {
              deck[i] = new Carta(nome[i % 13],naipe[i/13]);
          }
        
        }
    public void embaralhar(Carta[] deck){
        
        for(int i=0;i<deck.length;i++){
            int u= (int) (Math.random()*51);
            Carta temp = deck[i];
            deck[i]= deck[u];
            deck[u]=temp;
        }
    
    }
    
    
    }
    

