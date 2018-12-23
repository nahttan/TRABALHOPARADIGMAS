/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2.facil;

public class Q2FACIL {

    String nom;

    public String getNome() {
        return nom;
    }

    public void setNome(String nome) {
        this.nom = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Q2FACIL getPai() {
        return pai;
    }

    public void setPai(Q2FACIL pai) {
        this.pai = pai;
    }

    public Q2FACIL getMae() {
        return mae;
    }

    public void setMae(Q2FACIL mae) {
        this.mae = mae;
    }
    String nome;
    int idade;
    Q2FACIL pai;
    Q2FACIL mae;
    
}