/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questaointerm;

/**
 *
 * @author aluno
 */
public class clienteBanco {
    int numero;
    float saldo;
    String tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "clienteBanco{" + "numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + '}';
    }
    
}
