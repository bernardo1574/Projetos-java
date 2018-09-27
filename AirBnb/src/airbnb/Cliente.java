/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;



/**
 *
 * @author bernardo
 */
public class Cliente {
    private int idcliente;
    private String nome;
    private String whatsapp;
    private String endereco;
    private String cpf;
    
    public int getId(){
        return idcliente;
    }
    public void setId(int id){
        this.idcliente = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getWhatsapp(){
        return whatsapp;
    }
    public void setWhatsapp(String whatsapp){
        this.whatsapp = whatsapp;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
