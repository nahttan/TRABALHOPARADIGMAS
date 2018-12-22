package classesprincipais;

public class Funcionario extends Usuario{
     private int codigo;
     @Override
     public void apresentar()
    {System.out.println("Funcionario:" + getNome());
    System.out.println("Sexo:" + getSexo());
    System.out.println("CPF:" + getCpf());
    System.out.println("Idade:" + getIdade());
    }
   
    
}
