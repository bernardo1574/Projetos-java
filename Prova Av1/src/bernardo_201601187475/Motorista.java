/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bernardo_201601187475;

/**
 *
 * @author Estacio
 */
public class Motorista {
    private String nome;
    private String cnh;
    
    public String getNome(){
        return nome; 
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCnh(){
        return cnh;
    }
    public void setCnh(String cnh){
        this.cnh = cnh;
    }
    
    public void dadosMotoristas(){
        System.out.println("**************");
        System.out.println("Nome: "+this.getNome() );
        System.out.println("Cnh: "+this.getCnh());
        System.out.println("**************");
    }
}
