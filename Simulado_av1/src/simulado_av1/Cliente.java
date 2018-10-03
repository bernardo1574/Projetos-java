/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado_av1;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private boolean desconto;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public boolean getDesconto(){
        return desconto;
    }
    public void setDesconto(boolean desconto){
        this.desconto = desconto;
    }
    public void consultaCliente(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Cpf: "+this.getCpf());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Desconto: "+this.getDesconto());
    }
}
