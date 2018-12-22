
package classesprincipais;

public class Cliente extends Usuario {
    @Override
    public void apresentar()
    {System.out.println("Cliente:" + getNome());
    System.out.println("Sexo:" + getSexo());
    System.out.println("CPF:" + getCpf());
    System.out.println("Idade:" + getIdade());
   
    }
    
}
