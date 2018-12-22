
package classesprincipais;

public class ListadeEspera {
     private Produto obj;
        private int quant;
        private float preco_total;

    public ListadeEspera(Produto obj, int quant) {
        this.obj = obj;
        this.quant = quant;
         setPreco_total(obj,quant);
    }

        
    public Produto getObj() {
        return obj;
    }

    public void setObj(Produto obj) {
        this.obj = obj;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getPreco_total() {
        return preco_total;
    }

   private void setPreco_total(Produto d1, int q) {
        this.preco_total = d1.getPreco_unitario() * q;
    }

    @Override
    public String toString() {
        return "ListadeEspera{" + "obj=" + obj + ", quant=" + quant + ", preco_total=" + preco_total + '}';
    }

    
    
        
}
