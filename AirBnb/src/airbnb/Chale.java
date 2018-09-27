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
public class Chale {
    private int idChale;
    private int capacidade;
    private double preco;
    private String descricao;
    
    public int getId(){
        return idChale;
    }
    public void setId(int id){
        this.idChale = id;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco>30){
        this.preco = preco;
        
        }else{
        this.preco = 30;
        }
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public double gerarDesconto(Double desconto){
        double valorDesconto=0;
        if(desconto<preco){
            valorDesconto=this.preco-desconto;
        }else{
            System.out.println("Valor do desconto maior que o preço!");
        }
        return valorDesconto;
        }
}