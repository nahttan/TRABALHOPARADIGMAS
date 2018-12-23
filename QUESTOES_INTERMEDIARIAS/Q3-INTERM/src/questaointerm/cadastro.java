
package questaointerm;


public class cadastro {
    clienteBanco x[];
    int n;
    int y=0;
    public cadastro(int n){
        this.n=n;
        clienteBanco x[] = new clienteBanco[n];
       
    }

    public clienteBanco[] getX() {
        return x;
    }

    public void setX(clienteBanco[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void inserir(clienteBanco k){
    if(y==n){
        System.out.println("O CADASTRO ESTA CHEIO!!");
    }else{
        this.y++;
        this.x[this.y]=k;
        ordenar(this.x);
    }
}
    public void ordenar(clienteBanco x[]){
    
     int cont1, cont2;
     clienteBanco aux;
            for(cont1 =0; cont1<this.n; cont1++){
                for(cont2 =0; cont2 <this.n-1; cont2++){
                   if(x[cont2].numero > x[cont2+1].numero){
                        aux = x[cont2];
                        x[cont2] = x[cont2+1];
                        x[cont2+1] = aux;
                    }
                }
            }            
   }    
    
    
    
    
    }
