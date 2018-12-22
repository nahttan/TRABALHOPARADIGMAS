package classesprincipais;

public abstract class Usuario {
      private String nome;
      private String sexo;
       private String cpf;
      private int idade;
      protected long senha;
     
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }

    
   public void apresentar()
    {System.out.println("Pessoa:" + getNome());
    System.out.println("Sexo:" + getSexo());
    System.out.println("CPF:" + getCpf());
    System.out.println("Idade:" + getIdade());
   
    }
          
    
}
