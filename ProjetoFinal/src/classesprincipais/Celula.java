
package classesprincipais;


public class Celula {
      private Cliente info;
      private Cliente[] lista;
      private int qta;
      private int cap;

    public Cliente getInfo() {
        return info;
    }

    public void setInfo(Cliente info) {
        this.info = info;
    }

    public Cliente[] getLista() {
        return lista;
    }

    public void setLista(Cliente[] lista) {
        this.lista = lista;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }
    
    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public Celula(int cap) {
        this.lista = new Cliente[cap];
        this.qta = 0;
        this.cap = cap;
    }
      
public void novoCliente(Cliente a)
{ if(this.qta == (this.cap - 1))
 {System.out.println("Lista de cliente cheia");
}
else
{
   
    this.lista[this.qta] = a;
    this.qta++;
    System.out.println("CLIENTE ADICIONADO");
}

}

public void exibirLista()
{
    int i;
  for(i = 0 ; i<getQta();i++)
  { System.out.println("========================");
       this.lista[i].apresentar();
  }
}

public void busca(String a)
{
     for(int i = 0 ; i<getQta();i++)
     {
       if(a.equals(this.lista[i].getNome()))
       { System.out.println("Pessoa Encontrada");
           this.lista[i].apresentar();
       }
     }
     
}
public int posicao(String a)
{
     for(int i = 0 ; i<getQta();i++)
     {
       if(a.equals(this.lista[i].getNome()))
       { return i;
       }
     }
     return 0;
    
}
public void excluir(String a)
{
    int i = posicao(a);
    if(i == 0)
    { System.out.println("Pessoa não encotrada");}
    //else
    //{this.lista[i].apresentar();}
    if(i != this.qta )
    {
      for(int j = i;j<=getQta();j++)
      {
      this.lista[j] = this.lista[j+1];
      }
    }
    this.lista[this.qta] = null;
    this.qta--;
}




}
