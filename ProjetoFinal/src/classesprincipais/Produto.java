package classesprincipais;

public class Produto {
    private String descricao;
    private long codigo;
    private float preco_unitario;
    private int quantidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   public void vendeuProduto(int quant)
   {
      setQuantidade(getQuantidade() - quant);
   }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", codigo=" + codigo + ", preco_unitario=" + preco_unitario + ", quantidade=" + quantidade + '}';
    }
   
}
